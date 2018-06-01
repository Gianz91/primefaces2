package it.daguanno.corso.service.beans;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class GenericBean {
 
	public String getMessage() {
		System.out.println(new Date().getTime());
		System.out.println("JSF 2 + Spring Integration");
		return "JSF 2 + Spring Integration";
	}
 
}