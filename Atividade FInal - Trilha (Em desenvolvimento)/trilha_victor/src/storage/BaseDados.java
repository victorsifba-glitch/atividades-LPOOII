package storage;

import java.util.ArrayList;
import model.Usuario;
import model.Trilha;

public class BaseDados {

    private static BaseDados instancia;

    private ArrayList<Usuario> Usuarios;
    private ArrayList<Trilha> Trilhas;

    private BaseDados() {
        Usuarios = new ArrayList<>();
        Trilhas = new ArrayList<>();
    }

    public static BaseDados getInstance() {
        if (instancia == null) {
            instancia = new BaseDados();
        }
        return instancia;
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public ArrayList<Trilha> getTrilhas() {
        return Trilhas;
    }

    public void adicionarUsuario(Usuario usuario) {
        Usuarios.add(usuario);
    }

    public void adicionarTrilha(Trilha trilha) {
        Trilhas.add(trilha);
    }
}
