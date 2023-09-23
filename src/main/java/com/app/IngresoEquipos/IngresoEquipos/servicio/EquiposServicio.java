package com.app.IngresoEquipos.IngresoEquipos.servicio;

import com.app.IngresoEquipos.IngresoEquipos.entidad.Equipos;

import java.util.List;

public interface EquiposServicio {

 /* Aca se declara el metodo para luego ser implementado por la clase EquiposServicioImpl*/

    List<Equipos> listarTodosLosEquipos();

    List<Equipos> ListarEquiposPorPalabraClave(String palabraClave);

    /*
    * Aca le damos el comportamiento a los metodos
    * */

    Equipos guardarEquipo(Equipos equipo);

    Equipos obtenerEquipoPorId(Long id);

     Equipos actualizarEquipo(Equipos equipo);

     void eliminarEstudiante(Long id);

     //String listarEquiposTest();



}
