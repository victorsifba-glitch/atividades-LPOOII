package proxy;

public class Proxy implements ServiceInterface {
private Service realService;

public Proxy(Service s) {
this.realService = s;
}

private boolean checkAccess() {

System.out.println("Verificando acesso no Proxy...");
return true;
}

@Override
public void operation() {
if (checkAccess()) {
realService.operation();
 } else {
System.out.println("Acesso negado.");
}
}
}
