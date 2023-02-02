import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Double> list = new HashMap<>();
        list.put("Zemiau", 0.5);
        list.put("Norma", 1.0);
        list.put("Auksciau", 1.5);
        String norma;
        double bazinisAtlyginimas;
        double menesioNorma;

        System.out.println("Apskaita v.1.0 ");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Įveskite darbuotojo bazinį atlyginimą:");
        bazinisAtlyginimas = input.nextDouble();
        System.out.println("Įveskite darbuotojo normą: ");
        System.out.println(list);
        norma = input2.nextLine();

        while (!list.containsKey(norma)) {
            System.out.println("Tokio nėra");
            System.out.println("Įveskite darbuotojo normą: ");
            norma = input2.nextLine();
        }
        menesioNorma = list.get(norma);
        skaiciuotiAtlyginima(bazinisAtlyginimas, menesioNorma);
    }

    static void skaiciuotiAtlyginima(double bazinisAtlyginimas, double norma) {
        System.out.println(bazinisAtlyginimas + " * " + norma + " = " + bazinisAtlyginimas * norma);
    }
}
