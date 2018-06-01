package it.daguanno.corso.controller.beans;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
@Scope(value = "view")
public class ParamBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String param1;

	public void outcome() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
		System.out.println("param1 get " + params.get("param1"));
		System.out.println("param1 property " + param1);
	}

	public void outcome2(ActionEvent event) {
		System.out.println("param1 get " +  (String)event.getComponent().getAttributes().get("param1"));
		System.out.println("param1 property " + param1);
	}

	public void outcome3(String x) {
		System.out.println("x -->" + x);
	}
	
	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

}
