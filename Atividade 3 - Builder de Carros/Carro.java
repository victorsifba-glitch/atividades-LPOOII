package atividade3;

class Carro {
    private int banco;
    private String motor;
    private String gps;
    private String computadorBordo;
    private String tipo;

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setGPS(String gps) {
        this.gps = gps;
    }

    public void setComputadorBordo(String computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String descricao() {
        return "Carro do tipo " + tipo +
               " com " + banco + " bancos, motor " + motor +
               ", GPS: " + gps +
               ", Computador de Bordo: " + computadorBordo;
    }
}
