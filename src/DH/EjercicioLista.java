package DH;

import java.util.LinkedList;

public class EjercicioLista {
    public static void main(String[] args) {
        LinkedList<String> colores = new LinkedList<String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Rosa");
        System.out.println("Lista de colores"+colores);
        Object primerElemento = colores.removeFirst();
        System.out.println("Lista sin 1er elemento de colores "+primerElemento);
        Object ultimoElemento = colores.removeLast();
        System.out.println("Lista sin el ultimo elemento de colores "+ultimoElemento);

    }
}
