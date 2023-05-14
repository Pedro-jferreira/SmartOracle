package Service;

import Armazenamento.ProdutoDAO;
import Interfaces.ArraysConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ProdutoList implements ArraysConfig {
    private final ArrayList<ProdutoDAO> produtoDAOS = new ArrayList<>();
    @Override
    public void PreencherARRAY() {
        Path folder = Paths.get("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Obras\\");
        try (Stream<Path> files = Files.walk(folder)) {
            files.filter(Files::isRegularFile).forEach(file -> getProdutoDAOS().add((ProdutoDAO) new ProdutoDAO().BuscarPorId(String.valueOf(file.getFileName()))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean Add(Object objt) {
        ProdutoDAO produtoDAO = (ProdutoDAO)objt;
        if (produtoDAO.Gravar()) {
            getProdutoDAOS().add(produtoDAO);
            return true;
        } else return false;
    }

    @Override
    public boolean Remove(int id) {
        for (ProdutoDAO produtoDAO: getProdutoDAOS()) {
            if (produtoDAO.getId() == id) {
                if (produtoDAO.Excluir()) {
                    getProdutoDAOS().remove(produtoDAO);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean Atualizar(Object antigo, Object novo) {
        ProdutoDAO produtoantigo = (ProdutoDAO) antigo;
        if (produtoantigo.Atualizar(novo)) {
            getProdutoDAOS().remove(antigo);
            getProdutoDAOS().add((ProdutoDAO) novo);
            return true;
        } else return false;
    }

    @Override
    public Object BuscarPorId(int id) {
        for (ProdutoDAO produtoDAO : getProdutoDAOS()) {
            if (produtoDAO.getId() == id) {
                return produtoDAO;
            }
        }
        return null;
    }

    @Override
    public boolean Exist(int id) {
        for (ProdutoDAO produtoDAO : getProdutoDAOS()) {
            if (produtoDAO.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void Listar() {
        for (ProdutoDAO produtoDAO : getProdutoDAOS()) {
            System.out.println(produtoDAO);
        }
    }

    @Override
    public void Limpar() {
        getProdutoDAOS().clear();
    }

    public ArrayList<ProdutoDAO> getProdutoDAOS() {
        return produtoDAOS;
    }
}
