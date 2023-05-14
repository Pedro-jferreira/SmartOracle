package User;

import javax.swing.*;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password implements Serializable {
    private String senha;
    private boolean valide;

    public Password() {
    }

    public Password(String senha) {
        if (ValidaPassword(senha)){
            this.senha = senha;
            this.valide = true;
        }else {
            this.valide = false;
        }
    }

    @Override
    public String toString() {
        return "Password{" +
                "senha='" + senha + '\'' +
                ", valide=" + valide +
                '}';
    }

    public boolean isValide() {
        return valide;
    }

    public void setValide(boolean valide) {
        this.valide = valide;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (ValidaPassword(senha)){
            setValide(true);
            this.senha = senha;
        }else {
            setValide(false);
            JOptionPane.showMessageDialog(null, "senha incorreta");
        }
    }
    public static boolean ValidaPassword(String senha) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8}$");
        Matcher matcher = pattern.matcher(senha);
        return matcher.matches();
    }
}
