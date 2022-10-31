/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamento;

/**
 *
 * @author Gustavo
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
    
    
    
}
