package Handlers;

public interface IHandler {


    //Pasar al siguiente manejador
    void asignarSiguiente(IHandler obj);

    //Metodo de implementación
    void devolver(Solicitud solicitud);

}
