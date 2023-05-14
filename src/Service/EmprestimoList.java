package Service;

import Armazenamento.EmprestimoDAO;
import Interfaces.ArraysConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class EmprestimoList implements ArraysConfig {
    private final ArrayList<EmprestimoDAO> emprestimoDAOS = new ArrayList<>();
    @Override
    public void PreencherARRAY() {
        Path folder = Paths.get("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Emprestimos\\");
        try (Stream<Path> files = Files.walk(folder)) {
            files.filter(Files::isRegularFile).forEach(file -> getEmprestimoDAOS().add((EmprestimoDAO) new EmprestimoDAO().BuscarPorId(String.valueOf(file.getFileName()))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean Add(Object objt) {
        EmprestimoDAO emprestimodao = (EmprestimoDAO)objt;
        if (emprestimodao.Gravar()) {
            getEmprestimoDAOS().add(emprestimodao);
            return true;
        } else return false;
    }

    @Override
    public boolean Remove(int id) {
        for (EmprestimoDAO emprestimodao: getEmprestimoDAOS()) {
            if (emprestimodao.getId() == id) {
                if (emprestimodao.Excluir()) {
                    getEmprestimoDAOS().remove(emprestimodao);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean Atualizar(Object antigo, Object novo) {
        EmprestimoDAO produtoantigo = (EmprestimoDAO) antigo;
        if (produtoantigo.Atualizar(novo)) {
            getEmprestimoDAOS().remove(antigo);
            getEmprestimoDAOS().add((EmprestimoDAO) novo);
            return true;
        } else return false;
    }

    @Override
    public Object BuscarPorId(int id) {
        for (EmprestimoDAO emprestimodao : getEmprestimoDAOS()) {
            if (emprestimodao.getId() == id) {
                return emprestimodao;
            }
        }
        return null;
    }

    @Override
    public boolean Exist(int id) {
        for (EmprestimoDAO emprestimodao : getEmprestimoDAOS()) {
            if (emprestimodao.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void Listar() {
        for (EmprestimoDAO emprestimodao : getEmprestimoDAOS()) {
            System.out.println(emprestimodao);
        }
    }

    @Override
    public void Limpar() {
        getEmprestimoDAOS().clear();
    }

    public ArrayList<EmprestimoDAO> getEmprestimoDAOS() {
        return emprestimoDAOS;
    }
}
