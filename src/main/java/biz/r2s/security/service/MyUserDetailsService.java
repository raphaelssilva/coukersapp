package biz.r2s.security.service;

import java.util.Arrays;

import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import biz.r2s.security.model.Usuario;
import biz.r2s.util.SpringBeansFactory;

@SuppressWarnings("deprecation")
@Component("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {

	static String USER_DEFAULT = "admin";
	static String PASS_DEFAULT = "r19892";

	@Override
	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {

		if (login == null || login.isEmpty()) {
			throw new UsernameNotFoundException("Login Vazio");
		}

		User user = null;

		if (login.equals(USER_DEFAULT)) {
			user = new User(USER_DEFAULT, PASS_DEFAULT, true, true, true, true,
					Arrays.asList(new GrantedAuthorityImpl("ROLE_ADMIN"),
							new GrantedAuthorityImpl("ROLE_USER")));
		} else {

			UsuarioService usuarioService = SpringBeansFactory
					.getBean(UsuarioService.class);

			Usuario usuario = usuarioService.getUsuarioByLogin(login);

			if (usuario == null || login.isEmpty()) {
				throw new UsernameNotFoundException("Usuario Invalido");
			}

			user = new User(usuario.getLogin(), usuario.getSenha(),
					usuario.getIsAtivo(), true, true, true,
					Arrays.asList(new GrantedAuthorityImpl("ROLE_USER")));
		}
		return user;
	}

}
