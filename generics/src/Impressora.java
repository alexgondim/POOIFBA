import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Impressora {

    public static void imprimirLista(List<?> lista){

       for(Object elemento : lista){
           System.out.println(elemento);
       }
    }

}
