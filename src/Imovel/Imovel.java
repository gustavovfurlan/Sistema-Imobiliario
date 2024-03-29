package Imovel;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Imovel implements Serializable{
    
    protected int codigoImovel;
    protected String endereco;
    protected LocalDate dataConstrucao;
    protected float areaTotal;
    protected float areaConstruida;
    protected int qtdDormitorios;
    protected int qtdBanheiros;
    protected int qtdVagasGaragem;
    protected float valorIPTU;
    protected float valorVenda;
    protected float valorAluguel;
    protected boolean alugando;
    protected boolean aVenda;
    
    
    //Constuctors

    public Imovel(int codigoImovel, String endereco, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        this.codigoImovel = codigoImovel;
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.qtdDormitorios = qtdDormitorios;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdVagasGaragem = qtdVagasGaragem;
        this.valorIPTU = valorIPTU;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }

   
    
    //Gets e Sets

    public int getCodigoImovel() {
        return codigoImovel;
    }

    public void setCodigoImovel(int codigoImovel) {
        this.codigoImovel = codigoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(float areaTotal) {
        this.areaTotal = areaTotal;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public void setQtdDormitorios(int qtdDormitorios) {
        this.qtdDormitorios = qtdDormitorios;
    }

    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public void setQtdBanheiros(int qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
    }

    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }

    public void setQtdVagasGaragem(int qtdVagasGaragem) {
        this.qtdVagasGaragem = qtdVagasGaragem;
    }

    public float getValorIPTU() {
        return valorIPTU;
    }

    public void setValorIPTU(float valorIPTU) {
        this.valorIPTU = valorIPTU;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

      public boolean isAlugando() {
            return alugando;
      }

      public void setAlugando(boolean alugando) {
            this.alugando = alugando;
      }

      public boolean isaVenda() {
            return aVenda;
      }

      public void setaVenda(boolean aVenda) {
            this.aVenda = aVenda;
      }
    
    public String toString(){
        return "Codigo do imovel: " + codigoImovel + "\n" +
                    "Endereco: " + endereco + "\n"+ 
                    "Data de construcao: " + dataConstrucao + "\n" +
                    "Area total: " + areaTotal + "\n" +
                    "Area construida: " + areaConstruida + "\n" +
                    "Quantidade de dormitorios: " + qtdDormitorios + "\n" +
                    "Quantidade de banheiros: " + qtdBanheiros + "\n" +
                    "Quantidade de vagas na garagem: " + qtdVagasGaragem + "\n" + 
                    "Valor do IPTU: " + valorIPTU + "\n" + 
                    "Valor de venda: " + valorVenda + "\n" + 
                    "Valor do aluguel: " + valorAluguel + "\n" +
                    "A Venda: " + (aVenda ? "Sim" : "Não") + "\n" +
                    "Alugando: " + (alugando ? "Sim" : "Não") + "\n";
    }
    
}
