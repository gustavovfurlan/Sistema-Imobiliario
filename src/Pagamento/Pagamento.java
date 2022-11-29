package Pagamento;

import java.io.Serializable;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public abstract class Pagamento implements Serializable{
    
    protected String tipoPagamento;
    
    //Constructor

    public Pagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    //Get e Set

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
     
    public abstract String toString();
}
