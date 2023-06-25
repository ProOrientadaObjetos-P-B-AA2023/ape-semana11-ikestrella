package Problema2.pckg_32;

import Problema2.pckg_22.Menu;

public class Ninios extends Menu {
    public double porcionHelado;
    public double porcionPastel;

    public Ninios() {}
    public Ninios(String nombrePlato, double valorInicialMenu, double porcionHelado, double porcionPastel) {
        super(nombrePlato, valorInicialMenu);
        this.porcionHelado = porcionHelado;
        this.porcionPastel = porcionPastel;
    }
    public void calcularValorInicialMenu(){
        super.valorInicialMenu+=this.porcionHelado+this.porcionPastel;
    }
    public void calcularValorMenu(){
        super.valorMenu=super.valorInicialMenu;
    }
    public double getValorMenu(){
        return super.valorMenu;
    }

    @Override
    public String toString() {
        return super.toString() +"Ninios{" +
                "porcionHelado=" + porcionHelado +
                ", porcionPastel=" + porcionPastel +
                '}';
    }
}
