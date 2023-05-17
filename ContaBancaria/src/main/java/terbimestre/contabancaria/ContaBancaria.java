package terbimestre.contabancaria;

/**
 *
 * @author Alan H
 */
public class ContaBancaria {
    private double saldo;
    private String titular;
    
    public ContaBancaria() {
    }
    
    // @geters and setters
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setSaldo(double pSaldo) {
        this.saldo = pSaldo;
    }
    
    public void setTitular(String pTitular) {
        this.titular = pTitular;
    }
}
