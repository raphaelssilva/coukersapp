package biz.r2s.security.session;

import java.util.List;

import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistryImpl;

public class SessionRegistryWapper extends SessionRegistryImpl{

	@Override
	public List<Object> getAllPrincipals() {
		return super.getAllPrincipals();
	}

	@Override
	public List<SessionInformation> getAllSessions(Object arg0, boolean arg1) {
		return super.getAllSessions(arg0, arg1);
	}

	@Override
	public SessionInformation getSessionInformation(String arg0) {
		return super.getSessionInformation(arg0);
	}

	@Override
	public void refreshLastRequest(String arg0) {
		super.refreshLastRequest(arg0);
		
	}

	@Override
	public void registerNewSession(String arg0, Object arg1) {
		super.registerNewSession(arg0, arg1);
		
	}

	@Override
	public void removeSessionInformation(String arg0) {
		super.removeSessionInformation(arg0);
		
	}

}
