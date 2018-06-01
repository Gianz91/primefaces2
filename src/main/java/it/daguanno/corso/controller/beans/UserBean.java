package it.daguanno.corso.controller.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UserBean {
	private String nome;
	private String password;
	private String confirmPassword;
	private Date dataDiNascita;
	private Date today;
	private Date annoInizio;
	private Date annoFine;
	
	@PostConstruct
	public void init() {
		this.today = new Date();
		
	}

	public void submit() {
		System.out.println(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public Date getAnnoInizio() {
		return annoInizio;
	}

	public void setAnnoInizio(Date annoInizio) {
		this.annoInizio = annoInizio;
	}

	public Date getAnnoFine() {
		return annoFine;
	}

	public void setAnnoFine(Date annoFine) {
		this.annoFine = annoFine;
	}

	@Override
	public String toString() {
		return "UserBean [nome=" + nome + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", dataDiNascita=" + dataDiNascita + "]";
	}

}
