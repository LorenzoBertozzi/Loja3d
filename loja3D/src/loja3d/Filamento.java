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
public class Filamento extends Cor
{
    private int codigoFilamento;
    private String material;
    private double precoFilamento;

    public Filamento()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("          CADASTRO DE FILAMENTOS          ");
        
        System.out.print("\nCodigo : ");
        this.codigoFilamento = in.nextInt();
        
        System.out.print("\nMaterial : ");
        this.material = in.next();
        
        System.out.print("\nPreco Do Filamento (,): ");
        this.precoFilamento = in.nextDouble();
    }
    
    public Filamento(int codigoFilamento, String material, double precoFilamento, String cor) {
        super(cor);
        this.codigoFilamento = codigoFilamento;
        this.material = material;
        this.precoFilamento = precoFilamento;
    }

    public int getCodigoFilamento() {
        return codigoFilamento;
    }

    public void setCodigoFilamento(int codigoFilamento) {
        this.codigoFilamento = codigoFilamento;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecoFilamento() {
        return precoFilamento;
    }

    public void setPrecoFilamento(double precoFilamento) {
        this.precoFilamento = precoFilamento;
    }
    
}
