package it.daguanno.corso.controller.beans;

import it.daguanno.corso.service.beans.GenericBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
@Scope(value = "view")
public class TabellaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Oggetto> lstOggetti = new ArrayList<Oggetto>();

	private Integer id;
	private String valore;
	@Autowired
	private GenericBean gb;

	public void aggiungi() {
		Oggetto oggetto = new Oggetto();
		oggetto.setId(id);
		oggetto.setValore(valore);
		oggetto.setDate(new Date());
		lstOggetti.add(oggetto);
		id = null;
		valore = null;
		gb.getMessage();
	}

	@PostConstruct
	public void generaElenco() {

		for (int i = 0; i < 10; i++) {
			Oggetto oggetto = new Oggetto();
			oggetto.setId(i);
			oggetto.setValore("valore" + i);
			oggetto.setDate(new Date());
			lstOggetti.add(oggetto);
		}

	}

	public static class Oggetto {

		private Integer id;
		private String valore;
		private Date date;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getValore() {
			return valore;
		}

		public void setValore(String valore) {
			this.valore = valore;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

	}

	public List<Oggetto> getLstOggetti() {
		return lstOggetti;
	}

	public void setLstOggetti(List<Oggetto> lstOggetti) {
		this.lstOggetti = lstOggetti;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

}