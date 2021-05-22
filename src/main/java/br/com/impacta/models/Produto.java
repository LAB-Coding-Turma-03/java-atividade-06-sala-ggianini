package br.com.impacta.models;

import java.util.ArrayList;

public class Produto {

    public int codigo;
    public String descricao;
    public double valor;

    public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codigoProduto) {

    Produto encontrado = null;
    for (Produto produto : listaDeProdutos)
      {
        if (codigoProduto == produto.getCodigo())
            encontrado = produto;
        else encontrado = null;
      }
    return encontrado;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + "]";
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


}
