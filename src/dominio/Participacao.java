package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="tb_participacao")
public class Participacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codApresentacao;
	private Integer ordem;
	
	@ManyToOne
	@JoinColumn(name="espetaculo")
	private Espetaculo espetaculo;
	@ManyToOne
	@JoinColumn(name="banda")
	private Banda banda;
	
	public Participacao(){
		
	}

	public Participacao(Integer codApresentacao, Integer ordem, Espetaculo espetaculo, Banda banda) {
		super();
		this.codApresentacao = codApresentacao;
		this.ordem = ordem;
		this.espetaculo = espetaculo;
		this.banda = banda;
	}

	public Integer getCodApresentacao() {
		return codApresentacao;
	}

	public void setCodApresentacao(Integer codApresentacao) {
		this.codApresentacao = codApresentacao;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public Espetaculo getEspetaculo() {
		return espetaculo;
	}

	public void setEspetaculo(Espetaculo espetaculo) {
		this.espetaculo = espetaculo;
	}

	public Banda getBanda() {
		return banda;
	}

	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	
	
	
}
