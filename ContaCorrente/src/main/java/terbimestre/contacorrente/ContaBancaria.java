package terbimestre.contacorrente;

/**
 *
 * @author Adrian
 */
public class ContaBancaria {
    
    protected String titularConta;
    protected double saldoConta;
    
    public ContaBancaria(){
        this.saldoConta = 0;
    }
    
    public void calculaValorCheque() {
        this.saldoConta += 1000;
    }
}
