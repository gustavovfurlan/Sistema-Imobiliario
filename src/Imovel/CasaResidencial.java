package Imovel;

import java.time.LocalDate;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class CasaResidencial extends Imovel {
    
    //Constructor
    
    public CasaResidencial(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereco, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }

}
