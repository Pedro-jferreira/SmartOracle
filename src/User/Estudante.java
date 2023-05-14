package User;

import java.io.Serializable;

public class Estudante extends Pessoa implements Serializable {
    private String curso,periodo,sala;

    public Estudante() {
    }

    public Estudante(String cpf, String nome, String idade, String sexo, String telefone, String curso, String periodo, String sala) {
        super(cpf, nome, idade, sexo, telefone);
        this.curso = curso;
        this.periodo = periodo;
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                ", curso='" + curso + '\'' +
                ", periodo='" + periodo + '\'' +
                ", sala='" + sala + '\'' +
                '}';
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
