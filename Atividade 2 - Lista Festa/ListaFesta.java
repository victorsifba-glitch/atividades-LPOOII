    package atividade2;
    import java.util.ArrayList;
    import java.util.List;

    public class ListaFesta {
    private static ListaFesta instance;
    private List<Pessoa> lista;

    private ListaFesta() {
    lista = new ArrayList<>();
    lista.add(new Pessoa("Luis"));
    lista.add(new Pessoa("Jose"));
    lista.add(new Pessoa("Maria"));
    lista.add(new Pessoa("Joao"));
    }

    public static ListaFesta getInstance() {
    if (instance == null) {
    instance = new ListaFesta();
    }
    return instance;
    }
    public void show() {
    System.out.println("LISTA DE FESTA:");
    for (int i = 0; i < lista.size(); i++) {
    System.out.println(lista.get(i).getNome());
    }
    }

    public void addPessoa(String nome) {
    lista.add(new Pessoa(nome));
    System.out.println(nome + " foi adicionado à lista.");
    }

    public void removerPessoa(String nome) {
    boolean removido = false;
    for (int i = 0; i < lista.size(); i++) {
    if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
    lista.remove(i);
    removido = true;
    System.out.println(nome + " foi removido da lista.");
    break; 
    }
    }
    if (!removido) {
    System.out.println(nome + " não está na lista.");
    }
    }
    }
