package biz.r2s.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.NullValue;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import biz.r2s.util.model.JdoDBModel;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Sessao implements Serializable,JdoDBModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private Usuario usuario;
	
	@Persistent
	private Date inicioAcesso;

	@Persistent
	private Date fimAcesso;
	
	@Persistent
	private String ip;
	
	@Persistent
	private String cookie;
	
	@Persistent
	private Boolean isAtivo;
	
	@Persistent(mappedBy="sessao", defaultFetchGroup="true", nullValue=NullValue.NONE)
	@Element(dependent = "true")
	private List<LogAcesso> logAcessoList;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getInicioAcesso() {
		return inicioAcesso;
	}
	public void setInicioAcesso(Date inicioAcesso) {
		this.inicioAcesso = inicioAcesso;
	}
	public Date getFimAcesso() {
		return fimAcesso;
	}
	public void setFimAcesso(Date fimAcesso) {
		this.fimAcesso = fimAcesso;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public List<LogAcesso> getLogAcessoList() {
		return logAcessoList;
	}
	public void setLogAcessoList(List<LogAcesso> logAcessoList) {
		this.logAcessoList = logAcessoList;
	}	
	
}
