package Product;

import java.io.Serializable;

public class MidiaAudio extends Livro implements Serializable {

    private String codec,minutos;

    public MidiaAudio() {
    }

    public MidiaAudio(int id, String titulo, String autores, String area, String ano,boolean midiadigital, String editora, String edicao, String numerodefolhas, String codec, String minutos) {
        super(id, titulo, autores, area, ano,midiadigital, editora, edicao, numerodefolhas);
        this.codec = codec;
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "MidiaAudio{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autores='" + autores + '\'' +
                ", area='" + area + '\'' +
                ", ano='" + ano + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao='" + edicao + '\'' +
                ", numerodefolhas='" + numerodefolhas + '\'' +
                ", codec='" + codec + '\'' +
                ", minutos='" + minutos + '\'' +
                ", emprestimo=" + emprestimo +
                '}';
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }
}
