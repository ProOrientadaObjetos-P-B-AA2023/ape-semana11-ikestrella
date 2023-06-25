package Problema2.pckg_22;

import java.util.ArrayList;

public class Cuenta {
    public String nombreCliente;
    public ArrayList<Menu> menus;
    public double valorCancelar;
    public double valorSubTotal;
    public double iva;

    public Cuenta() {}

    public Cuenta(String nombreCliente, double iva) {
        this.nombreCliente = nombreCliente;
        this.iva=iva;
    }
    public void setMenus(ArrayList<Menu> menus){
        this.menus= menus;
    }
    public void calcularValorSubtotal(double valorSubTotal){
        this.valorSubTotal+=valorSubTotal;
    }
    public void calcularValorCancelar(){
        this.valorCancelar=this.valorSubTotal+(this.valorSubTotal*(this.iva/100));
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", menus=" + menus +
                ", valorCancelar=" + valorCancelar +
                ", valorSubTotal=" + valorSubTotal +
                ", iva=" + iva +
                '}';
    }
}
