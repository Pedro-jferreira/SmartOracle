package Armazenamento;

import Interfaces.DAO;
import Product.Produto;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProdutoDAO extends Produto implements DAO {


    @Override
    public boolean Gravar() {
        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Obras\\"+this.getId());
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro ao gravar o arquivo.\nErro: "+e);
            return false;
        }
    }

    @Override
    public boolean Atualizar(Object obj) {
        if (Excluir()){
            ProdutoDAO produtoDAO = (ProdutoDAO) obj;
            return produtoDAO.Gravar();
        }else return false;
    }


    @Override
    public boolean Excluir() {
        Path path = Paths.get("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Obras\\"+this.getId());
        try {
            Files.delete(path);
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao apagar o arquivo.\nErro: " + e);
            return false;
        }
    }

    @Override
    public Object BuscarPorId(String id) {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Obras\\"+id);
            ObjectInputStream stream = new ObjectInputStream(file);
            Object obj = stream.readObject();
            stream.close();
            file.close();
            return obj;
        } catch (Exception erro) {
            System.out.println("Falha na leitura \nErro: " + erro);
            return null;
        }
    }
}
