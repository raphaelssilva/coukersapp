package biz.r2s.util.controller;

import java.lang.reflect.ParameterizedType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import biz.r2s.util.CommonsUtil;
import biz.r2s.util.model.JdoDBModel;
import biz.r2s.util.service.ServiceCRUD;

public abstract class ControllerCRUDAbstract<T> implements ControllerCRUD<T> {
	
	private Class<T> classe;
	
	protected ServiceCRUD<T> serviceCRUD;
	protected String path;
	
	@SuppressWarnings("unchecked")
	public ControllerCRUDAbstract(){
		this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

	
	@Override
	@RequestMapping(value="")
	public String index(ModelMap modelMap) {
		List<T> objList = serviceCRUD.listar();
		modelMap.addAttribute("list"+classe.getSimpleName(),objList);
		return "redirect:list";
	}
	
	@Override
	@RequestMapping(value="/")
	public String indexB(ModelMap modelMap) {
		List<T> objList = serviceCRUD.listar();
		modelMap.addAttribute("list"+classe.getSimpleName(),objList);
		return "redirect:list";
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@RequestMapping("/new")
	public String getFormNew(ModelMap modelMap) {
		T obj = (T) CommonsUtil.newObjeto(classe);
		modelMap.addAttribute(classe.getSimpleName().toLowerCase(),obj);		
		return path+"/form";
	}

	@Override
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String getFormEdit(Long id, ModelMap modelMap) {
		
		T objReturn = serviceCRUD.consultar(id);
		modelMap.addAttribute(classe.getSimpleName().toLowerCase(),objReturn);
		return path+"/form";
	}

	@Override
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(ModelMap modelMap) {
		List<T> objList = serviceCRUD.listar();
		modelMap.addAttribute("list"+classe.getSimpleName(),objList);
		return path+"/list";
	}

	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(Long id, T obj, BindingResult result, SessionStatus status, ModelMap modelMap) {
		
		T objeto = null;
		
		if(id==null){
			objeto = serviceCRUD.inserir(obj);
		}
		else{
			((JdoDBModel)obj).setId(id);
			objeto = serviceCRUD.alterar(obj);
		}
		
		if(objeto==null){
			
			modelMap.addAttribute(classe.getSimpleName(),obj);
			modelMap.addAttribute("error", "Erro ao salvar objeto");
			return path+"/form";
		}
		return "redirect:list";
	}

	@Override
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(Long id, SessionStatus status, ModelMap modelMap) {
		serviceCRUD.excluir(serviceCRUD.consultar(id));
		return "redirect:list";
	}

	@Override
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public String find(Long id, ModelMap modelMap) {
		T objReturn = serviceCRUD.consultar(id);
		modelMap.addAttribute(classe.getSimpleName(),objReturn);
		return path+"/find";
	}
	
	
	/*public T mergeObject(T obj1, T obj2 ){
		
	}*/
	
	@RequestMapping(value="/listAjax", method=RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<T> listAjax() {
		return serviceCRUD.listar();
	}

	@Override
	@RequestMapping(value="/saveAjax", method=RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody T saveAjax(T obj) {
		try{
			if(obj.getClass().getMethod("getId").invoke(obj)==null){
				return serviceCRUD.inserir(obj);
			}
			else{
				return serviceCRUD.alterar(obj);
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	@RequestMapping(value="/deleteAjax", method=RequestMethod.GET)
	public @ResponseBody T deleteAjax(Long id) {
		serviceCRUD.excluir(serviceCRUD.consultar(id));
		return serviceCRUD.consultar(id);
	}

	@Override
	@RequestMapping(value="/findAjax", method=RequestMethod.GET)
	public T findAjax(Long id) {
		return serviceCRUD.consultar(id);
	}
}
