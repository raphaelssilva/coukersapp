package biz.r2s.security.model;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;


@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LogAcesso extends Log {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3408941330775185812L;

	public LogAcesso(){
		this.setTipoLog(TipoLog.ACESSO.getIdentificador());
	}
	
	@Persistent
	private Sessao sessao;

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

}
