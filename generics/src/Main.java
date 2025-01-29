import java.util.*;

public class Main {

    public static void main(String[] args) {

        Par<String, Integer> par1 = new Par<>("A", 1);
        Par<String, Integer> par2 = new Par<>("B", 2);
        Par<String, Integer> par3 = new Par<>("C", 3);
        Par<String, Integer> par4 = new Par<>("D", 4);
        Par<String, Integer> par5 = new Par<>("E", 5);
        Par<String, Integer> par6 = new Par<>("F", 6);
        Par<String, Integer> par7 = new Par<>("G", 7);
        Par<String, Integer> par8 = new Par<>("H", 8);
        Par<String, Integer> par9 = new Par<>("I", 9);
        Par<String, Integer> par10 = new Par<>("J", 10);
        Par<String, Integer> par11 = new Par<>("K", 11);
        Par<String, Integer> par12 = new Par<>("L", 12);
        Par<String, Integer> par13 = new Par<>("M", 13);
        Par<String, Integer> par14 = new Par<>("N", 14);
        Par<String, Integer> par15 = new Par<>("O", 15);
        Par<String, Integer> par16 = new Par<>("P", 16);
        par1.setPrimeiro("g");
        par2.setSegundo(30);
        par3.setPrimeiro("g");
        par4.setSegundo(14);
        System.out.println(par1.getSegundo());
        System.out.println(par2.getSegundo());



        Map<Integer, String> nomes = new LinkedHashMap<>();
        nomes.put(5, "Alex");
        nomes.put(4,"Carlos");
        nomes.put(3,"Bruna");
        nomes.put(9,"Paulo");
        nomes.put(6,"xuxa");
        nomes.put(8, "Jose");
        nomes.put(1, "viviane");
        nomes.put(10,"Olmar");
        nomes.put(2, "Alana");



        for (String nome : nomes.values()) {
            System.out.println(nomes);
        }

    }
}