package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_banda")
public class Banda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codBanda;
	private String nomeBanda;
	private BigDecimal precoBanda;
	
	@OneToMany(mappedBy="banda") 
	//Várias participacoes para uma banda

	private List<Participacao>participacoes;
	
	public Banda(){
		participacoes = new ArrayList<>();	
	}

	public Banda(Integer codBanda, String nomeBanda, BigDecimal precoBanda) {
		super();
		this.codBanda = codBanda;
		this.nomeBanda = nomeBanda;
		this.precoBanda = precoBanda;
		participacoes = new ArrayList<>();	
	}

	public Integer getCodBanda() {
		return codBanda;
	}

	public void setCodBanda(Integer codBanda) {
		this.codBanda = codBanda;
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public BigDecimal getPrecoBanda() {
		return precoBanda;
	}

	public void setPrecoBanda(BigDecimal precoBanda) {
		this.precoBanda = precoBanda;
	}

	public List<Participacao> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}
	
	public void addParticipacao(Participacao x) {
		this.participacoes.add(x);
	}
	
	public void removeParticipacao(Participacao x) {
		this.participacoes.remove(x);
	}	
	
}
