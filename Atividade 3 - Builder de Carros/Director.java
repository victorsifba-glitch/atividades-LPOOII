package atividade3;

class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void makeCarroNormal(Builder builder) {
        builder.reset();
        builder.setBanco(4);
        builder.setMotor("1.0");
    }

    public void makeCarroEsportivo(Builder builder) {
        builder.reset();
        builder.setBanco(2);
        builder.setMotor("2.0");
    }

    public void makeCarroSUV(Builder builder) {
        builder.reset();
        builder.setBanco(7);
        builder.setMotor("2.5");
    }

    public void makeCarroLongo(Builder builder) {
        builder.reset();
        builder.setBanco(4);
        builder.setMotor("1.8");
        builder.setGPS("GPS x");
        builder.setCompBordo("CB x");
    }
}
