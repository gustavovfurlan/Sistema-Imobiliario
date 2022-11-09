/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imovel;

import java.time.LocalDate;

/**
 *
 * @author Gustavo
 */
public class ApartamentoResidencial extends Imovel {
    
    protected int andar;
    protected float valorCondominio;
    
    @Override
    public String toString(){
        return super.toString() + "\nN° do andar: "+this.andar+"\nValor do Condominio: "+this.valorCondominio;
    }
                    
    @Override
    public float getValorAluguel(){
        return this.valorAluguel + this.valorCondominio;
    }
    
    // Constructor

    public ApartamentoResidencial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel,int andar, float valorCondominio) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }
    
    
    //Gets e Sets

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    
    
    
    
}
