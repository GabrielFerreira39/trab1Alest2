import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("src/teste.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());

        }

    }
}
