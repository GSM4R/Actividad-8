import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer perro:");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese la raza del primer perro:");
        String raza1 = scanner.nextLine();

        System.out.println("Ingrese la edad del primer perro (en años):");
        int edad1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el peso del primer perro (en kg):");
        double peso1 = Double.parseDouble(scanner.nextLine());


        Perro perro1 = new Perro(nombre1, raza1, edad1, peso1);

        System.out.println("Ingrese el nombre del segundo perro:");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese la raza del segundo perro:");
        String raza2 = scanner.nextLine();

        System.out.println("Ingrese la edad del segundo perro (en años):");
        int edad2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el peso del segundo perro (en kg):");
        double peso2 = Double.parseDouble(scanner.nextLine());

        Perro perro2 = new Perro(nombre2, raza2, edad2, peso2);

        perro1.comer("croquetas", 500);
        System.out.println(perro1.ladrar());

        perro2.comer("carne", 300);
        System.out.println(perro2.ladrar());

        System.out.println("Los perros han comido y han ladrado.");

    }
}