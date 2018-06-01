package it.daguanno.corso.controller.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoBean {
	@ManagedProperty("#{autoCompleteBean}")
	private AutoCompleteBean autoCompleteBean;
	private boolean nascosto;
	private int counter;
	
	@PostConstruct
	public void init() {
		nascosto = false;
		counter = 0;
	}
	public void mostra() {
		setNascosto(!nascosto);
	}
	public void incrementa() {
		++counter;
	}

	public AutoCompleteBean getAutoCompleteBean() {
		return autoCompleteBean;
	}

	public void setAutoCompleteBean(AutoCompleteBean autoCompleteBean) {
		this.autoCompleteBean = autoCompleteBean;
	}

	@Override
	public String toString() {
		return "AutoBean [autoCompleteBean=" + autoCompleteBean + "]";
	}

	public void inserisci() {
		System.out.println(this);
	}

	public boolean isNascosto() {
		return nascosto;
	}

	public void setNascosto(boolean nascosto) {
		this.nascosto = nascosto;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}

}
