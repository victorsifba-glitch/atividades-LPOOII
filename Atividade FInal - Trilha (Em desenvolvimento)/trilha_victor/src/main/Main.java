package main;

import java.time.LocalDate;
import java.util.Scanner;

import model.Trilha;
import model.Usuario;
import storage.BaseDados;
import loader.CarregadorDados;
import loader.adapter.JsonAdapter;
import loader.json.LeitorJSON;

public class Main {

    private static BaseDados baseDados = BaseDados.getInstance();
    private static Usuario usuarioLogado;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 1️⃣ Carregar dados (Adapter + Singleton)
        CarregadorDados carregador = new JsonAdapter(new LeitorJSON());
        carregador.carregar(baseDados);

        // 2️⃣ Criar dados de exemplo (caso não tenha arquivo ainda)
        dadosExemplo();

        // 3️⃣ Login simples
        login();

        // 4️⃣ Menu principal
        menu();
    }

    // =============================
    // LOGIN
    // =============================
    private static void login() {
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        for (Usuario u : baseDados.getUsuarios()) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                usuarioLogado = u;
                System.out.println("Login realizado com sucesso!\n");
                return;
            }
        }

        System.out.println("Usuário não encontrado.\n");
        login();
    }

    // =============================
    // MENU
    // =============================
    private static void menu() {
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Listar trilhas");
            System.out.println("2 - Favoritar trilha");
            System.out.println("3 - Atualizar trilha");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> listarTrilhas();
                case 2 -> favoritarTrilha();
                case 3 -> atualizarTrilha();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    // =============================
    // LISTAR TRILHAS
    // =============================
    private static void listarTrilhas() {
        int i = 1;
        for (Trilha t : baseDados.getTrilhas()) {
            System.out.println(i + " - " + t.getNome());
            i++;
        }
        System.out.println();
    }

    // =============================
    // FAVORITAR TRILHA (Observer)
    // =============================
    private static void favoritarTrilha() {
        listarTrilhas();
        System.out.print("Escolha a trilha: ");
        int escolha = Integer.parseInt(scanner.nextLine()) - 1;

        Trilha trilha = baseDados.getTrilhas().get(escolha);
        usuarioLogado.adicionarFavorita(trilha);

        System.out.println("Trilha favoritada!\n");
    }

    // =============================
    // ATUALIZAR TRILHA
    // =============================
    private static void atualizarTrilha() {
        listarTrilhas();
        System.out.print("Escolha a trilha para atualizar: ");
        int escolha = Integer.parseInt(scanner.nextLine()) - 1;

        Trilha trilha = baseDados.getTrilhas().get(escolha);
        trilha.atualizarTrilha(); // DISPARA OBSERVER
        System.out.println();
    }

    // =============================
    // DADOS MOCK (TESTE)
    // =============================
    private static void dadosExemplo() {
        if (baseDados.getUsuarios().isEmpty()) {
            baseDados.adicionarUsuario(new Usuario("Ana"));
            baseDados.adicionarUsuario(new Usuario("Carlos"));
        }

        if (baseDados.getTrilhas().isEmpty()) {
            baseDados.adicionarTrilha(new Trilha("Trilha da Serra"));
            baseDados.adicionarTrilha(new Trilha("Cachoeira Azul"));
        }
    }
}
