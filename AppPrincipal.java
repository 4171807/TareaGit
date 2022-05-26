/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorreccionExamen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class AppPrincipal {
    public static void main(String[] args) {
               
//        ArrayList<Factura> listaFacturas = new ArrayList();
//        
//        Factura f1 = new Factura(1,"Descrip",LocalDate.now(),21);
//        Factura f2 = new Factura(2,"Descripc",LocalDate.now(),17);
//        Factura f3 = new Factura(3,"Descrip",LocalDate.now(),21);
//        Factura f4 = new Factura(4,"Descripc",LocalDate.now(),17);
//        listaFacturas.add(f1);
//        listaFacturas.add(f2);
//        listaFacturas.add(f3);
//        listaFacturas.add(f4);
//        
//        Collections.sort(listaFacturas, new Orde);
//        for(Factura f: listaFacturas){
//            
//        }
//        
//        
//        

        Scanner e = new Scanner(System.in);
        ArrayList<Factura> listaFacturas = new ArrayList();

        int numero = 0;
        do{
            System.out.println("Introduce datos de factura, numero");
            numero = e.nextInt();
            e.nextLine();
            if(numero == -1){
                System.out.println("Fin");
            }else{
                concepto, nombreCli, dirCli, cifCli, double iva, int numPedidos
                Factura f = new Factura(numero, concepto ..)        
            }
            
            
        }while (numero != -1);









    }
}
