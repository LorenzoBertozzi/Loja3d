/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja3d;

/**
 *
 * @author Lorenzo
 */
public class Cliente extends Usuario
{
    private boolean isGerente = Boolean.FALSE;

    public Cliente() {
    }

    public Cliente(String nomeUsuario, String cpfUsuario, String eMail, String telefone, String senha, boolean isGerente, Carrinho carrinho) {
        super(nomeUsuario, cpfUsuario, eMail, telefone, senha, isGerente, carrinho);
    }

    @Override
    public boolean isIsGerente() {
        return isGerente;
    }

    
}
