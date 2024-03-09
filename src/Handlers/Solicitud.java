package Handlers;

import java.util.ArrayList;

public class Solicitud {
    public Solicitud(){

    }
    double saldo=0;

    ArrayList<Integer> cantidades = new ArrayList<>();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }
}
