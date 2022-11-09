package Pagamento;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Cartao extends Pagamento {
    
    private String nome;
    private String bandeira;
    private String numero;
    
    //Constructor

    public Cartao(String tipoPagamento,String nome, String bandeira, String numero) {
        super(tipoPagamento);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return "Tipo de pagamento: "+ tipoPagamento + "\n" +
                    "Nome: " + nome + "\n" + 
                    "Bandeira: " + bandeira + "\n" +
                    "Numero do cartao: " + numero;
    } 
    
}
