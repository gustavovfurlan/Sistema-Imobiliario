package Imovel;

import java.time.LocalDate;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Comercial extends Imovel {
    
    protected float taxaImpostoFederal;
    
    @Override
    public float getValorAluguel(){
        return this.valorAluguel + (this.valorAluguel * this.taxaImpostoFederal);
    }
    
    //Constructor

    public Comercial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel,float taxaImpostoFederal) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.taxaImpostoFederal = taxaImpostoFederal;
        alugando = true;
        aVenda = true;
    }
    
    //Get e Set

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nTaxa de imposto federal: "+taxaImpostoFederal;
    }
    
}
