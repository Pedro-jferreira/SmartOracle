package Service;

import Armazenamento.UsuarioDAO;
import Interfaces.ArraysConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class UsuarioList implements ArraysConfig {
    private final ArrayList<UsuarioDAO> usuarioDAOS = new ArrayList<>();

    @Override
    public void PreencherARRAY() {
        Path folder = Paths.get("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Usuarios\\");
        try (Stream<Path> files = Files.walk(folder)) {
            files.filter(Files::isRegularFile).forEach(file -> getUsuarioDAOS().add((UsuarioDAO) new UsuarioDAO().BuscarPorId(String.valueOf(file.getFileName()))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean Add(Object objt) {
        UsuarioDAO usuarioDAO = (UsuarioDAO) objt;
        if (usuarioDAO.Gravar()) {
            getUsuarioDAOS().add(usuarioDAO);
            return true;
        } else return false;
    }

    @Override
    public boolean Remove(int id) {
        for (UsuarioDAO usuarioDAO : getUsuarioDAOS()) {
            if (usuarioDAO.getId() == id) {
                if (usuarioDAO.Excluir()) {
                    getUsuarioDAOS().remove(usuarioDAO);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean Atualizar(Object antigo, Object novo) {
        UsuarioDAO userantigo = (UsuarioDAO) antigo;
        if (userantigo.Atualizar(novo)) {
            getUsuarioDAOS().remove(antigo);
            getUsuarioDAOS().add((UsuarioDAO) novo);
            return true;
        } else return false;

    }


    @Override
    public Object BuscarPorId(int id) {
        for (UsuarioDAO usuarioDAO : getUsuarioDAOS()) {
            if (usuarioDAO.getId() == id) {
                return usuarioDAO;
            } else return null;
        }
        return null;
    }

    @Override
    public boolean Exist(int id) {
        for (UsuarioDAO usuarioDAO : getUsuarioDAOS()) {
            if (usuarioDAO.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void Listar() {
        for (UsuarioDAO usuarioDAO : getUsuarioDAOS()) {
            System.out.println(usuarioDAO);
        }

    }

    @Override
    public void Limpar() {
        getUsuarioDAOS().clear();
    }


    public ArrayList<UsuarioDAO> getUsuarioDAOS() {
        return usuarioDAOS;
    }

}
