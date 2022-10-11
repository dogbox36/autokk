package hu.petrik.autok;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static auto Leggyorsabb(List<auto> lista) {
        return lista.stream().reduce((acc, x) -> acc.getSebesseg() > x.getSebesseg() ? acc : x).get();
    }

    public static void main(String[] args) {
        var autok = new LinkedList<auto>();
        for (var i = 0; i < 5; i++) {
            if (Math.random() > 0.5)
                autok.add(new tesla());
            else
                autok.add(new Porsche(Math.floor(Math.random() * 50)));
        }

        autok.stream().forEach(auto::gyorsul);
        var fastest = Leggyorsabb(autok);

        System.out.println(fastest.getSebesseg());

        var kauto = new KonzolosAuto();
        kauto.gyorsul();
        kauto.gyorsul();

        System.out.println(kauto.getSebesseg());
    }
}