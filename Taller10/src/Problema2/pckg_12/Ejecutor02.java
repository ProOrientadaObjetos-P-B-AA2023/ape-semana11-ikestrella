package Problema2.pckg_12;

import Problema2.pckg_22.Cuenta;
import Problema2.pckg_22.Menu;
import Problema2.pckg_32.Carta;
import Problema2.pckg_32.Dia;
import Problema2.pckg_32.Economico;
import Problema2.pckg_32.Ninios;

import java.util.ArrayList;

public class Ejecutor02 {
    public static void main(String[] args) {
        ArrayList<Menu> menus= new ArrayList<>();
        menus.add(new Ninios("Plato 1N", 5,7,6));
        menus.add(new Ninios("Plato 2N",10,12,4));
        menus.add(new Economico("Plato 3E",4,10));
        menus.add(new Dia("Plato 4D",5,6,1.50));
        menus.add(new Carta("Plato 5C",8.50,3,1.25,0.5));
        for (Menu m:menus) {
            m.calcularValorInicialMenu();
            m.calcularValorMenu();
        }
        Cuenta cuenta= new Cuenta("Iam",12);
        for(Menu m: menus){
            cuenta.calcularValorSubtotal(m.getValorMenu());
        }
        cuenta.calcularValorCancelar();
        cuenta.setMenus(menus);
        System.out.println(cuenta);
    }
}
