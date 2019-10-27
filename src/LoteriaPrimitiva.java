import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class LoteriaPrimitiva implements Subject {
    private List<Observer> observers;
    private List<Integer> numbers;

    public LoteriaPrimitiva() {
        this.observers = new ArrayList<>();
        this.numbers = new ArrayList<>();
    }

    public void nuevoSorteo(){
        for (int i=0; i<6;i++)
            this.numbers.add(i, i);

        notifyObservers();

    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.numbers);
        }
    }
}
