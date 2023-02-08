import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, Double> list = new HashMap<>();
    static Scanner input2 = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {



        String norma;
        double bazinisAtlyginimas;
        double menesioNorma;
        ivestiNormuSarasa();
        System.out.println("Apskaita v.1.0 ");
        System.out.println("Įveskite darbuotojo bazinį atlyginimą:");
        bazinisAtlyginimas = input.nextDouble();
        System.out.println("Įveskite darbuotojo normą: ");
        System.out.println(list);
        norma = tikrintiNorma(input2.nextLine());
        menesioNorma = list.get(norma);
        skaiciuotiAtlyginima(bazinisAtlyginimas, menesioNorma);
        skaiciuotiAtlyginima(bazinisAtlyginimas);

    }
    /**
     * Skaičiuojamas atlyginimas
     *
     * @param bazinisAtlyginimas atlyginimo dydis
     * @param norma              normos reikšmė
     */
    static void skaiciuotiAtlyginima(double bazinisAtlyginimas, double norma) {

        System.out.println(bazinisAtlyginimas + " * " + norma + " = " + String.format("%.2f", bazinisAtlyginimas * norma));
    }

    /**
     * Įvedamas "normų" sąrašas
     */
    static void ivestiNormuSarasa(){
        list.put("Zemiau", 0.5);
        list.put("Norma", 1.0);
        list.put("Auksciau", 1.5);
    }
    /**
     * Test su ta pačia f-ja, tik vienu parametru
     *
     * @param bazinisAtlyginimas test
     */
    static void skaiciuotiAtlyginima(double bazinisAtlyginimas) {
        System.out.printf("%.3f%n", bazinisAtlyginimas * 1.15);
    }
    /**
     * Tikrina ar yra tokia norma sąraše
     *
     * @param norma Nurodoma norma
     */
    static String tikrintiNorma(String norma) {

        while (!list.containsKey(norma)) {
            System.out.println("Tokio nėra");
            System.out.println("Įveskite darbuotojo normą: ");
            norma = input2.nextLine();
        }
        return norma;

    }
}
