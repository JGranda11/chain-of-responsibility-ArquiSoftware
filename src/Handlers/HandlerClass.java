package Handlers;

public class HandlerClass implements IHandler {
    public IHandler siguiente;

    @Override
    public void asignarSiguiente(IHandler obj) {
        this.siguiente = obj;
    }

    @Override
    public void devolver(Solicitud solicitud) {

    }
}
