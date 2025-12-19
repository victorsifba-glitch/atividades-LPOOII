package observer;

public class AssinanteB implements Subscriber {
    @Override
    public void update(Publisher p) {
        System.out.println("AssinanteB recebeu o estado: " + p.getState());
    }
}
