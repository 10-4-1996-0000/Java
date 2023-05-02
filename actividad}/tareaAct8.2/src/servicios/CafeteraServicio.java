/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CafeteraServicio {
    public Scanner leer = new Scanner(System.in);
    Cafetera cafe = new Cafetera();
        public void llenarCafetera(){
        cafe.setCantidadActual(cafe.getCapacidadMáxima());
        
        }
        public void servirTaza(){
            System.out.println("Ingrese tamaño de su taza");
            int tacita = leer.nextInt();
            if (tacita>cafe.getCantidadActual()) {
                System.out.println("su taza tiene " + cafe.getCantidadActual());
                cafe.setCantidadActual(0);
            }else{
                cafe.setCantidadActual(cafe.getCantidadActual()-tacita);
                System.out.println("se cargo su taza\n"
                        + cafe.getCantidadActual());
            }
        }
        public void vaciarCafetera(){
        cafe.setCantidadActual(0);
    }
        public void agregarCafe(){
            System.out.println("Ingrese cantidad de cafe");
            int cargaCafe = leer.nextInt();
            if ((cargaCafe+ cafe.getCantidadActual())>cafe.getCapacidadMáxima()) {
                System.out.println("Se mamo de cafe");
            }else{
                System.out.println("Cantidad cargada");
                cafe.setCantidadActual(cargaCafe+ cafe.getCantidadActual());
            }
            
        }
    
}
