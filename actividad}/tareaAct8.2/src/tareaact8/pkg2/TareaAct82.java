/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaact8.pkg2;

import entidad.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

/**
 *
 * @author HP
 */
public class TareaAct82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      CafeteraServicio cs = new CafeteraServicio();
      int opc;
        do {
            System.out.println("Elige la opcion\n"
                    + "1-llenarCafetera\n"
                    + "2-servirTaza\n"
                    + "3-vaciarCafetera\n"
                    + "4-agregarCafe\n"
                    + "5-salir");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    cs.llenarCafetera();
                    break;
                case 2:
                    cs.servirTaza();
                    break;
                case 3:
                    cs.vaciarCafetera();
                    break;
                case 4:
                    cs.agregarCafe();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
            
        } while (opc!=5);
        
    }
    
}
