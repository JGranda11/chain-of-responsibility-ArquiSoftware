package Handlers;

public class HandlerCincuenta extends HandlerClass {

    public HandlerCincuenta() {

    }

    @Override
    public void devolver(Solicitud solicitud) {

        int cantidad = (int) Math.floor(solicitud.getSaldo()/50000);
        solicitud.getCantidades().add(cantidad);

        int residuo = (int) (solicitud.getSaldo()%50000);
        solicitud.setSaldo(residuo);

        System.out.println("La cantidad de billetes 50.000 dispensados es: "+cantidad);
        this.siguiente.devolver(solicitud);
    }
}
