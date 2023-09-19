package com.app.IngresoEquipos.IngresoEquipos.servicio;

import com.app.IngresoEquipos.IngresoEquipos.entidad.Equipos;
import org.springframework.ui.Model;

import javax.swing.plaf.PanelUI;
import java.util.List;

public interface EquiposServicio {

 /* Aca se declara el metodo para luego ser implementado por la clase EquiposServicioImpl*/

    List<Equipos> listarTodosLosEquipos();

     Equipos guardarEquipo(Equipos equipo);

    Equipos obtenerEquipoPorId(Long id);

     Equipos actualizarEstudiante(Equipos equipo);

     void eliminarEstudiante(Long id);

     //String listarEquiposTest();



}
