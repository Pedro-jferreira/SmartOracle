package Database;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    private String str_conexao;
    private String driver;
    private String bd;
    private String user;
    private String senha;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public Conexao(String porta, String bd, String user, String senha) {
        this.bd = bd;
        this.user = user;
        this.senha = senha;
        setStr_conexao("jdbc:mysql://"+ porta +"/"+ getBd());
        setDriver("com.mysql.jdbc.Driver");
    }
    public void conecta(){
        try {
            Class.forName(getDriver());
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "Peheje5u$");

            setStatement((Statement) getConnection().createStatement());
            JOptionPane.showMessageDialog(null, "conexão Realizada com sucesso");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void desconecta(){
        try {
            getResultSet().close();
            getStatement().close();
            getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public ResultSet ExecuteQuery(String sql){
        try {
            return getStatement().executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void configUser(String user, String senha) {
        setUser(user);
        setSenha(senha);
    }

    public String getStr_conexao() {
        return str_conexao;
    }

    public void setStr_conexao(String str_conexao) {
        this.str_conexao = str_conexao;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public static void main(String[] args) {

        Conexao conexao = new Conexao("127.0.0.1:3306", "conecta","root","Peheje5u$");
        conexao.conecta();
        conexao.ExecuteQuery("SELECT * FROM filmes");
        System.out.println(conexao.getResultSet());
    }
}
