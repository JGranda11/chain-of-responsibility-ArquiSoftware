package Handlers;

public class HandlerCien extends HandlerClass {
    public HandlerCien(){

    }


    @Override
    public void devolver(Solicitud solicitud) {
           int cantidad = (int) Math.floor(solicitud.getSaldo() / 100000);
           solicitud.getCantidades().add(cantidad);

           int residuo = (int) (solicitud.getSaldo() % 100000);
           solicitud.setSaldo(residuo);

           System.out.println("La cantidad de billetes 100.000 dispensados es: " + cantidad);
           this.siguiente.devolver(solicitud);

    }
}
