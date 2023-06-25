package Problema2.pckg_32;

import Problema2.pckg_22.Menu;

public class Dia extends Menu {
    public double valorPostre;
    public double valorBebida;

    public Dia() {}

    public Dia(String nombrePlato, double valorInicialMenu, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }
    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=this.valorPostre+this.valorBebida;
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Dia{" +
                "valorPostre=" + valorPostre +
                ", valorBebida=" + valorBebida +
                '}';
    }
}

