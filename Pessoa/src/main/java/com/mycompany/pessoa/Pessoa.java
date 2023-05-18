package terbimestre.Pessoa;

/**
 *
 * @author Adrian
 */
public class Pessoa {
    private String Nome;
    private int Idade;
    
    public Pessoa() {
    }
    
    // @geters and setters
    
    public String getNome() {
        return this.Nome;
    }
    
    public int getIdade() {
        return this.Idade;
    }
    
    public void setNome(String pNome) {
        this.Nome = pNome;
    }
    
    public void setIdade(int pIdade) {
        this.Idade = pIdade;
    }
}
