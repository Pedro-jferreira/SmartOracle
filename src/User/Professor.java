package User;

import java.io.Serializable;

public class Professor extends Funcionario implements Serializable {
    private String formacao;

    public Professor() {
    }

    public Professor(String cpf, String nome, String idade, String sexo, String telefone, String setor, String salario, String formacao) {
        super(cpf, nome, idade, sexo, telefone, setor, salario);
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                ", setor='" + setor + '\'' +
                ", salario='" + salario + '\'' +
                ", formacao='" + formacao + '\'' +
                '}';
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
