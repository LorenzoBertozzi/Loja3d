/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja3d;

import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class Carrinho 
{
    private ArrayList<Produto> produtos;
    private ArrayList<ProdutoCustomizado> produtosCustomizados;
    private ArrayList<Produto> historicoCompraProuto;
    private ArrayList<ProdutoCustomizado> historicoCompraProdutoCustomizados;

    public Produto getProdutos(int posicao) {
        return produtos.get(posicao);
    }

    public void setProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public ProdutoCustomizado getProdutosCustomizados(int posicao) {
        return produtosCustomizados.get(posicao);
    }

    public void setProdutosCustomizados(ProdutoCustomizado produtosCustomizados) {
        this.produtosCustomizados.add(produtosCustomizados);
    }

    public void getHistoricoCompraProuto() {
        for(int i = 0; i < historicoCompraProuto.size();i++)
        {
            System.out.println("Nome : "+historicoCompraProuto.get(i).getNome()+", Preço : "+historicoCompraProuto.get(i).getPreco());
        }
    }

    public void setHistoricoCompraProuto(Produto historicoCompraProuto) {
        this.historicoCompraProuto.add(historicoCompraProuto);
    }

    public void getHistoricoCompraProdutoCustomizados() 
    {
        for(int i = 0; i < historicoCompraProuto.size();i++)
        {
            System.out.println("Nome : "+historicoCompraProdutoCustomizados.get(i).getNome()+", Preço : "+historicoCompraProdutoCustomizados.get(i).getPreco());
        }
    }

    public void setHistoricoCompraProdutoCustomizados(ProdutoCustomizado historicoCompraProdutoCustomizados) {
        this.historicoCompraProdutoCustomizados.add(historicoCompraProdutoCustomizados); 
    }

}
