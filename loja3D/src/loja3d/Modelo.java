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
public class Modelo extends Filamento
{
    
    private int codigoModelo;
    private String nomeModelo;
    private Filamento filamentos;
    private String modelo;
    
    public Modelo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("          CADASTRO DE MODELO          ");
        
        System.out.print("\nCodigo : ");
        this.codigoModelo = in.nextInt();
        
        System.out.print("\nNome : ");
        this.nomeModelo = in.next();
        
        System.out.print("\nModelo : ");
        this.modelo = in.next();
        
    }

    public Modelo(int codigoModelo, String nomeModelo, Filamento filamentos, String modelo) {
        this.codigoModelo = codigoModelo;
        this.nomeModelo = nomeModelo;
        this.filamentos = filamentos;
        this.modelo = modelo;
    }

    public Modelo(int codigoModelo, String nomeModelo, Filamento filamentos, String modelo, int codigoFilamento, String material, double precoFilamento, String cor) {
        super(codigoFilamento, material, precoFilamento, cor);
        this.codigoModelo = codigoModelo;
        this.nomeModelo = nomeModelo;
        this.filamentos = filamentos;
        this.modelo = modelo;
    }

    public int getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(int codigoModelo) {
        this.codigoModelo = codigoModelo;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public Filamento getFilamentos() {
        return filamentos;
    }

    public void setFilamentos(Filamento filamentos) {
        this.filamentos = filamentos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
}
