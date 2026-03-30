import modelo.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        List<Personagem> trio = new ArrayList<>();

        trio.add(new Guerreiro("Aragorn", 10, 1.5));
        trio.add(new Mago("Gandalf", 20, 100));

        System.out.println("--- DEMONSTRAÇÃO DE POLIMORFISMO ---");
        for (Personagem p : trio) {
            System.out.println(p.toString());
            p.atacar();
            System.out.println("-----------------------------------");
        }
    }
}
