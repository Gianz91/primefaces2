package it.daguanno.corso.controller.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
@Scope(value="view")
public class NavigationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean accettazione;

	public String vai() {
		return "vai";
	}
	
	public String vaiCondizionato() {
		return accettazione ? "vai" : "accettazione";
	}
	
	public boolean isAccettazione() {
		return accettazione;
	}

	public void setAccettazione(boolean accettazione) {
		this.accettazione = accettazione;
		System.out.println("accettazione " + accettazione);
	}

}