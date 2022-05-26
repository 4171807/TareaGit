/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CorreccionExamen;

/**
 *
 * @author DAW
 */
public interface Contable {
    double neto();
    void descuento(int v);
    void recargo(int v);
    void detalle();
}
//java 8 -- default
//java 9-- static, public