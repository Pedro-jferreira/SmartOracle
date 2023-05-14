import Armazenamento.ProdutoDAO;
import Product.Livro;
import Product.Produto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtodao = new ProdutoDAO();
        produtodao.setObra(new Livro(1, "a procura da morte", "eu", "uma ai", "2001", true, "alguma", "3", "200"));

        if (produtodao.Gravar()){
            JOptionPane.showMessageDialog(null, "livro gravado com sucesso");
        }
        System.out.println(Produto.ObraExist(1));
        System.out.println(produtodao);
        ProdutoDAO produtodao1 = new ProdutoDAO();
        produtodao1.setObra(new Livro(1, "a procura da morte", "eu e eu", "uma ai", "2001", true, "alguma", "3", "200"));

        System.out.println(produtodao1);
        if (produtodao.Atualizar(produtodao1)){
            JOptionPane.showMessageDialog(null, "usuario atualizado com sucesso!");
        }
        System.out.println(produtodao);

        ProdutoDAO produtodao2 = (ProdutoDAO) new ProdutoDAO().BuscarPorId("1");
        produtodao2.Excluir();
        System.out.println(produtodao2);






    }
}