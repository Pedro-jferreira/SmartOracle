package ManagerStock;

import Product.Livro;
import User.Estudante;
import User.Funcionario;
import User.Professor;
import User.Usuario;

import java.io.Serializable;
import java.util.Calendar;

public class Emprestimo implements Serializable {
    private Livro livro;
    private Usuario usuario;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;
    private int id;

    public Emprestimo() {
    }

    public Emprestimo(int id ,Livro livro, Usuario usuario) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = Calendar.getInstance();
        this.dataDevolucao = Calendar.getInstance();
        getDataDevolucao().add(Calendar.DAY_OF_MONTH, calcularPrazoEmprestimo(getUsuario()));
        livro.setEmprestimo(true);
        usuario.incrementarContadorEmprestimos();
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void DevolverLivro() {
        livro.setEmprestimo(false);
    }

    public void AbrirLivro() {
        livro.AbrirLivro();
    }

    public void LerLivro() {
        usuario.LerLivro();
    }

    public void FecharLivro() {
        livro.FecharLivro();
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int calcularPrazoEmprestimo(Usuario usuario) {

        if (usuario.getPessoa() instanceof Estudante) {
            return 7;
        } else if (usuario.getPessoa() instanceof Funcionario) {
            return 15;
        } else if (usuario.getPessoa() instanceof Professor) {
            return 30;
        } else {
            return 0;

        }
    }
}



