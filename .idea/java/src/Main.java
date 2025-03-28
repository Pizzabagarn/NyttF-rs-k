import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String name;
        Scanner scanner = new Scanner(System.in);
        Lowisa l1 = new Lowisa();

        System.out.println("Skriv in ditt namn");
        name = scanner.nextLine();
        name.toLowerCase();

        if(name == "lowisa")
        {
            l1.hello();
        }

        if(name == "mena")
        {

        }






    }
}
