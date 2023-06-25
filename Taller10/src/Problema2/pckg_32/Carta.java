package Problema2.pckg_32;

import Problema2.pckg_22.Menu;

public class Carta extends Menu {
    public double valorPorcion;
    public double valorBebida;
    public double porcentajeAdicional;

    public Carta() {}

    public Carta(String nombrePlato, double valorInicialMenu, double valorPorcion, double valorBebida, double porcentajeAdicional) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorcion = valorPorcion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=this.valorPorcion+this.valorBebida+(super.valorInicialMenu*(this.porcentajeAdicional/100));
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Carta{" +
                "valorPorcion=" + valorPorcion +
                ", valorBebida=" + valorBebida +
                ", porcentajeAdicional=" + porcentajeAdicional +
                '}';
    }
}
