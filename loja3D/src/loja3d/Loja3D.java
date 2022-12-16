/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loja3d;


import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Lorenzo
 */
public class Loja3D
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        //Banco De Dados
        
            ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
            ArrayList<Produto> produtos = new ArrayList<Produto>();
            ArrayList<Filamento> filamentos = new ArrayList<Filamento>();
            ArrayList<Modelo> modelos = new ArrayList<Modelo>();
        
        //ENDbd
        
        Usuario usuarioAtivo = null;
        
        //Loop
        int loop = 0;
        while(loop == 0)
        {
          
            System.out.println("          LOJA IMPRESSOES 3D          ");
            if(usuarioAtivo == null)
            {
                System.out.println("\n 1 - Log-in/Sign-in");

                System.out.print("infome a opcao : ");

                int opcao = in.nextInt();

                switch(opcao)
                {
                    case 1 -> 
                    {
                        System.out.println("          LOG-IN/SIGN-IN          ");
                        System.out.println("\n 1 - Log-in");
                        System.out.println(" 2 - Sign-in");          
                        System.out.print("infome a opcao : ");
                        int opcaoLS = in.nextInt();


                        switch(opcaoLS)
                        {
                            case 1 -> 
                            {   
                                System.out.println("          LOG-IN         ");
                                System.out.print("\n Nome : ");
                                String loginNome = in.next();
                                System.out.print("\nSenha : ");
                                String loginSenha = in.next();

                                for(int i = 0; i < usuarios.size();i++)
                                {
                                    if(usuarios.get(i).getNomeUsuario().equals(loginNome))
                                    {
                                        if(usuarios.get(i).getSenha().equals(loginSenha))
                                        {
                                            usuarioAtivo = usuarios.get(i);
                                            System.out.println("Login feito");
                                            break;
                                        }
                                    }
                                }

                             }
                            case 2 -> 
                            {
                                System.out.println("          SIGN-IN         ");
                                System.out.println("\nCadastrar-se como gerente ? (1 - sim, Any - nao) : ");
                                int isGerente = in.nextInt();
                                if(isGerente == 1)
                                {
                                    Gerente gerenteN = new Gerente();
                                    usuarios.add(gerenteN);
                                    System.out.println("Cadastro concluido!!");
                                }
                                else
                                {
                                    Cliente clienteN = new Cliente();
                                    usuarios.add(clienteN);
                                    System.out.println("Cadastro concluido!!");
                                }
                             }
                        }
                    }
                } 
            }
            else
            {
                if(usuarioAtivo.isIsGerente())
                {
                    System.out.println("          MENU DE GERENCIAMENTO         ");
                    System.out.println("\n 1 - Adicionar Produto ");
                    System.out.println(" 2 - Remover Produto !!");
                    System.out.println(" 3 - Adicionar Filamento");
                    System.out.println(" 4 - Remover Filamento !!");
                    System.out.println(" 5 - Adicionar Modelo");
                    System.out.println(" 6 - Remover modelo !!");
                    System.out.println(" 7 - Relatorio de vendas ");
                    System.out.println(" 0 - Sair");
                    
                    System.out.print("\n Informe a opcao : ");
                    int opcaoGerente = in.nextInt();
                    
                    switch(opcaoGerente)
                    {
                        case 0 ->
                        {
                            
                            usuarioAtivo = null;
                            
                        }
                        case 1 -> 
                        {
                            
                            System.out.println("\n          ADICIONAR PRODUTO         ");
                            
                            Produto produto = new Produto();
                            produtos.add(produto);
                            System.out.println("Produto Adicionado!!");
                                                        
                        }
                        case 2 -> 
                        {
                            
                            
                            
                        }
                        case 3 -> 
                        {
                            
                            System.out.println("\n          ADICIONAR FILAMENTO         ");
                            
                            Filamento filamento = new Filamento();
                            filamentos.add(filamento);
                            System.out.println("Filamento Adicionado!!");
                            
                        }
                        case 4 -> 
                        {
                            
                            
                            
                        }
                        case 5 -> 
                        {
                            
                            System.out.println("\n          ADICIONAR MODELO         ");
                            
                            Modelo modelo = new Modelo();
                            modelos.add(modelo);
                            System.out.println("Modelo Adicionado!!");
                            
                        }
                        case 6 -> 
                        {
                            
                            
                            
                        }
                        case 7 -> 
                        {
                            
                            System.out.println("\n          RELATORIO DE VENDAS         ");
                            System.out.println("\nCompra de Produtos:");
                            for(int i = 0; i < usuarios.size();i++)
                            {
                                usuarios.get(i).getCarrinho().getHistoricoCompraProuto();
                            }
                            System.out.println("\nCompra de Produtos Customizados:");
                            for(int i = 0; i < usuarios.size();i++)
                            {
                                usuarios.get(i).getCarrinho().getHistoricoCompraProdutoCustomizados();
                            }
                        }
                        default -> 
                        {
                            
                            System.out.println("Opção invalida !!");
                            
                        }
                    }
                    
                    
                }
                else
                {
                    System.out.println("          MENU DE COMPRA        ");
                    System.out.println("\n 1 - Exibir produtos");
                    System.out.println(" 2 - Buscar produtos");
                    System.out.println(" 3 - Adicionar Produto ao Carrinho");
                    System.out.println(" 4 - Adicionar produto customizado ao Carrinho");
                    System.out.println(" 5 - Visitar Carrinho");
                    System.out.println(" 0 - Sair");
                    
                    System.out.print("\n Informe a opcao : ");
                    int opcaoCompra = in.nextInt();
                    
                    switch (opcaoCompra) 
                    {
                    
                        case 0 ->
                        {
                            
                            usuarioAtivo = null;
                            
                        }
                        case 1 -> 
                        {
                            
                             System.out.println("\n          EXIBIR PRODUTOS         ");
                             for(int i = 0; i < produtos.size(); i++)
                             {
                                 System.out.println(""+produtos.get(i).toString());
                             }
                               
                        }
                        case 2 -> 
                        {
                            
                            System.out.println("\n          BUSCAR PRODUTOS         ");
                            System.out.println("Informe o Nome do produto :");
                            String pesquisaProduto = in.next();
                            
                            for(int i = 0; i < produtos.size(); i++)
                             {
                                 if(produtos.get(i).getNome() == null ? pesquisaProduto == null : produtos.get(i).getNome().equals(pesquisaProduto))
                                 {
                                     System.out.println(""+produtos.get(i).toString());
                                 }
                             }
                            
                        }
                        case 3 -> 
                        {
                            
                            
                            
                        }
                        case 4 -> 
                        {
                            
                            
                            
                        }
                        case 5 -> 
                        {
                            
                            System.out.println("          CARRINHO         ");
                            System.out.println("\n 1 - Exibir Carrinho");
                            System.out.println(" 2 - Exibir Historico de Compras");
                            System.out.println(" 3 - Remover produto do Carrinho");
                            System.out.println(" 4 - Total ");
                            System.out.println(" 5 - Comprar tudo");
                            System.out.println(" 6 - Comprar Produto");
                            
                            System.out.print("\n Informe a opcao : ");
                            int opcaoCarrinho = in.nextInt();
                            
                            switch(opcaoCarrinho)
                            {
                                case 1 -> 
                                {
                                    
                                    
                                    
                                }
                                case 2 -> 
                                {
                                    
                                    
                                    
                                }
                                case 3 -> 
                                {
                                    
                                    
                                    
                                }
                                case 4 -> 
                                {
                                    
                                    
                                    
                                }
                                case 5 -> 
                                {
                                    
                                    
                                    
                                }
                                case 6 -> 
                                {
                                    
                                    
                                    
                                }
                                default ->
                                {
                                        
                                    System.out.println("Opção invalida !!");
                                    
                                }
                            }
                            
                        }
                        default -> 
                        {
                            
                            System.out.println("Opção invalida !!");
                            
                        }
                        
                    }
                }
            }
            
            System.out.println("DESEJA CONTINUAR NO PROGRAMA ? (0 - sim , any - nao) ");
            loop = in.nextInt();
        }
        //ENDloop

        
    }
    
}
