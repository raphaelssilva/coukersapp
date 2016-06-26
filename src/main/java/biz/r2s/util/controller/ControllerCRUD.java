package biz.r2s.util.controller;

import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

public interface ControllerCRUD<T> {
	
	public String index(ModelMap modelMap);
	public String indexB(ModelMap modelMap);
	public String getFormNew(ModelMap modelMap);
	public String getFormEdit(@RequestParam Long id, ModelMap modelMap);
	public String list(ModelMap modelMap);
	public String save(@RequestParam Long id, @ModelAttribute T obj, BindingResult result, SessionStatus status, ModelMap modelMap);
	public String delete(@RequestParam Long id, SessionStatus status, ModelMap modelMap);
	public String find(@RequestParam Long id, ModelMap modelMap);
	List<T> listAjax();
	T saveAjax(T obj);
	T deleteAjax(Long id);
	T findAjax(Long id);
	
	
}
