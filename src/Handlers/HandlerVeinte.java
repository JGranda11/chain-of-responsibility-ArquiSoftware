package Handlers;

public class HandlerVeinte extends HandlerClass {
    public HandlerVeinte() {

    }

    @Override
    public void devolver(Solicitud solicitud) {

        int cantidad = (int) Math.floor(solicitud.getSaldo()/20000);
        solicitud.getCantidades().add(cantidad);

        int residuo = (int) (solicitud.getSaldo()%20000);
        solicitud.setSaldo(residuo);

        System.out.println("La cantidad de billetes 20.000 dispensados es: "+cantidad);
        this.siguiente.devolver(solicitud);
    }
}

