package com.example.personal.info_eventos.Domain;

import android.media.Image;

import java.util.Date;
import java.util.List;

/**
 * Created by Personal on 11/09/2017.
 */

public class Eventos {
    private String nombreevento, encargado, requisitos, descripcion, lugar;
    private Date fecha;
    private Image imagen;



    public Eventos(String nombreevento, String lugar, String requisitos, String descripcion, String encargado, Date fecha, Image imagen) {
        this.setName(nombreevento);
        this.setRequisitos(requisitos);
        this.setEncargado(encargado);
        this.setDescripcion(descripcion);
        this.setLugar(lugar);
        this.setFecha(fecha);
        this.setImagen(imagen);
    }

    public String getName() {
        return nombreevento;
    }

    public void setName(String nombreevento) {
        this.nombreevento = nombreevento;
    }
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Date getFecha(){return fecha; }
    public void setFecha(Date fecha){
        this.fecha= fecha;
    }
    public Image getImagen(){return imagen;}

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getEncargado() {return encargado;}
    public void setEncargado(String encargado){
        this.encargado = encargado;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
