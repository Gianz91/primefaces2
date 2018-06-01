package org.primefaces.spring.scope;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ViewScope implements Scope {

	public Object get(String name, ObjectFactory objectFactory) {
		Map<String, Object> viewMap = FacesContext.getCurrentInstance()
				.getViewRoot().getViewMap();

		if (viewMap.containsKey(name)) {
			return viewMap.get(name);
		} else {
			Object object = objectFactory.getObject();
			viewMap.put(name, object);

			return object;
		}
	}

	public Object remove(String name) {
		System.out.println(name);
		return FacesContext.getCurrentInstance().getViewRoot().getViewMap()
				.remove(name);
	}

	public String getConversationId() {
		return null;
	}

	public void registerDestructionCallback(String name, Runnable callback) {
		// Not supported
	}

	public Object resolveContextualObject(String key) {
		return null;
	}
	// public final String VIEW_SCOPE_KEY = "view";
	//
	// public Object get(String name, ObjectFactory objectFactory) {
	// if (FacesContext.getCurrentInstance().getViewRoot() != null) {
	// Map<String, Object> viewScope = extractViewScope();
	//
	// if (viewScope.get(name) == null) {
	// Object object = objectFactory.getObject();
	// viewScope.put(name, object);
	// return object;
	// } else {
	// return viewScope.get(name);
	// }
	// } else {
	// System.out.println("################ : GET VIEW ROOT NOT FOUND");
	// return null;
	// }
	//
	// }
	//
	// @SuppressWarnings("unchecked")
	// private Map<String, Object> extractViewScope() {
	// Map<String, Object> attributes = FacesContext.getCurrentInstance()
	// .getViewRoot().getAttributes();
	//
	// Map<String, Object> viewScope = null;
	//
	// if (attributes.get(VIEW_SCOPE_KEY) == null) {
	// viewScope = new HashMap<String, Object>();
	// attributes.put(VIEW_SCOPE_KEY, viewScope);
	// } else {
	// viewScope = (Map<String, Object>) attributes.get(VIEW_SCOPE_KEY);
	// }
	// return viewScope;
	// }
	//
	// public String getConversationId() {
	// return null;
	// }
	//
	// public void registerDestructionCallback(String name, Runnable callback) {
	// System.out
	// .println("#####################: We don't support destruction callbacks at this time");
	// }
	//
	// public Object remove(String name) {
	// if (FacesContext.getCurrentInstance().getViewRoot() != null) {
	// Map<String, Object> viewScope = extractViewScope();
	// System.out.println("################ : REMOVE " + name);
	// return viewScope.remove(name);
	// } else {
	// System.out.println("################ : REMOVE VIEW ROOT NOT FOUND");
	// return null;
	// }
	// }
	//
	// @Override
	// public Object resolveContextualObject(String arg0) {
	// System.out.println("################ : resolveContextualObject " + arg0
	// );
	// return null;
	// }
}