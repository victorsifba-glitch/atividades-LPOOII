package proxy;

public class Cliente {
private ServiceInterface service;

public Cliente(ServiceInterface service) {
this.service = service;
}

public void execute() {
service.operation();
    }

 public static void main(String[] args) {
Service realService = new Service();
Proxy proxy = new Proxy(realService);
Cliente cliente = new Cliente(proxy);

cliente.execute();
    }
}

