/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ari
 */
public class casa {
    int numHabitaciones;
    int numPisos;
    String color;
     
    public static void main(String args[]){
        hornoMicroondas hornoA;
        hornoA = new hornoMicroondas();
        
        hornoA.potencia=500;
        
        refrigerador refriA;
        refriA = new refrigerador();
        
        refriA.marca="Mabe";
        
        estufa estufaA;
        estufaA = new estufa();
        
        estufaA.numQuemadores=5;
    }
}
