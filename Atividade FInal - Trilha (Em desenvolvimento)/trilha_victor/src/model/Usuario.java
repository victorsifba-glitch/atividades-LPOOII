package model;

import java.util.ArrayList;
import observer.Observer;
import model.Trilha;

public class Usuario implements Observer {

    private String nome;
    private ArrayList<Trilha> trilhasFavoritas = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFavorita(Trilha trilha) {
        trilhasFavoritas.add(trilha);
        trilha.adicionarObserver(this);
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Notificação para " + nome + ": " + mensagem);
    }
}
