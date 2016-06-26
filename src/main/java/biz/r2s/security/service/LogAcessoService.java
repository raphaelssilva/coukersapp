package biz.r2s.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.security.DAO.LogAcessoDAO;
import biz.r2s.security.model.LogAcesso;
import biz.r2s.util.service.ServiceCRUDAbstract;

@Component
public class LogAcessoService extends ServiceCRUDAbstract<LogAcesso> {
	
	@Autowired
	public void setLogAcessoDAO(LogAcessoDAO logAcessoDAO){
		this.dao = logAcessoDAO;
	}
}
