package it.daguanno.corso.controller.beans;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import it.daguanno.corso.vo.MailVO;

@ManagedBean
@ViewScoped
public class MailBean {
	private String a;
	private String da;
	private String cc;
	private String oggetto;
	private String txt;
	private String srchOggetto;
	private String srchDa;
	private List<MailVO> lstMail;
	private List<MailVO> lstArrived;
	private List<MailVO> oldLstArrived;

	@PostConstruct
	public void init() {
		lstArrived = new LinkedList<>();
		lstMail = new LinkedList<>();
		for (int i = 0; i < 1000; i++) {
			lstArrived.add(new MailVO("roberto carlino" + i, "others", "il mercato immobiliare"));
			MailVO mvo = new MailVO();
			mvo.setA("user" + i);
			mvo.setCc("others");
			mvo.setOggetto("hi dude!" + i);
			mvo.setTxt("hello World" + i);
			lstMail.add(mvo);
		}
	}

	public void cestina(MailVO m) {
		lstArrived.remove(m);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cerca() {
		if (oldLstArrived != null) {
			lstArrived = new LinkedList<MailVO>(oldLstArrived);
		}
		List<MailVO> result = new LinkedList<>();
		for (MailVO mvo : lstArrived) {
			boolean esito = true;
			if (srchDa != null && !mvo.getDa().startsWith(srchDa)) {
				esito = false;
			}
			if (srchOggetto!= null && !mvo.getOggetto().startsWith(srchOggetto)) {
				esito = false;
			}
			
			if (esito) {
				result.add(mvo);
			}
		}
		oldLstArrived = new LinkedList<MailVO>(lstArrived);
		lstArrived = new LinkedList<MailVO>(result);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void invia() {
		MailVO mvo = new MailVO();
		mvo.setA(this.a);
		mvo.setCc(this.cc);
		mvo.setOggetto(this.oggetto);
		mvo.setTxt(this.txt);
		lstMail.add(mvo);
		System.out.println(this);
		setA("");
		setCc("");
		setOggetto("");
		setTxt("");
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
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

	public String getSrchOggetto() {
		return srchOggetto;
	}

	public void setSrchOggetto(String srchOggetto) {
		this.srchOggetto = srchOggetto;
	}

	public String getSrchDa() {
		return srchDa;
	}

	public void setSrchDa(String srchDa) {
		this.srchDa = srchDa;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public List<MailVO> getLstMail() {
		return lstMail;
	}

	public void setLstMail(List<MailVO> lstMail) {
		this.lstMail = lstMail;
	}

	public String getDa() {
		return da;
	}

	public void setDa(String da) {
		this.da = da;
	}

	public List<MailVO> getOldLstArrived() {
		return oldLstArrived;
	}

	public void setOldLstArrived(List<MailVO> oldLstArrived) {
		this.oldLstArrived = oldLstArrived;
	}

	public List<MailVO> getLstArrived() {
		return lstArrived;
	}

	public void setLstArrived(List<MailVO> lstArrived) {
		this.lstArrived = lstArrived;
	}

	@Override
	public String toString() {
		return "MailBean [a=" + a + ", cc=" + cc + ", oggetto=" + oggetto + ", txt=" + txt + "]";
	}

}
