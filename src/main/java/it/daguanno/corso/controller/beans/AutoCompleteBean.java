package it.daguanno.corso.controller.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoCompleteBean {
	private List<String> hints;
	private String singleHint;
	private String txt1;
	private List<String> hinted = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		this.hints = new ArrayList<>();
		hints.add("AA");
		hints.add("AB");
		hints.add("AC");
		hints.add("BA");
		hints.add("BB");
		hints.add("BC");
		hints.add("DD");
	}
	
	 public List<String> completeText(String query) {
	        List<String> results = new ArrayList<String>();
	        for(int i = 0; i < 10; i++) {
	            results.add(query + i);
	        }
	         
	        return results;
	    }
	     

	public List<String> getHints() {
		return hints;
	}

	public void setHints(List<String> hints) {
		this.hints = hints;
	}

	public String getSingleHint() {
		return singleHint;
	}

	public void setSingleHint(String singleHint) {
		this.singleHint = singleHint;
	}
	public List<String> complete(String hint){
		List<String> result = new ArrayList<>();
		for(String h : hints) {
			if(h.startsWith(hint.toUpperCase())) {
				result.add(h);
			}
		}
		hinted = new ArrayList<>(result);
		return result;
	}




	

	@Override
	public String toString() {
		return "AutoCompleteBean [singleHint=" + singleHint + ", hinted=" + hinted + "]";
	}

	public String getTxt1() {
		return txt1;
	}

	public void setTxt1(String txt1) {
		this.txt1 = txt1;
	}
	
}
