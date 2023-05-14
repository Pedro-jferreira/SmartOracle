package Interfaces;

public interface ArraysConfig {
    void PreencherARRAY();
    boolean Add(Object objt);
    boolean Remove(int id);
    boolean Atualizar(Object antigo, Object novo);
    Object BuscarPorId(int id);
    boolean Exist(int id);
    void Listar();
    void Limpar();
}
