package biz.r2s.security.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import biz.r2s.util.model.JdoDBModel;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
@Inheritance(strategy=InheritanceStrategy.SUBCLASS_TABLE)
public class Log implements Serializable,JdoDBModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5303175611832559861L;
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private Date data;
	
	@Persistent
	private Long nivel;
	
	@Persistent
	private int prioridade;
	
	@Persistent
	private String mensagem;
	
	@Persistent
	private Long tipoLog;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Long getNivel() {
		return nivel;
	}
	public void setNivel(Long nivel) {
		this.nivel = nivel;
	}
	public Long getTipoLog() {
		return tipoLog;
	}
	public void setTipoLog(Long tipoLog) {
		this.tipoLog = tipoLog;
	}	
	
	public enum TipoLog{
		EVENTO(0L),
		ACESSO(1L);
		
		public Long id;
		TipoLog(Long id){
			this.id = id;
		}
		
		public Long getIdentificador(){
			return id;
		}
		
		public TipoLog getByIdentificador(Long identificador){
			return identificador<=TipoLog.values().length? TipoLog.values()[identificador.intValue()]:null;
		}
	}
	
	public enum Nivel{
		WARN(0L),
		TRACE(1L),
		OFF(2L),
		INFO(3L),
		FATAL(4L),
		ERROR(5L),
		DEBUG(6L),
		ALL(7L);
		
		public Long id;
		Nivel(Long id){
			this.id = id;
		}
		
		public Long getIdentificador(){
			return id;
		}
		
		public Nivel getByIdentificador(Long identificador){
			return identificador<=Nivel.values().length? Nivel.values()[identificador.intValue()]:null;
		}
	}
}