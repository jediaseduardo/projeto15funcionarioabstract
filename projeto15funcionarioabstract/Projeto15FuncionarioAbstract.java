/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto15funcionarioabstract;

/**
 *
 * @author aluno
 */
public class Projeto15FuncionarioAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendedor objVendedor = new Vendedor();
        
        objVendedor.setNome("Vendedor");
        objVendedor.setSal_base(2000);
        objVendedor.setComissao(500);
        
        System.out.println("Nome: "+ objVendedor.getNome()+
                "\nSalario: "+ objVendedor.getSal_base()+
                "\nComissao: "+ objVendedor.getComissao()+
                "\nTotal: "+ objVendedor.CalcularSalario());
        
        Assistente objAssistente = new Assistente();
        
        objAssistente.setNome("Assistente");
        objAssistente.setSal_base(1000);
        
        System.out.println("\nNome: "+ objAssistente.getNome()+
                "\nSalario: "+objAssistente.getSal_base()+
                "\nTotal: "+objAssistente.CalcularSalario());
        
        Gerente objGerente = new Gerente();
        
        objGerente.setNome("Gerente");
        objGerente.setSal_base(3000);
        
        System.out.println("\nNome: "+objGerente.getNome()+
                "\nSalario: "+objGerente.getSal_base()+
                "\nTotal: "+objGerente.CalcularSalario());
        
    }
    
}
