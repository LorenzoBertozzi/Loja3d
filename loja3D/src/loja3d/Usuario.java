/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja3d;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lorenzo
 */
public abstract class Usuario 
{
 
    private String nomeUsuario;
    private String cpfUsuario;
    private String eMail;
    private String telefone;
    private String senha;
    private boolean isGerente;
    private Carrinho carrinho;

    public Usuario()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("          CADASTRO DE USUARIOS          ");
        
        System.out.print("\nNome : ");
        this.nomeUsuario = in.nextLine();
        
        String CPF;
        do{
            System.out.print("\nCPF : ");
            CPF = in.nextLine();
            if(isCPF(CPF))
            {
                this.cpfUsuario = CPF;
            }
            else
            {
                System.out.println("Cpf Invalido, Tente novamente !!");
            }
        }while(!isCPF(CPF));
        
        String tstEMail;
        do{
            System.out.print("\nE-mail : ");
            tstEMail = in.nextLine();
            if(isValidEmail(tstEMail))
            {
                this.eMail = tstEMail;
            }
            else
            {
                System.out.println("E-mail Invalido, Tente novamente !!");
            }
        }while(!isValidEmail(tstEMail));
        
        System.out.print("\nTelefone : ");
        this.telefone = in.nextLine();
        
        
        String testeSenha, confirmarSenha;
        do{
            System.out.print("\nSenha : ");
            testeSenha = in.nextLine();
            System.out.print("\nConfirmar senha : ");
            confirmarSenha = in.nextLine();
            if(testeSenha == null ? confirmarSenha == null : testeSenha.equals(confirmarSenha))
            {
                this.senha = testeSenha;
            }
            else
            {
                System.out.println("Senha Invalida, Tente novamente !!");
            }
        }while(!testeSenha.equals(confirmarSenha));
                
    }
    
    public Usuario(String nomeUsuario, String cpfUsuario, String eMail, String telefone, String senha, boolean isGerente, Carrinho carrinho) {
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.eMail = eMail;
        this.telefone = telefone;
        this.senha = senha;
        this.isGerente = isGerente;
        this.carrinho = carrinho;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    
    
    public static boolean isCPF(String CPF) 
    {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
    }
    
    public static boolean isValidEmail(String email) 
    {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) 
        {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) 
            {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public boolean isIsGerente() {
        return isGerente;
    }

}
