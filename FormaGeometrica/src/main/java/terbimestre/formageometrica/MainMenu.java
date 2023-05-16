/*
 * 1 - Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato 
 * "calcularArea()". Em seguida, crie duas subclasses chamadas "Retangulo" e "Circulo" 
 * que herdam da classe "FormaGeometrica" e implementam o método "calcularArea()" de maneiras diferentes.
 */

package terbimestre.formageometrica;

/**
 *
 * @author Alan H
 */
public class MainMenu {

    public float base;
    public float altura;
    public float area;
    
    
    public void calcularArea(float pBase,float pAltura) {
        this.area = (pBase*pAltura)/2;
        System.out.println("Area = "+area);
    } 
}