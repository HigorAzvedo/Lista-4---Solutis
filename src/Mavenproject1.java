/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lista4.mavenproject1;

/**
 *
 * @author higor
 */
public class Mavenproject1 {
// 
    public static void main(String[] args) {
         // Testando a classe Cachorro
        Cachorro cachorro = new Cachorro("Rex", 5, 0.5, 20.0);
        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();

        Gato gato = new Gato("Mimi", 3, 0.3, 5.0);
        gato.comer();
        gato.moverse();
        gato.dormir();

        Elefante elefante = new Elefante("Dumbo", 10, 3.0, 5000.0);
        elefante.comer();
        elefante.moverse();
        elefante.dormir();
        
        Leao leao = new Leao("Simba", 8, 1.2, 190.0);
        leao.comer();
        leao.moverse();
        leao.dormir();

        // Testando a classe Peixe
        Peixe peixe = new Peixe("Nemo", 2, 0.1, 0.5);
        peixe.comer();
        peixe.moverse();
        peixe.dormir();

    }
    
}
