/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorreccionExamen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author DAW
 */
public class Factura extends Documento implements Contable{

    private final double iva;
    private double importe;
    private DatosFiscales emisor;
    private DatosFiscales cliente;
    private ArrayList<Pedido> pedidos;

    public Factura(int codigo, String concepto, LocalDate fecha, double iva, String nombre, String cif, String dir) {
        super(codigo, concepto, fecha);
        this.iva = iva;
        cliente = new DatosFiscales(nombre,cif,dir);
        pedidos = new ArrayList<>();
    }

    public void datosEmisor(String nombre, String cif, String dir){
        emisor = new DatosFiscales(nombre,cif,dir);
    }
    
    public void addPedido(String concepto, int cantidad, double precio){
        pedidos.add(new Pedido(concepto, cantidad, precio));
        importe = importe + (precio * cantidad);
    }
    
    public boolean modificaCantidadPedido(String concepto, int cantidad, double pedido){
        for(Pedido p : pedidos){
            if(p.concepto.equalsIgnoreCase(concepto)){
                p.cantidad = cantidad;
                return true;
            }
        }
        return false;
    }
    
    public boolean modificaPrecioPedido(String concepto, int cantidad, double pedido){
        for (Pedido p : pedidos){
            
        }
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

//    public DatosFiscales getEmisor() {
//        return emisor;
//    }
    //o lo declaramos privados o lo quitamos , no usar en datos fiscales este getEmisor.

    public void setEmisor(DatosFiscales emisor) {
        this.emisor = emisor;
    }

    public DatosFiscales getCliente() {
        return cliente;
    }

    public void setCliente(DatosFiscales cliente) {
        this.cliente = cliente;
    }

    @Override
    public double neto() {
         return importe * (1+iva/100);
    }

    @Override
    public void descuento(int cantidad) { //(int v) no.
        importe = importe - (importe * cantidad / 100);
        
    }

    @Override
    public void recargo(int cantidad) { 
        importe = importe + (importe * cantidad / 100);
    }
    
    public void detalle(){
        System.out.println("Factura "+getNumero());
        System.out.println("\tConcepto "+this.getDescripcion());
        System.out.println("\tFecha "+getFecha());
        System.out.println("\tDatos emisor ");
        System.out.println("\t\tNombre "+emisor.nombre);
        System.out.println("\t\tCIF "+emisor.cif);
        System.out.println("\t\t "+emisor.direccion);
        System.out.println("Datos del cliente ");
//        System.out.println("\tPedidos" ;
//            getFecha
//                    Datos emisor
//                            \t\t nombre
//                                    cif
//                                            direccion
//                                            \t Datos del cliente
//                                                    
//       for(Pedido p: pedidos){
//           System.out.println("\t\tConcepto "p.concepto);
//                                             p.cantidad
//                                                     p.precio
//       }                                             
//       System.out.println("Importe bruto " +neto);
//        System.out.println("Neto "+neto);
    }
    

    static class compararValorIva implements Comparator<Factura>{ //OrdenImporteIVA

        @Override
        public int compare(Factura o1, Factura o2) { // si es Object o1, o2 , hacemos el casting 
            if(o1.getIVA() == o2.getIVA()) return 0;
            else if(o1.getIVA() > o2.getIVA()) return 1;
            else return -1;
        }
  
    }
    
    private class Pedido{ //clases internas privadas no deben tener get y set nunca.

        private String concepto;
        private int cantidad;
        private double precio;

        public Pedido(String concepto, int cantidad, double precio) {
            this.concepto = concepto;
            this.cantidad = cantidad;
            this.precio = precio;
        }

    }

    private class DatosFiscales {

        private final String nombre;
        private final String cif;
        private final String direccion;

        public DatosFiscales(String nombre, String cif, String direccion) {
            this.nombre = nombre;
            this.cif = cif;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCif() {
            return cif;
        }

        public String getDireccion() {
            return direccion;
        }

    }

}
