/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terbimestre.formageometrica;

/**
 *
 * @author lucia
 */
public class Retangulo extends MainMenu{
    
    public void calcularArea(float pBase,float pAltura) {
        this.area = pBase*pAltura;
        System.out.println("Area = "+area);
    } 
}
