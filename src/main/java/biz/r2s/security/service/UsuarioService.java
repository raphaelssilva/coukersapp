package biz.r2s.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.security.DAO.UsuarioDAO;
import biz.r2s.security.model.Usuario;
import biz.r2s.util.service.ServiceCRUDAbstract;

@Component
public class UsuarioService extends ServiceCRUDAbstract<Usuario>{
	
	@Autowired
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.dao = usuarioDAO;
	}
	
	public Usuario getUsuarioByLogin(String login){
		return ((UsuarioDAO)dao).getUsuarioByLogin(login);
	}
}
