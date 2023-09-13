package com.app.IngresoEquipos.IngresoEquipos.repositorio;

import com.app.IngresoEquipos.IngresoEquipos.entidad.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquiposRepositorio extends JpaRepository<Equipos, Long> {

/*
    @Query("SELECT e FROM Equipos e WHERE e.nombre LIKE %?1%"
    +"OR e.ip LIKE %?1%"
            +"OR e.nombre LIKE %?1%")
    public List<Equipos> findAll(String palabraClave);

 */
}
