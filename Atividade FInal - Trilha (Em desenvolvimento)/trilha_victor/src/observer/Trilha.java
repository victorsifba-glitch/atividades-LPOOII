package observer;

import java.time.LocalDate;
import java.util.ArrayList;
import observer.Observer;
import observer.Subject;

public class Trilha implements Subject {

    private String nome;
    private LocalDate ultimaAtualizacao;
    private ArrayList<Observer> observers;

    public Trilha(String nome) {
        this.nome = nome;
        this.ultimaAtualizacao = LocalDate.now();
        observers = new ArrayList<>();
    }

    public void atualizarTrilha() {
        ultimaAtualizacao = LocalDate.now();
        notificarObservers();
    }

    @Override
    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservers() {
        for (Observer o : observers) {
        }
    }
}
