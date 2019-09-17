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
public class Vendedor extends Funcionario 
{
   public double comissao;

    public Vendedor() {
    }

    public Vendedor(double comissao) {
        this.comissao = comissao;
    }

    public Vendedor(double comissao, String nome, double sal_base) {
        super(nome, sal_base);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

   @Override
    public String getNome() {
        return nome;
    }

   @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

   @Override
    public double getSal_base() {
        return sal_base;
    }

   @Override
    public void setSal_base(double sal_base) {
        this.sal_base = sal_base;
    }
   
    @Override
   public double CalcularSalario()
   {
       return sal_base + comissao ;
   }
}
