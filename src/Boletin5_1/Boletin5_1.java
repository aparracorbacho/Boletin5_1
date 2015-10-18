/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin5_1;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor, menos;
        // TODO code application logic here
    Coche car = new Coche();
    
    System.out.println("Canto aceleras?");
    Scanner valorTeclado = new Scanner(System.in);
    valor = (int) valorTeclado.nextFloat();
    car.acelerar(valor);
    System.out.println("A velocidade actual é: "+car.getVelocidade());
    System.out.println("Canto afrenas?");
    Scanner menosTeclado = new Scanner(System.in);
    menos = (int) menosTeclado.nextFloat();
    car.frenar(menos);
    System.out.println("A velocidade actual é: "+car.getVelocidade());
    }
    
    
}
