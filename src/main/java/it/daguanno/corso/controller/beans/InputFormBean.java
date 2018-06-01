package it.daguanno.corso.controller.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
@Scope(value="view")
public class InputFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String inputText;
	private String password;
	private String inputTextarea;
	private boolean checkbox;
	private List<String> manyCheckbox;
	private String selectOneRadio;
	private String selectOneMenu;
	private String selectOneListbox;
	private List<String> selectManyListbox;
	private String inputHidden;
	
	
	public void submit() {
		System.out.println(getElencoParametri());
	}

	private String getElencoParametri() {
		return 
		  "inputText         " + inputText         + " \n" 
		+ "password          " + password          + " \n" 
		+ "inputTextarea     " + inputTextarea     + " \n" 
		+ "checkbox          " + checkbox          + " \n" 
		+ "manyCheckbox      " + manyCheckbox      + " \n" 
		+ "selectOneRadio    " + selectOneRadio    + " \n" 
		+ "selectOneMenu     " + selectOneMenu     + " \n" 
		+ "selectOneListbox  " + selectOneListbox  + " \n" 
		+ "selectManyListbox " + selectManyListbox + " \n";
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInputTextarea() {
		return inputTextarea;
	}

	public void setInputTextarea(String inputTextarea) {
		this.inputTextarea = inputTextarea;
	}

	public boolean isCheckbox() {
		return checkbox;
	}

	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}

	public List<String> getManyCheckbox() {
		return manyCheckbox;
	}

	public void setManyCheckbox(List<String> manyCheckbox) {
		this.manyCheckbox = manyCheckbox;
	}

	public String getSelectOneRadio() {
		return selectOneRadio;
	}

	public void setSelectOneRadio(String selectOneRadio) {
		this.selectOneRadio = selectOneRadio;
	}

	public String getSelectOneMenu() {
		return selectOneMenu;
	}

	public void setSelectOneMenu(String selectOneMenu) {
		this.selectOneMenu = selectOneMenu;
	}

	public String getSelectOneListbox() {
		return selectOneListbox;
	}

	public void setSelectOneListbox(String selectOneListbox) {
		this.selectOneListbox = selectOneListbox;
	}

	public List<String> getSelectManyListbox() {
		return selectManyListbox;
	}

	public void setSelectManyListbox(List<String> selectManyListbox) {
		this.selectManyListbox = selectManyListbox;
	}

	public String getInputHidden() {
		return inputHidden;
	}

	public void setInputHidden(String inputHidden) {
		this.inputHidden = inputHidden;
	}
	
}