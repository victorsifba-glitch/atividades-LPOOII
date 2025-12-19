public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Kaick", "123.456.789-10");
        PessoaJuridica pj = new PessoaJuridica("Loja Teste", "12.345.678/0001-99");

        System.out.println("Pessoa Física criada!");
        System.out.println("Nome: " + pf.nome);
    

        System.out.println("\nPessoa Jurídica criada!");
        System.out.println("Nome: " + pj.nome);
       
    }
}
