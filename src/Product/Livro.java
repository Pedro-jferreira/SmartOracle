package Product;

import java.io.Serializable;

public class Livro extends Obra implements Serializable {

    protected String editora,edicao,numerodefolhas;
    protected boolean emprestimo,reserva;

    public Livro() {
    }

    public Livro(int id, String titulo, String autores, String area, String ano,boolean midiadigital, String editora, String edicao, String numerodefolhas) {
        super(id, titulo, autores, area, ano,midiadigital);
        this.editora = editora;
        this.edicao = edicao;
        this.numerodefolhas = numerodefolhas;
        this.emprestimo = false;
        this.reserva = false;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autores='" + autores + '\'' +
                ", area='" + area + '\'' +
                ", ano='" + ano + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao='" + edicao + '\'' +
                ", numerodefolhas='" + numerodefolhas + '\'' +
                ", emprestimo=" + emprestimo +
                '}';
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getNumerodefolhas() {
        return numerodefolhas;
    }

    public void setNumerodefolhas(String numerodefolhas) {
        this.numerodefolhas = numerodefolhas;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void AbrirLivro(){
        System.out.println("livro está aberto");
    }
    public void FecharLivro(){
        System.out.println("livro está fechado");
    }
}
