package observer;

public class Cliente {
public static void main(String[] args) {
Publisher publisher = new Publisher();
Subscriber subA = new SubscriberA();
Subscriber subB = new SubscriberB();

publisher.subscribe(subA);
publisher.subscribe(subB);

publisher.mainBusinessLogic(10); 
    }
}
