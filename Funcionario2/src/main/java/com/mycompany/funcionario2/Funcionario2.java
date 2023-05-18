/*
 * 4 - Crie uma classe chamada Funcionario, com atributos privados, como nome e salário. Utilize Encapsulamento para permitir o acesso
 * a esses atributos por meio de métodos getters e setters
 */

package terbimestre.funcionario2;

/**
 *
 * @author Alan H
 */
public class Funcionario2 {

    private String nome;
    private double salario;
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String pNome) {
        this.nome = pNome;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double pSalario) {
        this.salario = pSalario;
    }
}
