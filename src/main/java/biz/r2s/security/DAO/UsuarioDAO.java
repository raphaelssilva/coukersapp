package biz.r2s.security.DAO;

import org.springframework.stereotype.Repository;

import biz.r2s.security.model.Usuario;
import biz.r2s.util.persistencia.AbstractDAO;

@Repository
public class UsuarioDAO extends AbstractDAO<Usuario> {
	
	public Usuario getUsuarioByLogin(String login) {

		return null;

	}
}
