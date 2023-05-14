package Service;

import Armazenamento.ReservaDAO;
import Interfaces.ArraysConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ReservaList implements ArraysConfig{
    private final ArrayList<ReservaDAO> reservaDAOS = new ArrayList<>();
    @Override
    public void PreencherARRAY() {
        Path folder = Paths.get("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Reservas\\");
        try (Stream<Path> files = Files.walk(folder)) {
            files.filter(Files::isRegularFile).forEach(file -> getReservaDAOS().add((ReservaDAO) new ReservaDAO().BuscarPorId(String.valueOf(file.getFileName()))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean Add(Object objt) {
        ReservaDAO reservadao = (ReservaDAO)objt;
        if (reservadao.Gravar()) {
            getReservaDAOS().add(reservadao);
            return true;
        } else return false;
    }

    @Override
    public boolean Remove(int id) {
        for (ReservaDAO reservadao: getReservaDAOS()) {
            if (reservadao.getId() == id) {
                if (reservadao.Excluir()) {
                    getReservaDAOS().remove(reservadao);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean Atualizar(Object antigo, Object novo) {
        ReservaDAO produtoantigo = (ReservaDAO) antigo;
        if (produtoantigo.Atualizar(novo)) {
            getReservaDAOS().remove(antigo);
            getReservaDAOS().add((ReservaDAO) novo);
            return true;
        } else return false;
    }

    @Override
    public Object BuscarPorId(int id) {
        for (ReservaDAO reservadao : getReservaDAOS()) {
            if (reservadao.getId() == id) {
                return reservadao;
            }
        }
        return null;
    }

    @Override
    public boolean Exist(int id) {
        for (ReservaDAO reservadao : getReservaDAOS()) {
            if (reservadao.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void Listar() {
        for (ReservaDAO reservadao : getReservaDAOS()) {
            System.out.println(reservadao);
        }
    }

    @Override
    public void Limpar() {
        getReservaDAOS().clear();
    }

    public ArrayList<ReservaDAO> getReservaDAOS() {
        return reservaDAOS;
    }
}
