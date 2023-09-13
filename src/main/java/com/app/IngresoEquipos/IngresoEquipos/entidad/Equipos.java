package com.app.IngresoEquipos.IngresoEquipos.entidad;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "radio")
public class Equipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "referencia", nullable = false, length = 50)
    private String referencia;


    @Column(name = "ip", nullable = false, length = 50, unique = true)
    private String ip;

    @Column(name = "Nusuarios", nullable = false, length = 50)
    private int Nusuarios;

    @Column(name = "fechaRegistro")
    private LocalDateTime fechaRegistro;


    /*
    @Column(name = "REGIST_DATE",nullable = false)
    @Temporal(TemporalType.DATE)
    private String registDate;
    */

    public Equipos(){

    }

    public Equipos(Long id, String nombre, String referencia, String ip, int nusuarios, LocalDateTime fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.referencia = referencia;
        this.ip = ip;
        Nusuarios = nusuarios;
        this.fechaRegistro = fechaRegistro;
    }

    public Equipos(String nombre, String referencia, String ip, int nusuarios, LocalDateTime fechaRegistro) {
        this.nombre = nombre;
        this.referencia = referencia;
        this.ip = ip;
        Nusuarios = nusuarios;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getNusuarios() {
        return Nusuarios;
    }

    public void setNusuarios(int nusuarios) {
        Nusuarios = nusuarios;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /*Significa que persistentemente va a actualizar la fecha y hora*/
    @PrePersist
    public void asignarFechaRegistro(){
        fechaRegistro = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", referencia='" + referencia + '\'' +
                ", ip='" + ip + '\'' +
                ", Nusuarios='" + Nusuarios + '\'' +
                '}';
    }
}
