package Imobiliaria;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Configuracao {
    
    private String arquivo;
    private String arquivoVendas;
    private String arquivoImoveis;
    private String arquivoClientes;
    private String arquivoCorretores;
    private String arquivoSeguros;
    
    
    //Constructor

    public Configuracao(String arquivo, String arquivoVendas, String arquivoImoveis, String arquivoClientes, String arquivoCorretores, String arquivoSeguros) {
        this.arquivo = arquivo;
        this.arquivoVendas = arquivoVendas;
        this.arquivoImoveis = arquivoImoveis;
        this.arquivoClientes = arquivoClientes;
        this.arquivoCorretores = arquivoCorretores;
        this.arquivoSeguros = arquivoSeguros;
    }
    
    //Gets e Sets

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getArquivoVendas() {
        return arquivoVendas;
    }

    public void setArquivoVendas(String arquivoVendas) {
        this.arquivoVendas = arquivoVendas;
    }

    public String getArquivoImoveis() {
        return arquivoImoveis;
    }

    public void setArquivoImoveis(String arquivoImoveis) {
        this.arquivoImoveis = arquivoImoveis;
    }

    public String getArquivoClientes() {
        return arquivoClientes;
    }

    public void setArquivoClientes(String arquivoClientes) {
        this.arquivoClientes = arquivoClientes;
    }

    public String getArquivoCorretores() {
        return arquivoCorretores;
    }

    public void setArquivoCorretores(String arquivoCorretores) {
        this.arquivoCorretores = arquivoCorretores;
    }

    public String getArquivoSeguros() {
        return arquivoSeguros;
    }

    public void setArquivoSeguros(String arquivoSeguros) {
        this.arquivoSeguros = arquivoSeguros;
    }
    
}
