package atividade3;

class BuilderCarroNormal implements Builder {
    private Carro carro;

    public BuilderCarroNormal() {
        reset();
    }

    public void reset() {
        carro = new Carro();
        carro.setTipo("Normal");
    }

    public void setMotor(String motor) {
        carro.setMotor(motor);
    }

    public void setGPS(String gps) {
        carro.setGPS(gps);
    }

    public void setCompBordo(String cb) {
        carro.setComputadorBordo(cb);
    }

    public void setBanco(int banco) {
        carro.setBanco(banco);
    }
    public Carro getResult() {
        return carro;
    }
}

