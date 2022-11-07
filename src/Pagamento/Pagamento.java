/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamento;

/**
 *
 * @author Gustavo
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
