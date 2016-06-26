package biz.r2s.util.model;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
@Inheritance(strategy=InheritanceStrategy.SUBCLASS_TABLE)
public class PessoaJuridica extends Pessoa{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1135244115308347097L;
	
	@Persistent
	private int cnpj;	 
	@Persistent
	private int razaoSocial;
	@Persistent
	private int inscricaoEstatual;
	@Persistent
	private int inscricaoMunicipal;
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(int razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getInscricaoEstatual() {
		return inscricaoEstatual;
	}
	public void setInscricaoEstatual(int inscricaoEstatual) {
		this.inscricaoEstatual = inscricaoEstatual;
	}
	public int getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(int inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}	
}
 
