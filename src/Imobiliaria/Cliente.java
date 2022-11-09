package Imobiliaria;

import java.time.LocalDate;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Cliente extends Usuario {
    
    protected LocalDate dataCadastro;
    
    //Constructor 

    public Cliente(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone, String email,LocalDate dataCadastro) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.dataCadastro = dataCadastro;
    }
    
    //Get e Set 

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String toString(){
        return super.toString() + "\n" +
                    "Data de cadastro: " + dataCadastro;
    }
    
}
