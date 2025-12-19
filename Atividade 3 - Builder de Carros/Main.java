package atividade3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        System.out.println("=== CARRO NORMAL ===");
        BuilderCarroNormal normal = new BuilderCarroNormal();
        director.makeCarroNormal(normal);
        System.out.println(normal.getResult().descricao());

        System.out.println("\n=== CARRO ESPORTIVO ===");
        BuilderCarroEsportivo esportivo = new BuilderCarroEsportivo();
        director.makeCarroEsportivo(esportivo);
        System.out.println(esportivo.getResult().descricao());

        System.out.println("\n=== CARRO SUV ===");
        BuilderCarroSUV suv = new BuilderCarroSUV();
        director.makeCarroSUV(suv);
        System.out.println(suv.getResult().descricao());

        System.out.println("\n=== CARRO LONGO ===");
        BuilderCarroLongo longo = new BuilderCarroLongo();
        director.makeCarroLongo(longo);
        System.out.println(longo.getResult().descricao());

    }
}

