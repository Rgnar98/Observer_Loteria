import java.util.ArrayList;
import java.util.List;

public class Jugador implements Observer {
    private String name;
    private List<Integer> numbers;

    public Jugador(String name, List<Integer> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public int numeroAciertos(List<Integer> winners){
        int equals = 0;
        for(int i=0; i<winners.size(); i++){
            if(this.numbers.get(i).equals(winners.get(i))){
                equals++;
            }
        }
       return equals;
    }

    @Override
    public void update(List<Integer> winners) {
        int equals = numeroAciertos(winners);
        if(equals==4)
            System.out.println("You win 500€");
        else if(equals==5)
            System.out.println("You win 750€");
        else if (equals==6)
            System.out.println("You win 1000€");
        else
            System.out.println("You win 0€, sorry");
    }
}
