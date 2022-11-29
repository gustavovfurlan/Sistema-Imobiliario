package Pagamento;

import Imovel.Imovel;
import Imobiliaria.Cliente;
import Imobiliaria.Corretor;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Aluguel implements Serializable{
    
    private int codigoAluguel;
    private Cliente cliente;
    private Corretor corretor;
    private Imovel imovel;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private LocalDate dataPagamentoMensal;
    private float valorTotalAluguel;
    private Pagamento formaPagamento;
    private ArrayList<Seguro> segurosContratados;
    private Boolean pago;   
    
    
    public float calcularValorTotal(){
        return (this.valorTotalAluguel * dataAluguel.until(dataDevolucao, ChronoUnit.MONTHS));
    } //Função para calcular o valor do aluguel vezes a quantidade de meses que foi alugado
    
    
    //Constructor

        public Aluguel(int codigoAluguel, Cliente cliente, Corretor corretor, Imovel imovel, LocalDate dataAluguel, LocalDate dataDevolucao, LocalDate dataPagamentoMensal, float valorTotalAluguel, Pagamento formaPagamento, Boolean pago) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao; 
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.valorTotalAluguel = valorTotalAluguel;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = new ArrayList();
        this.pago = pago;
    }
    
 
    //Gets e Sets

    public int getCodigoAluguel() {
        return codigoAluguel;
    }

    public void setCodigoAluguel(int codigoAluguel) {
        this.codigoAluguel = codigoAluguel;
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

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPagamentoMensal() {
        return dataPagamentoMensal;
    }

    public void setDataPagamentoMensal(LocalDate dataPagamentoMensal) {
        this.dataPagamentoMensal = dataPagamentoMensal;
    }

    public float getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(float valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }

    public Pagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<Seguro> getSegurosContratados() {
        return segurosContratados;
    }

    public void setSegurosContratados(ArrayList<Seguro> segurosContratados) {
        this.segurosContratados = segurosContratados;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }
    
        @Override
    public String toString(){
        String auxiliar = "";
        for(Seguro SegAux : segurosContratados){
                    auxiliar += SegAux.toString(); 
                    auxiliar += "\n";
                }
        return "Codigo do Aluguel: " + this.codigoAluguel + "\n" + 
                    "Cliente: " + "\n" + cliente.toString() +"\n" + 
                    "Corretor: " + "\n" + corretor.toString() + "\n" + 
                    "Imovel: " + "\n" + imovel.toString() + "\n" + 
                    "Data do aluguel: " + this.dataAluguel + "\n" + 
                    "Data da devolucao: "+ this.dataDevolucao + "\n" +
                    "Data do pagamento mensal: " + this.dataPagamentoMensal + "\n" + 
                    "Valor total do aluguel: " + this.valorTotalAluguel + "\n" +
                    "Forma de Pagamento: " + "\n" + formaPagamento.toString() + "\n" + 
                    "Seguros contratados: " + auxiliar + "\n" +
                    "Status do pagamento: " + (pago ? "Pago" : "Pendente");
    }
    
}