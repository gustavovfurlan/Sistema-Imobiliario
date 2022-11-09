package Pagamento;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
abstract class Pagamento {
    
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
