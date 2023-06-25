package Problema2.pckg_32;

import Problema2.pckg_22.Menu;

public class Economico extends Menu {
    public double porcentajeDescuento;
    public Economico() {}

    public Economico(String nombrePlato, double valorInicialMenu, double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=super.valorInicialMenu-(super.valorInicialMenu*(this.porcentajeDescuento/100));
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Economico{" +
                "porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
