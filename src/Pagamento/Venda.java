package Pagamento;

import Imovel.Imovel;
import Imobiliaria.Cliente;
import Imobiliaria.Corretor;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Venda implements Serializable{
    
    private int codigoVenda;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataVenda;
    private float valorTotalVenda;
    private Pagamento formaPagamento;
            
    
    //Constructor
    
    public Venda(int codigoVenda, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataVenda, float valorTotalVenda, Pagamento formaPagamento) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.formaPagamento = formaPagamento;
    }
    
    //Gets e Sets

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(float valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
        @Override
    public String toString(){
        return "Codigo da venda: " + this.codigoVenda + "\n" +
                    "Cliente: " + cliente.toString() + "\n" +
                    "Corretor: " + corretor.toString( ) + "\n" +
                    "Imovel: " + imovel.toString() + "\n" +
                    "Data da venda: " + this.dataVenda + "\n" + 
                    "Valor total da venda: " + this.valorTotalVenda + "\n" +
                    "Forma de pagamento: "+ formaPagamento.toString();
    }
}
