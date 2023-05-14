package Product;

import java.io.Serializable;

public class Fotografia extends Livro implements Serializable {
    private String qualidade, tamanho;
    private boolean visible;

    public Fotografia() {
    }

    public Fotografia(int id, String titulo, String autores, String area, String ano,boolean midiadigital, String editora, String edicao, String numerodefolhas, String qualidade, String tamanho, boolean visible) {
        super(id, titulo, autores, area, ano,midiadigital, editora, edicao, numerodefolhas);
        this.qualidade = qualidade;
        this.tamanho = tamanho;
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Fotografia{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autores='" + autores + '\'' +
                ", area='" + area + '\'' +
                ", ano='" + ano + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao='" + edicao + '\'' +
                ", numerodefolhas='" + numerodefolhas + '\'' +
                ", emprestimo=" + emprestimo +
                ", qualidade='" + qualidade + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", visible=" + visible +
                '}';
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
