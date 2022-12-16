/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja3d;

import java.awt.Point;

/**
 *
 * @author Lorenzo
 */
public class Gerente extends Usuario
{
    private boolean isGerente = Boolean.TRUE;

    public Gerente() {
    }

    public Gerente(String nomeUsuario, String cpfUsuario, String eMail, String telefone, String senha, boolean isGerente, Carrinho carrinho) {
        super(nomeUsuario, cpfUsuario, eMail, telefone, senha, isGerente, carrinho);
    }

    public boolean isIsGerente() {
        return isGerente;
    }
    
}
