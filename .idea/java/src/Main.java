import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ditt namn");
        name = scanner.nextLine();

        System.out.println(name);
    }
}
