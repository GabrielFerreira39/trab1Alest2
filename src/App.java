import java.io.File;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Macaquinho> macaquinhos = new ArrayList<>();
        Scanner sc = new Scanner(new File("src/teste.txt"));
        ArrayList<String> texto = new ArrayList<>();
        while (sc.hasNextLine()) {
            texto.add(sc.nextLine());
        }

        String linhaUm = texto.get(0);

        List<String> arrayLinhaUm = Arrays.asList(linhaUm.split(" "));
        int turnos = Integer.parseInt(arrayLinhaUm.get(1));

        for (int i = 1; i < texto.size(); i++) {
            String linhaString = texto.get(i);
            List<String> macacoDados = Arrays.asList(linhaString.split(" "));
            int macacoId = Integer.parseInt(macacoDados.get(1));
            int macacoPar = Integer.parseInt(macacoDados.get(4));
            int macacoImpar = Integer.parseInt(macacoDados.get(7));
            int qtdCocos = Integer.parseInt(macacoDados.get(9));

            Macaquinho macaquinho = new Macaquinho(macacoId, macacoPar, macacoImpar, qtdCocos);
            macaquinhos.add(macaquinho);

        }

        // System.out.println(Macaquinho.toString());

    }

}
