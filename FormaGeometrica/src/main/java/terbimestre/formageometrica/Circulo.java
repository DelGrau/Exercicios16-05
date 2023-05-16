/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terbimestre.formageometrica;

/**
 *
 * @author Alan H
 */
public class Circulo extends MainMenu {
    
    public final float pi = 3.14f;
    
    public void calcularArea(float pRaio) {
        this.area = pi * (pRaio*pRaio);
        System.out.println("Area = "+area);
    } 
}
