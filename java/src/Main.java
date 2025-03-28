
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String text;
        Scanner scanner = new Scanner(System.in);
        Lowisa l1 = new Lowisa();
        Mena m1 = new Mena();

        System.out.println("Varsågod och skriv: ");
        text = scanner.nextLine();
        text.toLowerCase();

        if(text.equals("lowisa"))
        {
            l1.hello();
        }

        if(text.equals("mena"))
        {
            m1.mena();
        }
        if (text.equals("lowisa food"))
        {
            l1.food();
        }
        if (text.equals("mena food"))
        {
            m1.food();
        }






    }
}
