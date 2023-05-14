package Interfaces;

public interface DAO {
    boolean Gravar();
    boolean Atualizar(Object obj);
    boolean Excluir();
    Object BuscarPorId(String id);
}
