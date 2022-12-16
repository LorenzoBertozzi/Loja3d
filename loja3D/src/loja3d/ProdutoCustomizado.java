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
public class ProdutoCustomizado extends Filamento
{
    private String nome;
    private String arquivos;
    private Double pesoPeca;
    private double preco;
    
    public ProdutoCustomizado() 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("\nNome : ");
        this.nome = in.next();
        
        System.out.print("\nArquivo : ");
        this.arquivos = in.next();
        
        System.out.print("\nPeso da Peça : ");
        this.pesoPeca = in.nextDouble();
        
        System.out.println("Preco do Poduto sera : "+getPrecoFilamento()*this.pesoPeca);
        this.preco = getPrecoFilamento()*this.pesoPeca;

    }

    public ProdutoCustomizado(String nome, String arquivos, Double pesoPeca, double preco) {
        this.nome = nome;
        this.arquivos = arquivos;
        this.pesoPeca = pesoPeca;
        this.preco = preco;
    }

    public ProdutoCustomizado(String nome, String arquivos, Double pesoPeca, double preco, int codigoFilamento, String material, double precoFilamento, String cor) {
        super(codigoFilamento, material, precoFilamento, cor);
        this.nome = nome;
        this.arquivos = arquivos;
        this.pesoPeca = pesoPeca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArquivos() {
        return arquivos;
    }

    public void setArquivos(String arquivos) {
        this.arquivos = arquivos;
    }

    public Double getPesoPeca() {
        return pesoPeca;
    }

    public void setPesoPeca(Double pesoPeca) {
        this.pesoPeca = pesoPeca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
