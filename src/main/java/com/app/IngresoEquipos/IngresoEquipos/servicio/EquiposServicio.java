package com.app.IngresoEquipos.IngresoEquipos.servicio;

import com.app.IngresoEquipos.IngresoEquipos.entidad.Equipos;

import javax.swing.plaf.PanelUI;
import java.util.List;

public interface EquiposServicio {


    List<Equipos> listarTodosLosEquipos();

    public Equipos guardarEquipo(Equipos equipo);

    public Equipos obtenerEquipoPorId(Long id);

    public Equipos actualizarEstudiante(Equipos equipo);

    public void eliminarEstudiante(Long id);

}
