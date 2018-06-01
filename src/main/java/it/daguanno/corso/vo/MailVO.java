package it.daguanno.corso.vo;

public class MailVO {
	private String a;
	private String da;
	private String cc;
	private String oggetto;
	private String txt;

	public MailVO() {

	}
	
	public MailVO(String da, String cc, String oggetto) {
		this.da = da;
		this.cc = cc;
		this.oggetto = oggetto;
		this.txt = "SPAM";
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

}
