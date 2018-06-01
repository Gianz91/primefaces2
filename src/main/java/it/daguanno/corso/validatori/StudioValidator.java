package it.daguanno.corso.validatori;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("studioValidator")
public class StudioValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		// TODO Auto-generated method stub
		String idDataDa = (String) component.getAttributes().get("dataDaValid");
		if (idDataDa == null)
			try {
				throw new Exception("manca il campo dataDaValid");
			} catch (Exception e) {
				e.printStackTrace();
			}
		Date dataOrig = (Date) ((UIInput) component.getParent().findComponent(idDataDa)).getLocalValue();

		if (value == null || value.equals(dataOrig)) {
			FacesMessage msg = new FacesMessage("data non valida", "l'anno di conclusione non può essere uguale all'anno di inizio degli studi");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}

	}
}