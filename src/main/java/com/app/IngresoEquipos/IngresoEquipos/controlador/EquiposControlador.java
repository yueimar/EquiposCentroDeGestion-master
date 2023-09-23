package com.app.IngresoEquipos.IngresoEquipos.controlador;

import com.app.IngresoEquipos.IngresoEquipos.entidad.Equipos;
import com.app.IngresoEquipos.IngresoEquipos.servicio.EquiposServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class EquiposControlador {

    @Autowired
    private EquiposServicio servicio;

    @GetMapping({"/equipos","/"})
    public String listarEquipos(Model modelo){
        modelo.addAttribute("equipos", servicio.listarTodosLosEquipos());
        return "equipos";
    }


    @GetMapping("equipos/filtrar")
    public String listarPorPalabraClave(Model modelo, @Param("palabraClave")String palabraClave){
        modelo.addAttribute("equipos", servicio.ListarEquiposPorPalabraClave(palabraClave));
        return "equipos";
    }

    @GetMapping("/equipos/nuevo")
    public String mostrarFormularioDeRegistrarEquipos(Model modelo){
        Equipos equipo = new Equipos();
        modelo.addAttribute("equipo",equipo);
        return "CrearEquipo";
    }

    @PostMapping("/equipos")
    public String guardarEquipo(@ModelAttribute("equipo") Equipos equipo, RedirectAttributes redirect){
        servicio.guardarEquipo(equipo);
        redirect.addFlashAttribute("msgExito","El equipo fue guardado con exito!!");
        return "redirect:/equipos";
    }

    @GetMapping("/equipos/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo){
       modelo.addAttribute("equipo",servicio.obtenerEquipoPorId(id));
       return "EditarEquipo";
    }

    @PostMapping("/equipos/{id}")
    public String actualizarEquipo(@PathVariable Long id, @ModelAttribute("equipo") Equipos equipo, Model modelo, RedirectAttributes redirect){
        Equipos equipoExistente = servicio.obtenerEquipoPorId(id);
        equipoExistente.setId(id);
        equipoExistente.setIp(equipo.getIp());
        equipoExistente.setNombre(equipo.getNombre());
        equipoExistente.setReferencia(equipo.getReferencia());
        equipoExistente.setNusuarios(equipo.getNusuarios());
        equipoExistente.setNodo(equipo.getNodo());
        equipoExistente.setReferencia(equipo.getReferencia());
        equipoExistente.setAutorizacion(equipo.getAutorizacion());
        servicio.actualizarEquipo(equipoExistente);
        redirect.addFlashAttribute("msgEditar","El equipo fue modificado con exito!!");
        return "redirect:/equipos";
    }

    @GetMapping("/equipos/{id}")
    public String eliminarEquipo(@PathVariable Long id, RedirectAttributes redirect){
        servicio.eliminarEstudiante(id);
        redirect.addFlashAttribute("msgDelete","El equipo fue eliminado con exito!!");
        return "redirect:/equipos";
    }

    @GetMapping("/home")
    public String retornarHome(){
        return "Nodo1/Nodo_1";
    }

    @GetMapping("/h")
    public String mostrarHome(){
        return "Home";
    }

    /*@GetMapping({"/equipoTest","/"})
    public void listarEquiposTest() {
        servicio.listarEquiposTest();
    }*/
}
