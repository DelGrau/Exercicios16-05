/*
* Crie uma classe chamada "Gerente" que herda da classe "Funcinario" e possui um atributo privado "bonus". Utilize encapsulamento para
* permitir o acsso ao atributo "bonus" por meio de métodos getters e setters.
*/
package com.mycompany.gerente1;

/**
 *
 * @author aluno
 */
public class Gerente1 extends Funcionario {
    private double Bonus;
    
    public Gerente1() {
    }
    
    // @geters and setters
    
    public double getBonus() {
        return this.Bonus;
    }

    public void setSalario(double pBonus) {
        this.Bonus = pBonus;
    }
}

   