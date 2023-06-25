package Problema2.pckg_22;

public abstract class Menu {
    public String nombrePlato;
    public double valorMenu;
    public double valorInicialMenu;

    public Menu() {}

    public Menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu=valorInicialMenu;
    }
    public abstract void calcularValorInicialMenu();
    public abstract void calcularValorMenu();

    public abstract double getValorMenu();

    @Override
    public String toString() {
        return "Menu{" +
                "nombrePlato='" + nombrePlato + '\'' +
                ", valorMenu=" + valorMenu +
                ", valorInicialMenu=" + valorInicialMenu +
                '}';
    }
}
