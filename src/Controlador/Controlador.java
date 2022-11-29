package Controlador;

import Configuracao.Configuracao;
import Imobiliaria.Usuario;
import Imobiliaria.Imobiliaria;
import Imovel.Imovel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import Pagamento.Aluguel;
import Pagamento.Seguro;
import Pagamento.Venda;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class Controlador {
      public Imobiliaria imobiliaria;
      private Configuracao config;
      private File alugueis;
      private File clientes;
      private File corretores;
      private File imoveis;
      private File seguros;
      private File vendas;
      
      
      public Controlador(String nome,  String endereco){
            config = new Configuracao("data/alugueis.txt", "data/vendas.txt", "data/imoveis.txt", "data/clientes.txt", "data/corretores.txt", "data/seguros.txt");
            imobiliaria = new Imobiliaria(nome, endereco, config);
            alugueis = new File(imobiliaria.getConfiguracoes().getArquivoAlugueis());
            vendas = new File(imobiliaria.getConfiguracoes().getArquivoVendas());
            imoveis = new File(imobiliaria.getConfiguracoes().getArquivoImoveis());
            clientes = new File(imobiliaria.getConfiguracoes().getArquivoClientes());
            corretores = new File(imobiliaria.getConfiguracoes().getArquivoCorretores());
            seguros = new File(imobiliaria.getConfiguracoes().getArquivoSeguros());
      }
      
      public ArrayList<Aluguel> lerAlugueis() throws FileNotFoundException, IOException, ClassNotFoundException{
            boolean cont = true;
            ArrayList<Aluguel> alus = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(alugueis);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;
                  
                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             alus = ((ArrayList<Aluguel>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e) {
                  
            }       
            return alus;
      }
      
      public void escreverAlugueis(ArrayList<Aluguel> alus) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileOutputStream fos = new FileOutputStream(alugueis);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(alus);
            oos.flush();
            oos.close();
      }
      
      public ArrayList<Venda> lerVendas() throws FileNotFoundException, IOException, ClassNotFoundException{
            boolean cont = true;
            ArrayList<Venda> vens = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(vendas);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;

                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             vens = ((ArrayList<Venda>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e) {
                  
            }
            return vens;
      }
      
      public void escreverVendas(ArrayList<Venda> vens) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileOutputStream fos = new FileOutputStream(vendas);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(vens);
            oos.flush();
            oos.close();
      }
      
      public ArrayList<Imovel> lerImoveis() throws FileNotFoundException, IOException, ClassNotFoundException{
            boolean cont = true;
            ArrayList<Imovel> imvs = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(imoveis);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;

                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             imvs = ((ArrayList<Imovel>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e) {
                  
            }          
            return imvs;
      }
      
      public void escreverImoveis(ArrayList<Imovel> imvs) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileOutputStream fos = new FileOutputStream(imoveis);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(imvs);
            oos.flush();
            oos.close();
      }
      
      public ArrayList<Usuario> lerClientes() throws FileNotFoundException, IOException, ClassNotFoundException{
            boolean cont = true;            
            ArrayList<Usuario> clis = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(clientes);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;

                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             clis = ((ArrayList<Usuario>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e){
                  
            }          
            return clis;
      }
      
      public void escreverClientes(ArrayList<Usuario> clis) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileOutputStream fos = new FileOutputStream(clientes);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clis);
            oos.flush();
            oos.close();
      }
      
      public ArrayList<Usuario> lerCorretores() throws FileNotFoundException, IOException, ClassNotFoundException{
            boolean cont = true;
            ArrayList<Usuario> cors = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(corretores);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;

                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             cors = ((ArrayList<Usuario>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e){
                  
            }
            return cors;
      }
      
      public void escreverCorretores(ArrayList<Usuario> cors) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileOutputStream fos = new FileOutputStream(corretores);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cors);
            oos.flush();
            oos.close();
      }
      
      public ArrayList<Seguro> lerSeguros() throws FileNotFoundException, IOException, ClassNotFoundException{
            boolean cont = true;
            ArrayList<Seguro> segs = new ArrayList();
            
            try {
                  FileInputStream fis = new FileInputStream(seguros);
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  Object obj = null;


                  while(cont){
                       if(fis.available() != 0) {
                             obj = ois.readObject();
                             segs = ((ArrayList<Seguro>) obj);
                       } else {
                             cont = false;
                       }
                  }
            } catch (Exception e) {
                  
            }
            return segs;
      }
      
      public void escreverSeguros(ArrayList<Seguro> segs) throws FileNotFoundException, IOException, ClassNotFoundException{
            FileOutputStream fos = new FileOutputStream(seguros);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(segs);
            oos.flush();
            oos.close();
      }
      
      public void atualizarImobiliaria() throws IOException, FileNotFoundException, ClassNotFoundException{
            imobiliaria.setAlugueis(lerAlugueis());
            imobiliaria.setVendas(lerVendas());
            imobiliaria.setImoveis(lerImoveis());
            imobiliaria.setSeguros(lerSeguros());
            imobiliaria.setClientes(lerClientes());
            imobiliaria.setCorretores(lerCorretores());                  
      }
      
      public void atualizarArquivos() throws IOException, FileNotFoundException, ClassNotFoundException {
            escreverAlugueis(imobiliaria.getAlugueis());
            escreverVendas(imobiliaria.getVendas());
            escreverClientes(imobiliaria.getClientes());
            escreverCorretores(imobiliaria.getCorretores());
            escreverImoveis(imobiliaria.getImoveis());
            escreverSeguros(imobiliaria.getSeguros());
      }
      
      public boolean cadastrarCliente(int cod, String nome, String cpf,  String rg, int diaNasc, int mesNasc, int anoNasc, String endereco, String cep, String telefone, String email, int diaCad, int mesCad, int anoCad){
            LocalDate dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc);
            LocalDate dataCad = LocalDate.of(anoCad, mesCad, diaCad);
            return imobiliaria.cadastrarCliente(cod, nome, cpf, rg, dataNasc, endereco, cep, telefone, email, dataCad);
      }

      public boolean cadastrarCorretor(int cod, String nome, String cpf,  String rg, int diaNasc, int mesNasc, int anoNasc, String endereco, String cep, String telefone, String email, String creci, float salario, String pis, int diaAdms, int mesAdms, int anoAdms){
            LocalDate dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc);
            LocalDate dataCad = LocalDate.of(anoAdms, mesAdms, diaAdms);
            return imobiliaria.cadastrarCorretor(cod, nome, cpf, rg, dataNasc, endereco, cep, telefone, email, creci, salario, pis, dataCad);
      }

      public boolean cadastrarImovel(int cod, String end, LocalDate dataConst, float areaTot, float areaConst, int dorm, int banh, int garg, float iptu, float valorVenda, float valorAluguel, float impostoFed, int andar, float valorCond){
            return imobiliaria.cadastrarImovel(cod, end, dataConst, areaTot, areaConst, dorm, banh, garg, iptu, valorVenda, valorAluguel, impostoFed, andar, valorCond);
      }
      
      public boolean cadastrarSeguro(int codigoSeguro, String nomeSeguradora, String tipo, String descricao, float valor){
            return imobiliaria.cadastrarSeguro(codigoSeguro, nomeSeguradora, tipo, descricao, valor);
      }
      
      public boolean alugar(int codAlug, int codImovel, int codCliente, int codCorretor, int diaDevo, int mesDevo, int anoDevo, int diaPagMen, int mesPagMen, int anoPagMen, ArrayList<Integer> codSegs, String tipoPag, String nome, String bandeira, String numero){
            LocalDate dataDevolucao  = LocalDate.of(anoDevo, mesDevo, diaDevo);
            LocalDate dataPagMen = LocalDate.of(anoPagMen, mesPagMen, diaPagMen);
            return imobiliaria.alugar(codAlug, codImovel, codCliente, codCorretor, dataDevolucao, dataPagMen, codSegs, tipoPag, nome, bandeira, numero);
      }

      public boolean vender(int codVenda, int codImovel, int codCliente, int codCorretor, String nome, String bandeira, String numero){
            return imobiliaria.vender(codVenda, codImovel, codCliente, codCorretor, nome, bandeira, numero);
      }
      
      public String listarImoveis(){
            return imobiliaria.listarImoveis();
      }
      
      public String listarCasas(){
            return imobiliaria.listarCasas();
      }
      
       public String listarApartamentos(){
             return imobiliaria.listarApartamentos();
       }

       public String listarComerciais(){
             return imobiliaria.listarComerciais();
       }
       
       public String listarImoveisDisponiveis(){
             return imobiliaria.listarImoveisDisponiveis();
       }
       
       public String listarImoveisIndisponiveis(){
             return imobiliaria.listarImoveisIndisponiveis();
       }
       
       public String listarImoveisAtrasados(){
             return imobiliaria.listarImoveisAtrasados();
       }

       public String listarCasasAlugadas(){
             return imobiliaria.listarCasasAlugadas();
       }

       public String listarApartamentosAlugados(){
             return imobiliaria.listarApartamentosAlugados();
       }
       
       public String listarComerciaisAlugados(){
             return imobiliaria.listarComerciaisAlugados();
       }
               
       public String listarImoveisAlugadosCliente(int cod){
             return imobiliaria.listarImoveisAlugadosCliente(cod);
       }
       
       public String listarImoveisCompradosCliente(int cod){
             return imobiliaria.listarImoveisCompradosCliente(cod);
       }        
       
       public String listarClientes(){
             return imobiliaria.listarClientes();
       }
       
       public String listarCorretores(){
             return imobiliaria.listarCorretores();
       }
       
       public String listarFuncionariosMes(){
             return imobiliaria.listarFuncionariosMes();
       }
       
       public String clientesAluguelAtrasado(){
             return imobiliaria.clientesAluguelAtrasado();
       }
       
       public String listarAlugueis(){
             return imobiliaria.listarAlugueis();
       }
               
       public String listarAlugueisFinalizados(){
             return imobiliaria.listarAlugueisFinalizados();
       }    
               
       public String listarAlugueisNaoFinalizados(){
             return imobiliaria.listarAlugueisNaoFinalizados();
       }       
               
       public String listarVendas(){
             return imobiliaria.listarVendas();
       }        
               
       public String listarVendasLucro(){
             return imobiliaria.listarVendasLucro();
       }       
               
       public String listarVendasLucroMes(int mes, int ano){
             return imobiliaria.listarVendasLucroMes(mes, ano);
       }
               
       public String listarTiposSeguros(){
             return imobiliaria.listarTiposSeguros();
       }       
}
