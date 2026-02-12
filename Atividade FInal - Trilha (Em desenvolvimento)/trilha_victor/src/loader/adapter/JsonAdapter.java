package loader.adapter;

import loader.CarregadorDados;
import loader.json.LeitorJSON;
import storage.BaseDados;
import model.Usuario;
import model.Trilha;

public class JsonAdapter implements CarregadorDados {

    private LeitorJSON leitorJSON;

    public JsonAdapter(LeitorJSON leitorJSON) {
        this.leitorJSON = leitorJSON;
    }

    @Override
    public void carregar(BaseDados baseDados) {
        System.out.println("Iniciando carregamento via JSON Adapter...");
        leitorJSON.lerArquivoJson();
        // Simulação de dados
        baseDados.adicionarUsuario(new Usuario("Maria"));
        baseDados.adicionarUsuario(new Usuario("João"));
        baseDados.adicionarTrilha(new Trilha("Trilha do Pico"));
        baseDados.adicionarTrilha(new Trilha("Lago Escondido"));
        System.out.println("Dados JSON carregados e adaptados com sucesso.\n");
    }
}
