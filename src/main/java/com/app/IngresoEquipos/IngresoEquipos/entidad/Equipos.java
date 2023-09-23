package com.app.IngresoEquipos.IngresoEquipos.entidad;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity /*Se aplica a la clase e indica que esta clase Java es una entidad a persistir. Es una anotación estándar de JPA.
En nuestro ejemplo estamos indicando que la clase Equipos es una entidad que se puede persistir.*/
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

    @Column(name = "nodo", nullable = false, length = 50)
    private int nodo;

    @Column(name = "frecuencia", nullable = false, length = 200)
    private int frecuencia;

    @Column(name = "autorizacion", nullable = false, length = 200)
    private String autorizacion;

    @Column(name = "fechaRegistro")
    private LocalDateTime fechaRegistro;

    /*
    @Column(name = "REGIST_DATE",nullable = false)
    @Temporal(TemporalType.DATE)
    private String registDate;
    */

    public Equipos(){

    }

    public Equipos(Long id, String nombre, String referencia, String ip, int nusuarios, int nodo, int frecuencia, String autorizacion, LocalDateTime fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.referencia = referencia;
        this.ip = ip;
        this.Nusuarios = nusuarios;
        this.nodo = nodo;
        this.frecuencia = frecuencia;
        this.autorizacion = autorizacion;
        this.fechaRegistro = fechaRegistro;
    }

    public Equipos(String nombre, String referencia, String ip, int nusuarios, int nodo, int frecuencia, String autorizacion, LocalDateTime fechaRegistro) {
        this.nombre = nombre;
        this.referencia = referencia;
        this.ip = ip;
        this.Nusuarios = nusuarios;
        this.nodo = nodo;
        this.frecuencia = frecuencia;
        this.autorizacion = autorizacion;
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

    public int getNodo() {
        return nodo;
    }

    public void setNodo(int nodo) {
        this.nodo = nodo;
    }

    public int getFrecuencia(){
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia){
        this.frecuencia = frecuencia;
    }

    public String getAutorizacion(){
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion){
        this.autorizacion = autorizacion;
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


}
