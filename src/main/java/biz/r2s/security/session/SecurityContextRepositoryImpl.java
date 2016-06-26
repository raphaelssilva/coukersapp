package biz.r2s.security.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.context.HttpRequestResponseHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;

public class SecurityContextRepositoryImpl extends HttpSessionSecurityContextRepository{

	@Override
	public boolean containsContext(HttpServletRequest arg0) {
		return super.containsContext(arg0);
	}

	@Override
	public SecurityContext loadContext(HttpRequestResponseHolder arg0) {
		return super.loadContext(arg0);
	}

	@Override
	public void saveContext(SecurityContext arg0, HttpServletRequest arg1,
			HttpServletResponse arg2) {				
		super.saveContext(arg0, arg1, arg2);
		
	}

}
