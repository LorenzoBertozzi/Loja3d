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
public class Cor 
{
    private String cor;

    public Cor()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("          CADASTRO DE COR          ");
        
        System.out.print("\nCor : ");
        this.cor = in.next();
        
    }
    
    public Cor(String cor) 
    {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
