import java.util.*;


public class Casa{
    private String endereco;
    private List<Comodo> comodos;

    public Casa(String endereco){
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void adicionarComodo(String nome){
        Comodo c = new Comodo(nome);
        comodos.add(c);
    }

    public void ListarComodos(){
        System.out.println("Lista de comodos da Casa:" + endereco);
        for(Comodo c : comodos){
            System.out.println("-" + c.getNome());
        }
    }

}
