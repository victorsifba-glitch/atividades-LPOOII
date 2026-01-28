package loader.adapter;

import loader.CarregadorDados;
import loader.json.LeitorJSON;
import storage.BaseDados;

public class JsonAdapter implements CarregadorDados {

    private LeitorJSON leitorJSON;

    public JsonAdapter(LeitorJSON leitorJSON) {
        this.leitorJSON = leitorJSON;
    }

    @Override
    public void carregar(BaseDados baseDados) {
        leitorJSON.lerArquivoJson();
    }
}
