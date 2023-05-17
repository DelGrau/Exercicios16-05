
package terbimestre.contacorrente;

/**
 *
 * @author Adrian
 */
public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente() {
        
    }
    
    public void calculaValorCheque(){
        this.saldoConta += 2000;
    }
}
