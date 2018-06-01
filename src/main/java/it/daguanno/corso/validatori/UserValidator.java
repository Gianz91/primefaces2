package it.daguanno.corso.validatori;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("userValidator")
public class UserValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent comp, Object val) throws ValidatorException {
		// if(val== null || comp.getAttributes()..equals(comp.getAttributes().get("")))
		String idPassOrig = (String)comp.getAttributes().get("passOriginale");
		if(idPassOrig == null)
			try {
				throw new Exception("manca il campo passOriginale");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String passOrig = (String)((UIInput)comp.getParent().findComponent(idPassOrig)).getLocalValue();
		if (val == null || !passOrig.equals(val.toString())) {

			FacesMessage msg = new FacesMessage("test non valido", "test non valido");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);

		}

	}

}
