/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamento;

import Imovel.Imovel;
import Imobiliaria.Cliente;
import Imobiliaria.Corretor;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Aluguel {
    
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
    
   

    @Override
    public String toString(){
        
        String auxiliar; //Variavel para concatenar todos os itens do ArrayList
        
        for(Seguro SegAux : segurosContratados){
                    auxiliar = auxiliar.concat(segAux.toString()); 
                }
        
        return "Codigo do Aluguel: "+this.codigoAluguel+ "\nCliente: "+cliente.toString()+"\nCorretor: "+corretor.toString()+
                "\nImovel: "+imovel.toString()+"\nData do aluguel: "+this.dataAluguel+"\nData da devolucao: "+this.dataDevolucao+
                "\nData do pagamento mensal: "+this.dataPagamentoMensal+"\nValor total do aluguel: "+this.valorTotalAluguel+
                "\nForma de Pagamento: "+formaPagamento.toString()+"\nSeguros contratados: " +auxiliar 
                + "Status do pagamento: " + ((pago) ? "Pago" : "Pendente");
    }
    
    
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
    
}
