package Handlers;

public class HandlerCinco extends HandlerClass {
    public HandlerCinco() {
    }

    public void devolver(Solicitud solicitud) {

        int cantidad = (int) Math.floor(solicitud.getSaldo()/5000);
        solicitud.getCantidades().add(cantidad);

        int residuo = (int) (solicitud.getSaldo()%5000);
        solicitud.setSaldo(residuo);

        System.out.println("La cantidad de billetes 5.000 dispensados es: "+cantidad);
        this.siguiente.devolver(solicitud);
    }
}

