package it.daguanno.corso.controller.beans;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.context.RequestContext;

import it.daguanno.corso.vo.MessVO;

@ManagedBean
@ApplicationScoped
public class ChatBean {
	private String mess;
	private String sender;
	private List<MessVO> trail;
	private String msgHtml;

	@PostConstruct
	public void init() {
		trail = new LinkedList<>();
	}

	public void insert() {
		MessVO msv = new MessVO();
		setMsgHtml(this.sender + ": " + this.mess);
		msv.setMessaggio(msgHtml);
		trail.add(msv);
	}
	public void retrieve() {
		this.trail = getTrail();
	}
	public String nomeCheVoglio() {
		RequestContext.getCurrentInstance().execute("aMiaScelta();");
		return "mailpage";
	}
	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public List<MessVO> getTrail() {
		return trail;
	}

	public void setTrail(List<MessVO> trail) {
		this.trail = trail;
	}

	public String getMsgHtml() {
		return msgHtml;
	}

	public void setMsgHtml(String msgHtml) {
		this.msgHtml = msgHtml;
	}

}
