package DH;

import java.util.ArrayList;
import java.util.Iterator;

public class ejercicioArray {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("ford");
        cars.add("toyota");
        cars.add("ferrari");
        cars.add("mazda");

        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<String> listaFrutas = new ArrayList<String>();
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Pera");

        System.out.println(listaFrutas);
    }


}
