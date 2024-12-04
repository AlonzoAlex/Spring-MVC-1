package es.pildoras.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class ControladorAlumno {

    @InitBinder
    public void recortarString(WebDataBinder binder){
        StringTrimmerEditor recortarEspacios = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, recortarEspacios);
    }
    
    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(Model modelo){
        Alumno a1Object = new Alumno();
        modelo.addAttribute("a1Name", a1Object);
        return("registroAlumno");
    } 

    @RequestMapping("/procesarFormulario")
    public String procesarFormulario(@Valid @ModelAttribute("a1Name") Alumno a1name, BindingResult resultadoValidacion){
        if(resultadoValidacion.hasErrors()){
            return "registroAlumno"   ;
        }else{
            return "confirmacionRegistroAlumno";
        }
    }
}
