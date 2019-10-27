import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Random r = new Random(32);
        LoteriaPrimitiva loteria = new LoteriaPrimitiva();
        List<Jugador> jugadores = new ArrayList<Jugador>();

        Jugador jugador1 = new Jugador("Player1", Arrays.asList(0, 1, 2, 3, 4, 5));
        jugadores.add(jugador1);
        Jugador jugador2 = new Jugador("Player1", Arrays.asList(1, 2, 3, 38, 26, 5));
        jugadores.add(jugador2);


        for (Jugador j: jugadores) {
            loteria.registerObserver(j);
        }

        loteria.nuevoSorteo();

    }
}
