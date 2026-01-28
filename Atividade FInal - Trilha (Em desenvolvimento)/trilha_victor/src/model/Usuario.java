package model;

import java.util.ArrayList;
import observer.Observer;

public class Usuario implements Observer {

    private String nome;
    private ArrayList<Trilha> trilhasFavoritas;

    public Usuario(String nome) {
        this.nome = nome;
        trilhasFavoritas = new ArrayList<>();
    }

    public void adicionarFavorita(Trilha trilha) {
        trilhasFavoritas.add(trilha);
        trilha.adicionarObserver(this);
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Usuário " + nome + " recebeu notificação: " + mensagem);
    }
}
