import java.util.List;
import java.util.ArrayList;

public class Dapartamento {
   private String nome;
   private List<Professor> professores;

   public Dapartamento(String nome){
       this.nome = nome;
       this.professores = new ArrayList<>();
   }

   public void addProfessor(Professor professor){
       this.professores.add(professor);
   }

   public void listarProfessores(){
       System.out.println("Professores do Dapartamento" + nome + ":");
       for(Professor p : professores){
           System.out.println("-" + p.getNome());
       }

   }
}
