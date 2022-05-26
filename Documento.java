/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorreccionExamen;

import java.time.LocalDate;

/**
 *
 * @author DAW
 */
public abstract class Documento implements Comparable<Documento>{ //ya no necesario hacer casting en compareTo
    private final int numero;
    private final String descripcion;
    private final LocalDate fecha;

    public Documento(int numero, String descripcion, LocalDate fecha) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() { //era el get concepto por eso no me salía.
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public abstract void detalle(); //es abstracta porque añade el método abstracto. No se puede instanciar.
    
    @Override
    public int compareTo(Documento o){
        if(this.numero < o.numero) return -1;
        else if(this.numero > o.numero) return 1;
        else return 0;
    }

}
