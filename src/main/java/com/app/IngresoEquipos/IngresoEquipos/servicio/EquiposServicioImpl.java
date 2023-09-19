package com.app.IngresoEquipos.IngresoEquipos.servicio;

import com.app.IngresoEquipos.IngresoEquipos.entidad.Equipos;
import com.app.IngresoEquipos.IngresoEquipos.repositorio.EquiposRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquiposServicioImpl implements EquiposServicio {

    @Autowired
    private EquiposRepositorio repositorio;

    /*
    * Aca le damos el comportamiento a los metodos
    * */
    @Override
    public List<Equipos> listarTodosLosEquipos() {

        /*
        if (palabraClave != null) {
            return repositorio.findAll(palabraClave);
        }

         */
        List<Equipos> equiposEncontrados = repositorio.findAll();

        return equiposEncontrados;
    }

    @Override
    public Equipos guardarEquipo(Equipos equipo) {
        return repositorio.save(equipo);
    }
    @Override
    public Equipos obtenerEquipoPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Equipos actualizarEstudiante(Equipos equipo) {
        return repositorio.save(equipo);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repositorio.deleteById(id);
    }

    /*@Override
    public String listarEquiposTest() {
        List<Equipos> equiposEncontrados = repositorio.findAll();
        model.addAttribute("equipos", equiposEncontrados);
        return "equipos";
    }*/


}
