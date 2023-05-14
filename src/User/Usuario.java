package User;

import java.io.File;
import java.io.Serializable;

public class Usuario implements Serializable {
    private Pessoa pessoa;
    private Password password;
    private int emprestimos;

    public Usuario() {
        this.emprestimos = 0;
    }

    public Usuario(Pessoa pessoa, Password password) {
        this.pessoa = pessoa;
        this.password = password;
        this.emprestimos = 0;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "pessoa=" + pessoa +
                ", password=" + password +
                '}';
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getCpf() {
        return pessoa.getCpf();
    }

    public void LerLivro() {
        System.out.println("Usuário está lendo o livro");
    }

    public static boolean UsuarioExist(String id) {
        return new File("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Usuarios\\" + id).exists();
    }

    public int getEmprestimos() {
        return emprestimos;
    }

    public void incrementarContadorEmprestimos() {
        emprestimos++;
    }

    public boolean atingiuLimiteEmprestimos() {
        if (getPessoa() instanceof Estudante && emprestimos >= 3) {
            return true;
        } else if (getPessoa() instanceof Funcionario && emprestimos >= 6) {
            return true;
        } else return getPessoa() instanceof Professor && emprestimos >= 9;
    }
}

