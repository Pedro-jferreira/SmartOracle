package User;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {
    protected String setor,salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, String idade, String sexo, String telefone, String setor, String salario) {
        super(cpf, nome, idade, sexo, telefone);
        this.setor = setor;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                ", setor='" + setor + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
