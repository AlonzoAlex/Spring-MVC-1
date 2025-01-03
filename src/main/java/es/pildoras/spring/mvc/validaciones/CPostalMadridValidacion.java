package es.pildoras.spring.mvc.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<postalMadrid, String>{

    private String prefijoCodigoMadrid;

    @Override
    public void initialize(postalMadrid elcodigo){
        prefijoCodigoMadrid = elcodigo.value();
    }

    @Override
    public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
        boolean valCodigo=false;
        if(arg0!=null) valCodigo=arg0.startsWith(prefijoCodigoMadrid);
        else return valCodigo=true;

        return valCodigo;
    }
    
}
