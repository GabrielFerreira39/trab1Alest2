import java.io.File;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Macaquinho> macaquinhos = new ArrayList<>();
        Scanner sc = new Scanner(new File("src/1000macacos.txt"));

        String linhaUm = sc.nextLine();

        String[] arrayLinhaUm = (linhaUm.split(" "));
        int turnos = Integer.parseInt(arrayLinhaUm[1]);

        while (sc.hasNextLine()) {
            String linhaString = (sc.nextLine());
            String[] macacoDados = (linhaString.split(" "));
            int macacoId = Integer.parseInt(macacoDados[1]);
            int amigoPar = Integer.parseInt(macacoDados[4]);
            int amigoImpar = Integer.parseInt(macacoDados[7]);
            int qtdCocos = Integer.parseInt(macacoDados[9]);

            int cocosPares = 0;
            int cocosImpares = 0;
            for (int j = 0; j < qtdCocos; j++) {
                int pedras = Integer.parseInt(macacoDados[j + 11]);
                if (pedras % 2 == 0) {
                    cocosPares++;
                } else {
                    cocosImpares++;
                }
            }

            Macaquinho macaquinho = new Macaquinho(macacoId, amigoPar, amigoImpar, cocosPares, cocosImpares);
            macaquinhos.add(macaquinho);

        }

        for (int i = 0; i < turnos; i++) {
            for (Macaquinho macaquinho : macaquinhos) {
                int amigoPar = macaquinho.getAmigoPar();
                int amigoImpar = macaquinho.getAmigoImpar();
                macaquinho.trocaDeCocos(macaquinhos.get(amigoPar), macaquinhos.get(amigoImpar));
            }
        }
        Macaquinho ganhador = macaquinhos.get(0);

        for (Macaquinho macaquinho : macaquinhos) {
            if (macaquinho.getQtdCocos() > ganhador.getQtdCocos()) {
                ganhador = macaquinho;
            }

        }

        System.out.println(ganhador);
    }

}
