package Pagamento;


/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Dinheiro extends Pagamento{

    public Dinheiro(String tipoPagamento) {
        super(tipoPagamento);
    }
    
    @Override
    public String toString(){
        return "Tipo de pagamento: " + tipoPagamento;
    }
}
