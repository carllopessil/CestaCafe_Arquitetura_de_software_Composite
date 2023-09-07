package cliente;

import composite.*;

public class CestaCafe {
    public static void main(String[] args) throws Exception {
        Composite cesta = new Composite();
        Component p1 = new Leaf("joão", 12.34);
        Component p2 = new Leaf("Leite", 7.89);
        Component p3 = new Leaf("Torrada", 11.6);
        Component p4 = new Leaf("Caneca", 21.5);

        cesta.adicionar(p1);
        cesta.adicionar(p2);
        cesta.adicionar(p3);
        cesta.adicionar(p4);

        Component p5= new Leaf("Bombom Cereja", 4.50);
        Component p6= new Leaf("Bombom Licor", 8.50);


        Composite caixa = new Composite();
        caixa.adicionar(p5);
        caixa.adicionar(p6);

        cesta.adicionar(caixa);

    };
}
