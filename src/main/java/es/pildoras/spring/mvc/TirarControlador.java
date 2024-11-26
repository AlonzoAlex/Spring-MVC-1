package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundario")
public class TirarControlador {
    @RequestMapping("MuestraFormulario")
    public String muestraFormulario(){
        return "HolaAlumnosFormulario";
    }

    @RequestMapping("/procesarFormulario2")
    public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo){
        nombre += " es el peor alumno";
        //agregando informacion al modelo
        modelo.addAttribute("mensaje", nombre);
        return "HolaAlumnosSpring";
    }
}
