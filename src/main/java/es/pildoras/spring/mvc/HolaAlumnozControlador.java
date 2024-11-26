package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
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
    
    @RequestMapping("/procesarFormulario2")
    //public String otroProcesoFormulario(HttpServletRequest req, Model modelo){
    public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo){
        //COMENTADO PUES SE CAMBIO DE HTTPSERLVLETREQUEST A @REQUESTPARAM
        //String nombre = req.getParameter("nombreAlumno");
        nombre += " es el mejor alumno";
        //agregando informacion al modelo
        modelo.addAttribute("mensaje", nombre);
        return "HolaAlumnosSpring";
    }
}