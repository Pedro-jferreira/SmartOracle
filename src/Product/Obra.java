package Product;

import java.io.File;
import java.io.Serializable;

abstract class Obra implements Serializable {
    protected int id;
    protected String titulo,autores,area,ano;
    private boolean emprestimo,midiadigital,reserva;

    public Obra() {
    }

    public Obra(int id, String titulo, String autores, String area, String ano, boolean midiadigital) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.ano = ano;
        this.midiadigital =midiadigital;
        this.emprestimo = false;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autores='" + autores + '\'' +
                ", area='" + area + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }

    public boolean isMidiadigital() {
        return midiadigital;
    }

    public void setMidiadigital(boolean midiadigital) {
        this.midiadigital = midiadigital;
    }

}
