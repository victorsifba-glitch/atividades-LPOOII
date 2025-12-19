        package atividade2;
        public class Main {
        public static void main(String[] args) {
        ListaFesta lf = ListaFesta.getInstance();

        lf.show();

        lf.addPessoa("Ana");
        lf.removerPessoa("Jose");

        lf.show();
        }
        }

