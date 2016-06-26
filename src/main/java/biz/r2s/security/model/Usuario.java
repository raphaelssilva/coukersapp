package biz.r2s.security.model;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.Unique;

import biz.r2s.util.model.PessoaFisica;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Usuario extends PessoaFisica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3950588971217487387L;
	
	@Persistent
	@Unique
	private String login;
	
	@Persistent
	private String senha;
	
	@Persistent
	@Unique
	private String token;
	
	@Persistent
	private String perguntaSecreta;
	
	@Persistent
	private String respostaSecreta;
	
	@Persistent
	private Boolean isAtivo;
		
/*	@Persistent(mappedBy="usuario", defaultFetchGroup="true", nullValue=NullValue.DEFAULT)
	@Element(dependent = "true")
	private List<Sessao> sessoes;
*/
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPerguntaSecreta() {
		return perguntaSecreta;
	}

	public void setPerguntaSecreta(String perguntaSecreta) {
		this.perguntaSecreta = perguntaSecreta;
	}

	public String getRespostaSecreta() {
		return respostaSecreta;
	}

	public void setRespostaSecreta(String respostaSecreta) {
		this.respostaSecreta = respostaSecreta;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	/*public List<Sessao> getSessoes() {
		return sessoes;
	}

	public void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}*/

}
