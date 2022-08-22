/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ddavisc
 */
public class sentenciaswitch {
    public static void main (String [] args){
        String dia = "domingo";
        switch(dia){
            case "lunes":
                System.out.println("Inicio de Semana");
                break;
             case "martes":
                System.out.println("Inicio de Semana");
                break;
             case "miercoles":
             case "jueves":
                System.out.println("Mitad de Semana");
                break;
             case "viernes":
                System.out.println("fin  de Semana");
                break;
             case "sabado":
                System.out.println("fin de Semana");
                break;
             default:
                 System.out.println("Dia no valido");
                
        }
    }
}
