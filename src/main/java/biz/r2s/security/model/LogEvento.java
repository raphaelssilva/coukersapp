package biz.r2s.security.model;

import javax.jdo.annotations.Persistent;

public class LogEvento extends Log {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2269679014607064944L;

	private LogEvento(){
		this.setTipoLog(TipoLog.EVENTO.getIdentificador());
	}	
	
	@Persistent 
	private String classe;

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
}