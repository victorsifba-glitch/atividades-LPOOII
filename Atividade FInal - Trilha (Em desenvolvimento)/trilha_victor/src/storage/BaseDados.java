package storage;

import java.util.ArrayList;
import model.Usuario;
import model.Trilha;

public class BaseDados {

    private static BaseDados instancia;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Trilha> trilhas = new ArrayList<>();
    private BaseDados() {
    }

    public static BaseDados getInstance() {
        if (instancia == null) {
            instancia = new BaseDados();
        }
        return instancia;
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Trilha> getTrilhas() {
        return trilhas;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarTrilha(Trilha trilha) {
        trilhas.add(trilha);
    }
}
