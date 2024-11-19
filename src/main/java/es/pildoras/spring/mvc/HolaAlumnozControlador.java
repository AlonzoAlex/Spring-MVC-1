package es.pildoras.spring.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnozControlador {

    @RequestMapping("/muestraFormulario")
    public String muestraFormulario(){
        //Proporciona el formulario
        return "HolaAlumnosFormulario";
    }

    @RequestMapping("/procesarFormulario")
    public String procesarFormulario(){

        return "HolaAlumnosSpring";
    }
    
    @RequestMapping("procesarFormulario2")
    public String otroProcesoFormulario(HttpServletRequest req, Model modelo){

        String nombre = req.getParameter("nombreAlumno");
        nombre += "Es el mejor alumno";
        //agregando informacion al modelo
        modelo.addAttribute("mensaje", nombre);
        return "HolaAlumnosSpring";
    }
}