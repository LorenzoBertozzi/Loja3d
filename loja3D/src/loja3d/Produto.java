/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja3d;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Produto extends Modelo
{
    
    private int codigoProduto;
    private String nome;
    private double preco;
    
    
    public Produto() 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("          CADASTRO DE PRODUTO          ");
        
        System.out.print("\nCodigo : ");
        this.codigoProduto = in.nextInt();
        
        System.out.print("\nNome : ");
        this.nome = in.next();
        
        System.out.print("\nPreco (,): ");
        this.preco = in.nextDouble();

    }

    public Produto(int codigoProduto, String nome, double preco) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(int codigoProduto, String nome, double preco, int codigoModelo, String nomeModelo, Filamento filamentos, String modelo) {
        super(codigoModelo, nomeModelo, filamentos, modelo);
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigoProduto=" + codigoProduto + ", nome=" + nome + ", preco=" + preco + '}';
    }
  
    
    
}
