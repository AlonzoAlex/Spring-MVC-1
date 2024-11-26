package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class ControladorAlumno {
    
    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(Model modelo){
        Alumno a1Object = new Alumno();
        modelo.addAttribute("a1Name", a1Object);
        return("alumnoRegistrado");
    } 

    @RequestMapping("/procesarFormulario")
    public String procesarFormulario(@ModelAttribute("a1Name") Alumno a1name){
        return "confirmacionRegistroAlumno";
    }
}
