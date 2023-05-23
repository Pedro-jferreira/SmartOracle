import Armazenamento.EmprestimoDAO;
import Product.Livro;
import User.Password;
import User.Professor;
import User.Usuario;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        EmprestimoDAO emprestimoDAO= new EmprestimoDAO();
        emprestimoDAO.setId(1);
        emprestimoDAO.setUsuario(new Usuario(1,new Professor(" ", "","" , "", "", "", "", ""),new Password("Aa345678")));
        emprestimoDAO.setLivro(new Livro(1, "", "", "", "", true, "", "", ""));
        emprestimoDAO.setDataEmprestimo(Calendar.getInstance());
        emprestimoDAO.setDataDevolucao(Calendar.getInstance());
        emprestimoDAO.getDataDevolucao().add(Calendar.DAY_OF_MONTH, emprestimoDAO.calcularPrazoEmprestimo(emprestimoDAO.getUsuario()));
        String formato = "dd/MM/yyyy";

        // Cria um objeto SimpleDateFormat com o formato desejado
        SimpleDateFormat sdf = new SimpleDateFormat(formato);

        // Formata a data para uma string
        String dataFormatada = sdf.format(emprestimoDAO.getDataDevolucao().getTime());

        System.out.println("Data formatada: " + dataFormatada);

    }
}