package br.usjt.previsoes.model;

import java.io.Serializable;

import br.usjt.previsoes.model.DiaSemana;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_previsao")
public class Previsao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "ID_DIASEMANA")
	private DiaSemana diaSemana;
	
	@Column(name = "TEMPMINIMA")
	private Double tempMinima;
	
	@Column(name = "TEMPMAXIMA")
	private Double tempMaxima;
	
	@Column(name = "UMIDADE")
	private Double umidadeAr;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "DATAHORA")
	private String dataHora;
	
	@Column(name = "LATITUDE")
	private String latitude;
	
	@Column(name = "LONGITUDE")
	private String longitude;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Double getTempMinima() {
		return tempMinima;
	}
	public void setTempMinima(Double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public Double getTempMaxima() {
		return tempMaxima;
	}
	public void setTempMaxima(Double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public Double getUmidadeAr() {
		return umidadeAr;
	}
	public void setUmidadeAr(Double umidadeAr) {
		this.umidadeAr = umidadeAr;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
