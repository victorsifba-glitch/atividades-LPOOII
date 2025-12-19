package observer;

import java.util.*;

public class Publisher {
    private final List<Subscriber> subs = new ArrayList<>();
    private int state;

    public void subscribe(Subscriber s) { subs.add(s); }
    public void unsubscribe(Subscriber s) { subs.remove(s); }

    private void notifySubs() { subs.forEach(s -> s.update(this)); }

    public void mainBusinessLogic(int newState) {
        System.out.println("Novo estado: " + newState);
        state = newState;
        notifySubs();
    }

    public int getState() { return state; }
}
