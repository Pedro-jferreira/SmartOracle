package ManagerStock;
import Product.Livro;
import User.Usuario;

import javax.swing.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Reserva implements Serializable {
    private Livro livro;
    private Usuario usuario;
    private Date dataReserva;
    private Emprestimo emprestimo;
    private int id;

    public Reserva() {
    }

    public Reserva(Livro livro, Usuario usuario, Emprestimo emprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataReserva = adicionarUmDia(emprestimo.getDataDevolucao().getTime());
        this.emprestimo = emprestimo;
        livro.setReserva(true);
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

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public void cancelarReserva() {
        livro.setReserva(false);
    }

    public void verificarDataReserva() {
        Calendar dataAtual = Calendar.getInstance();
        Calendar dataReserva = Calendar.getInstance();
        dataReserva.setTime(this.dataReserva);

        if (dataAtual.after(dataReserva)) {
            realizarEmprestimo();
        }
    }

    private void realizarEmprestimo() {
        if (emprestimo != null) {
            if (usuario.atingiuLimiteEmprestimos()) {
                emprestimo.setLivro(livro);
                emprestimo.setUsuario(usuario);
                livro.setReserva(false);
                JOptionPane.showMessageDialog(null, "Empréstimo realizado automaticamente: " + emprestimo);
            } else {
                JOptionPane.showMessageDialog(null,"Limite de empréstimos atingido para o usuário: " + usuario);
            }
        }
    }

    private Date adicionarUmDia(Date data) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        return calendar.getTime();
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "livro=" + livro +
                ", usuario=" + usuario +
                ", dataReserva=" + dataReserva +
                '}';
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
