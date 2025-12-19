package observer;

public class AssinanteA implements Subscriber {
    @Override
    public void update(Publisher p) {
        System.out.println("AssinanteA recebeu o estado: " + p.getState());
    }
}
