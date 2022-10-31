/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imobiliaria;

import Imovel.Imovel;
import Pagamento.Aluguel;
import Pagamento.Seguro;
import Pagamento.Venda;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Imobiliaria {
    
    private String nome;
    private String endereco;
    private ArrayList<Aluguel> alugueis;
    private ArrayList<Venda> vendas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Usuario> clientes;
    private ArrayList<Usuario> corretores;
    private ArrayList<Seguro> seguros;
    private Configuracao configuracoes;
    
    //Constructor

    public Imobiliaria(String nome, String endereco,Configuracao configuracoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.alugueis = new ArrayList();
        this.vendas = new ArrayList();
        this.imoveis = new ArrayList();
        this.clientes = new ArrayList();
        this.corretores = new ArrayList();
        this.seguros = new ArrayList();
        this.configuracoes = configuracoes;
    }
    
    
    //Gets e Sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        this.vendas = vendas;
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public ArrayList<Usuario> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Usuario> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Usuario> getCorretores() {
        return corretores;
    }

    public void setCorretores(ArrayList<Usuario> corretores) {
        this.corretores = corretores;
    }

    public ArrayList<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(ArrayList<Seguro> seguros) {
        this.seguros = seguros;
    }

    public Configuracao getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Configuracao configuracoes) {
        this.configuracoes = configuracoes;
    }
    
    
    
    
}

