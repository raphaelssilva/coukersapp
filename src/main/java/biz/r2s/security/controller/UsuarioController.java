package biz.r2s.security.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.r2s.security.model.Usuario;
import biz.r2s.security.service.UsuarioService;
import biz.r2s.util.controller.ControllerCRUDAbstract;

@Controller
@RequestMapping(value="/admin/user")
public class UsuarioController extends ControllerCRUDAbstract<Usuario>{
	
	@Autowired
	public void setUsuarioService(UsuarioService usuarioService) {
		this.serviceCRUD = usuarioService;
		this.path = "user";
	}
}
