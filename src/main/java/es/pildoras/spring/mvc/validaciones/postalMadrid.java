package es.pildoras.spring.mvc.validaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CPostalMadridValidacion.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface postalMadrid {
    //definir el codigo psotal por defecto
    public String value() default "28";

    //definir el mensaje de error
    public String message() default "El CP debe comenzar con 28";

    //definir los grupos
    Class<?>[] groups() default {};

    //definir los parloads
    Class<? extends Payload>[] payload() default {};
}
