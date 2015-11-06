package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="tb_espetaculo")
public class Espetaculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codEspetaculo;
	private String nomeEspetaculo;
	
	@OneToMany
	@JoinColumn(name="espetaculo")
	private List<Participacao>participacoes;
	
	public Espetaculo(){
		participacoes = new ArrayList<>();
	}

	public Espetaculo(Integer codEspetaculo, String nomeEspetaculo) {
		super();
		this.codEspetaculo = codEspetaculo;
		this.nomeEspetaculo = nomeEspetaculo;
		participacoes = new ArrayList<>();
	}

	public Integer getCodEspetaculo() {
		return codEspetaculo;
	}

	public void setCodEspetaculo(Integer codEspetaculo) {
		this.codEspetaculo = codEspetaculo;
	}

	public String getNomeEspetaculo() {
		return nomeEspetaculo;
	}

	public void setNomeEspetaculo(String nomeEspetaculo) {
		this.nomeEspetaculo = nomeEspetaculo;
	}

	public List<Participacao> getEspetaculos() {
		return participacoes;
	}

	public void setEspetaculos(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}
	
	
}
