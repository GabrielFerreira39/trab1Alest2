import java.io.File;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("src/teste.txt"));
        ArrayList<String> texto = new ArrayList<>();
        while (sc.hasNextLine()) {
            texto.add(sc.nextLine());
        }

        // for (int i = 0; i < text.size(); i++) {
        // System.out.println(text.get(i));
        // }
        String firstLine = texto.get(0);

        List<String> test = Arrays.asList(firstLine.split(" "));
        int turns = Integer.parseInt(test.get(1));
        System.out.println(turns);

        String fourthLine = texto.get(4);
        System.out.println(fourthLine);

        List<String> monkey = Arrays.asList(fourthLine.split(" "));
        int monkeyNumber = Integer.parseInt(monkey.get(1));
        System.out.println(monkeyNumber);

        int monkeyTarget = Integer.parseInt(monkey.get(7));
        System.out.println(monkeyTarget);

    }

}
