package atividade3;

public interface Builder {
    void reset();
    void setMotor(String motor);
    void setGPS(String gps);
    void setCompBordo(String cb);
    void setBanco(int banco);
    Carro getResult();
}

