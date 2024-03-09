import Handlers.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solicitud solicitud = new Solicitud();

        HandlerCien h100 = new HandlerCien();
        HandlerCincuenta h50 = new HandlerCincuenta();
        HandlerVeinte h20 = new HandlerVeinte();
        HandlerDiez h10 = new HandlerDiez();
        HandlerCinco h5 = new HandlerCinco();


        System.out.println("Ingrese el saldo a retirar: ");
        solicitud.setSaldo(sc.nextDouble());

        while(solicitud.getSaldo() % 5000 != 0){
            System.out.println("Ingrese por favor un saldo multiplo de 5000:");
            solicitud.setSaldo(sc.nextDouble());
        }

        System.out.println("La devolucion de su retiro se dio de la siguiente manera");

        h100.asignarSiguiente(h50);
        h50.asignarSiguiente(h20);
        h20.asignarSiguiente(h10);
        h10.asignarSiguiente(h5);

        try{
        h100.devolver(solicitud);
        }
        catch(NullPointerException e)
        {
            //En caso de que el apuntador al siguiente elemento de la cadena de responsabilidad
            //apunte a null
            e.getMessage();
        }
    }
}
/*
Uno de los grandes ejemplos del patrón de Cadena de Responsabilidad es la máquina
dispensadora de un cajero automático. El usuario ingresa la cantidad a dispensar y la
máquina dispensa la cantidad en términos de billetes de moneda definidos, como $100.000,
$50.000, $20.000, $10.000. etc. Si el usuario ingresa una cantidad que no es un múltiplo de
5.000, arroja un error. Debe usarse el patrón Cadena de responsabilidad para implementar
esta solución. La cadena procesará la solicitud en el mismo orden que la siguiente tabla.

Denominación
100.000
50.000
20.000
10.000
5.000*/