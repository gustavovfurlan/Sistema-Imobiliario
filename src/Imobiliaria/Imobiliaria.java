package Imobiliaria;

import Configuracao.Configuracao;
import Imovel.ApartamentoResidencial;
import Imovel.Comercial;
import Imovel.CasaResidencial;
import Imovel.Imovel;
import Pagamento.Aluguel;
import Pagamento.Seguro;
import Pagamento.Venda;
import Pagamento.Cartao;
import Pagamento.Dinheiro;
import Pagamento.Pagamento;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 *
 * @author Gabriel, Gustavo, Igor
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
    
    //cadastros
    public boolean cadastrarCliente(int cod, String nome, String cpf,  String rg, LocalDate dataNasc, String endereco, String cep, String telefone, String email, LocalDate dataCad){
          Cliente novoCliente = new Cliente(cod, nome, cpf, rg, dataNasc, endereco, cep, telefone, email, dataCad);
          
          for(Usuario cliente: clientes){
                  if(cliente.getNome().equals(novoCliente.getNome()) && (
                          (cliente.getRg().equals(novoCliente.getRg())) ||
                          (cliente.getCpf().equals(novoCliente.getCpf()))
                          ))
                          {
                        return false;
                  }
          }
          this.clientes.add(novoCliente);
          return true;
    }
    
     public boolean cadastrarCorretor(int cod, String nome, String cpf,  String rg, LocalDate dataNasc, String endereco, String cep, String telefone, String email, String creci, float salario, String pis, LocalDate dataAdms){
          Corretor novoCorretor = new Corretor(cod, nome, cpf, rg, dataNasc, endereco, cep, telefone, email, creci, salario, pis, dataAdms);
          
          for(Usuario corretor: corretores){
                  if(corretor.getNome().equals(novoCorretor.getNome()) && (
                          (corretor.getRg().equals(novoCorretor.getRg())) ||
                          (corretor.getCpf().equals(novoCorretor.getCpf()))
                          ))
                          {
                        return false;
                  }
          }
          this.corretores.add(novoCorretor);
          return true;
    }
    
     public boolean cadastrarImovel(int cod, String end, LocalDate dataConst, float areaTot, float areaConst, int dorm, int banh, int garg, float iptu, float valorVenda, float valorAluguel, float impostoFed, int andar, float valorCond){
          Imovel novoImovel;
          if (valorCond >= 0){
                novoImovel = new ApartamentoResidencial(cod, end, dataConst, areaTot, areaConst, dorm, banh, garg, iptu, valorVenda, valorAluguel, andar, valorCond);
          } else if(impostoFed >= 0){
                novoImovel = new Comercial(cod, end, dataConst, areaTot, areaConst, dorm, banh, garg, iptu, valorVenda, valorAluguel, impostoFed);
          } else {
                novoImovel = new CasaResidencial(cod, end, dataConst, areaTot, areaConst, dorm, banh, garg, iptu, valorVenda, valorAluguel);
          }
          for(Imovel imovel: imoveis){
                  if(imovel.getEndereco().equals(novoImovel.getEndereco())){
                        return false;
                  }
          }
          this.imoveis.add(novoImovel);
          return true;
    }
     
     public boolean cadastrarSeguro(int codigoSeguro, String nomeSeguradora, String tipo, String descricao, float valor){
           for(Seguro seguro: seguros){
                 if(seguro.getCodigoSeguro() == codigoSeguro){
                       return false;
                 }
           }
           Seguro novoSeguro = new Seguro(codigoSeguro,  nomeSeguradora, tipo, descricao, valor);
           seguros.add(novoSeguro);
           return true;
     }
     
     //criar aluguel/venda
     public boolean alugar(int codAlug, int codImovel, int codCliente, int codCorretor, LocalDate dataDevolucao, LocalDate dataPagMen, ArrayList<Integer> codSegs, String tipoPag, String nome, String bandeira, String numero){
           Aluguel novoAluguel;
           ArrayList<Seguro> segsContratados = new ArrayList();
           if(codSegs.size() > 0) {
                  for(int codSeg: codSegs){
                        for(Seguro seguro: seguros){
                              if(codSeg == seguro.getCodigoSeguro()){
                                    segsContratados.add(seguro);
                              }
                        }
                   }
           }
           Imovel imovelAlug = null;
           for(Imovel imovel: imoveis){
                 if(imovel.getCodigoImovel() == codImovel){
                       if(!imovel.isAlugando()){
                              return false;
                       }
                       imovel.setAlugando(false);
                       imovel.setaVenda(false);
                       imovelAlug = imovel;
                 }    
           }
           
           Corretor corretorAlug = null;
           for(Usuario corretor: corretores){
                 if(corretor.getCodigoUsuario() == codCorretor){
                       corretorAlug = (Corretor) corretor;
                 }
           }
           
           Cliente clienteAlug = null;
           for(Usuario cliente: clientes){
                 if(cliente.getCodigoUsuario() == codCliente){
                       clienteAlug = (Cliente) cliente;
                 }
           }
           
           Pagamento pag;
           if(tipoPag.equals("Dinheiro")){
                 pag = new Dinheiro(tipoPag);
           } else {
                 pag = new Cartao(tipoPag, nome, bandeira, numero);
           }
           
           if(clienteAlug == null || corretorAlug == null || imovelAlug == null) return false;
           
           novoAluguel = new Aluguel(codAlug, clienteAlug, corretorAlug, imovelAlug, LocalDate.now(), dataDevolucao, dataPagMen, imovelAlug.getValorAluguel(), pag, false);
           alugueis.add(novoAluguel);
           return true;
     }     
           
     public boolean vender(int codVenda, int codImovel, int codCliente, int codCorretor, String nome, String bandeira, String numero){
           Venda novaVenda;          
           Imovel imovelVend = null;
           for(Imovel imovel: imoveis){
                 if(imovel.getCodigoImovel() == codImovel){
                       if(!imovel.isaVenda()){
                              return false;
                        }
                       imovel.setAlugando(false);
                       imovel.setaVenda(false);
                       imovelVend = imovel;
                 }    
           }
          Corretor corretorVenda = null;
           for(Usuario corretor: corretores){
                 if(corretor.getCodigoUsuario() == codCorretor){
                       corretorVenda = (Corretor) corretor;
                 }
           }
           
           Cliente clienteVenda = null;
           for(Usuario cliente: clientes){
                 if(cliente.getCodigoUsuario() == codCliente){
                       clienteVenda = (Cliente) cliente;
                 }
           }
           
           Pagamento pag = new Cartao("Cartão", nome, bandeira, numero); 
           
           if(clienteVenda == null || corretorVenda == null || imovelVend == null) return false;
           
           novaVenda = new Venda(codVenda, clienteVenda, corretorVenda, imovelVend, LocalDate.now(), imovelVend.getValorVenda(), pag);
           vendas.add(novaVenda);
           return true;
     }
     
     //relatorios
     public String listarImoveis(){
           String s = "";
           s += "Todos os Imóveis\n\n";
           for(Imovel imovel: imoveis){
                 s += imovel.toString();
                 s += "\n";
           }
           return s;
     }
     
     public String listarCasas(){
           String s = "";
           s += "Imóveis do tipo Casa Residencial\n\n";
           for(Imovel imovel: imoveis){
                 if(imovel instanceof CasaResidencial){
                       s += imovel.toString();
                       s += "\n";
                 }
           }
           return s;
     }
     
     public String listarApartamentos(){
           String s = "";
           s += "Imóveis do tipo Apartamento Residencial\n\n";
           for(Imovel imovel: imoveis){
                 if(imovel instanceof ApartamentoResidencial){
                       s += imovel.toString();
                       s += "\n";
                 }
           }
           return s;
     }
     
     public String listarComerciais(){
           String s = "";
           s += "Imóveis do tipo Comercial\n\n";
           for(Imovel imovel: imoveis){
                 if(imovel instanceof Comercial){
                       s += imovel.toString();
                       s += "\n";
                 }
           }
           return s;
     }
     
     public String listarImoveisDisponiveis(){
           String s = "";
           s += "Imóveis disponíveis para venda ou aluguel\n\n";
           for(Imovel imovel: imoveis){
                 if(imovel.isAlugando() || imovel.isaVenda()){
                       s += imovel.toString();
                       s += "\n";
                 }
           }
           return s;
     }
     
     public String listarImoveisIndisponiveis(){
           String s = "";
           s += "Imóveis indisponíveis para venda ou aluguel\n\n";
           for(Imovel imovel: imoveis){
                 if(!imovel.isAlugando() || !imovel.isaVenda()){
                       s += imovel.toString();
                       s += "\n";
                 }
           }
           return s;
     }
     
    public String listarImoveisAtrasados(){
           String s = "";
           s += "Imóveis com pagamento do aluguel atrasado\n\n";
           for(Aluguel aluguel: alugueis){
                 if(!aluguel.getPago()){
                      s += aluguel.getImovel().toString();
                      s += "\n";
                 }
           }
           return s;
     }
     
    public String listarCasasAlugadas(){
          String s = "";
          s += "Imóveis do tipo Casa Residencial alugados\n\n";
          for(Aluguel aluguel: alugueis){
                if(aluguel.getImovel() instanceof CasaResidencial){
                      s += aluguel.getImovel().toString();
                      s += "\n";
                } 
          }
          return s;
    }
    
    public String listarApartamentosAlugados(){
          String s = "";
          s += "Imóveis do tipo Apartamento Residencial alugados\n\n";
          for(Aluguel aluguel: alugueis){
                if(aluguel.getImovel() instanceof ApartamentoResidencial){
                      s += aluguel.getImovel().toString();
                      s += "\n";
                } 
          }
          return s;
    }
    
    public String listarComerciaisAlugados(){
          String s = "";
          s += "Imóveis do tipo Comercial alugados\n\n";
          for(Aluguel aluguel: alugueis){
                if(aluguel.getImovel() instanceof Comercial){
                      s += aluguel.getImovel().toString();
                      s += "\n";
                } 
          }
          return s;
    }

    public String listarImoveisAlugadosCliente(int cod){
          String s = "";
          Cliente clienteSelc = null;
          for(Usuario cliente: clientes){
                if(cod == cliente.getCodigoUsuario()){
                      clienteSelc = (Cliente) cliente;
                      break;
                }
          }
          if(clienteSelc == null){
                return "Nenhum Cliente encontrado com esse código\n";
          }
          s += "Imóveis alugados por " + clienteSelc.getNome() + "\n\n";
          for(Aluguel aluguel: alugueis){
                if(aluguel.getCliente().equals(clienteSelc)){
                      s += aluguel.getImovel().toString();
                      s += "\n";
                }
          }
          return s;
    }
    
    public String listarImoveisCompradosCliente(int cod){
          String s = "";
          Cliente clienteSelc = null;
          for(Usuario cliente: clientes){
                if(cod == cliente.getCodigoUsuario()){
                      clienteSelc = (Cliente) cliente;
                      break;
                }
          }
           if(clienteSelc == null){
                return "Nenhum Cliente encontrado com esse código\n";
          }
          s += "Imóveis comprados por " + clienteSelc.getNome() + "\n\n";
          for(Venda venda: vendas){
                if(venda.getCliente().equals(clienteSelc)){
                      s += venda.getImovel().toString();
                      s += "\n";
                }
          }
          return s;
    }
    
    public String listarClientes(){
          String s = "";
          s += "Todos os Clientes\n\n";
          for(Usuario cliente: clientes){
                s += cliente.toString();
                s += "\n";
          }
          return s;
    }
    
    public String listarCorretores(){
          String s = "";
          s += "Todos os Corretores\n\n";
          for(Usuario corretor: corretores){
                s += corretor.toString();
                s += "\n";
          }
          return s;
    }
    
    public String listarFuncionariosMes(){
          String s = "";
          s += "Funcionários do Mês\n\n";
          Map<Usuario, Integer> funcMes;
          Integer val;
          String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
          for(int i = 1; i <= 12; i++){
                val = null;
                funcMes = new HashMap<Usuario, Integer>();
                for(Aluguel aluguel: alugueis){
                        if(aluguel.getDataAluguel().getYear() == LocalDate.now().getYear() && aluguel.getDataAluguel().getMonthValue() == i){
                              val = funcMes.get(aluguel.getCorretor());
                              funcMes.put(aluguel.getCorretor(), val == null ? 1 : val + 1);
                        } 
                }
                Entry<Usuario, Integer> max = null;
                for(Entry<Usuario, Integer> e: funcMes.entrySet()){
                      if(max == null || e.getValue() > max.getValue()) max = e;
                }
                if(max == null){
                      s += "Funcionário do mês de " + meses[i-1] + "de " + LocalDate.now().getYear() + "\n";
                } else {
                      Usuario funcionarioMes = max.getKey();
                      s += "Funcionário do mês de " + meses[i-1] + "de " + LocalDate.now().getYear() + "\n" + funcionarioMes.toString() + "\n\n";
                }
          }
          return s;
    }
    
    public String clientesAluguelAtrasado(){
          ArrayList<Usuario> clientesAtraso = new ArrayList<Usuario>();
          for(Aluguel aluguel: alugueis){
                if(!aluguel.getPago()){
                      clientesAtraso.add(aluguel.getCliente());
                }
          }
          ArrayList<Usuario> clientesFiltrado = new ArrayList<Usuario>();
          clientesFiltrado = (ArrayList<Usuario>) clientesAtraso.stream().distinct().collect(Collectors.toList());
          
          String s = "";
          s += "Clientes com aluguel atrasado\n\n";
          for(Usuario cliente: clientesAtraso){
                s += cliente.toString();
                s += "\n";
          }
          return s;
    }
    
    public String listarAlugueis(){
          String s = "";
          s += "Todos os Alugueis\n\n";
          for(Aluguel aluguel: alugueis){
                s += aluguel.toString();
                s += "\n";
          }
          return s;
    }
    
    public String listarAlugueisFinalizados(){
          String s = "";
          s += "Alugueis finalizados\n\n";
          for(Aluguel aluguel: alugueis){
                if(LocalDate.now().isAfter(aluguel.getDataDevolucao())){
                      s += aluguel.toString();
                      s += "\n";
                }
          }
          return s;
    }
    
    public String listarAlugueisNaoFinalizados(){
          String s = "";
          s += "Alugueis não finalizados\n\n";
          for(Aluguel aluguel: alugueis){
                if(!LocalDate.now().isAfter(aluguel.getDataDevolucao())){
                      s += aluguel.toString();
                      s += "\n";
                }
          }
          return s;
    }
    
    public String listarVendas(){
           String s = "";
            s += "Todos as Vendas\n\n";
            for(Venda venda: vendas){
                  s += venda.toString();
                  s += "\n";
            }
            return s;
    }
    
    public String listarVendasLucro(){
           String s = "";
           float lucro = 0;
            s += "Todos as Vendas e Lucro Total\n\n";
            for(Venda venda: vendas){
                  s += venda.toString();
                  s += "\n";
                  lucro += venda.getValorTotalVenda();
            }
            s += "\nLucro total da Imobiliária: R$" + lucro + "\n";
            return s;
    }
    
    public String listarVendasLucroMes(int mes, int ano){
          String s = "";
           float lucro = 0;
           String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
            s += "Todos as Vendas e Lucro Total no mês de " + meses[mes-1] + "de " + ano + "\n\n";
            LocalDate inicioMes = LocalDate.of(ano, mes, LocalDate.MIN.getDayOfMonth());
            LocalDate fimMes = LocalDate.of(ano, mes, LocalDate.MAX.getDayOfYear());
            for(Venda venda: vendas){
                  if(!venda.getDataVenda().isBefore(inicioMes) && !venda.getDataVenda().isAfter(fimMes)){
                        s += venda.toString();
                        s += "\n";
                        lucro += venda.getValorTotalVenda();
                  }
            }
            s += "\nLucro total da Imobiliária no mês de " + meses[mes-1] + "de " + ano + ":" + "R$" + lucro + "\n";
            return s;
    }
    
    public String listarTiposSeguros(){
          String s = "";
            s += "Todos os Seguros \n\n";
            for(Seguro seguro: seguros){
                  s += seguro.toString();
                  s += "\n";
            }
            return s;
    }
}