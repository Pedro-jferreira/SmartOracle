package Product;

import java.io.File;
import java.io.Serializable;

public class Produto implements Serializable {
    private Obra obra;

    public Produto() {
    }

    public Produto(Obra obra) {
        this.obra = obra;

    }

    @Override
    public String toString() {
        return "Produto{" +
                "obra=" + obra +
                ", emprestimo=" + obra.isEmprestimo() +
                '}';
    }

    public int getId(){
        return getObra().getId();
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public boolean isEmprestimo() {
        return obra.isEmprestimo();
    }

    public void setEmprestimo(boolean emprestimo){
        obra.setEmprestimo(emprestimo);
    }
    public static boolean ObraExist(int id){
        return new File("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\3° periodo\\programação oo\\SmartOracle\\Obras\\"+id).exists();
    }
}
