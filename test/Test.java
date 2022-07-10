package test;

import modelo.Equipo;
import modelo.Jugador;

public class Test {
    public static void main(String[] args) {
        //Jugador miJugador = new Jugador("", 0, 0, 0);
        //miJugador.setGoles(10);
        //miJugador.setNombre("Jean");
        //System.out.println("El nombre del jugador es : " + miJugador.getNombre());
        //System.out.println("y la cantidad de goles : " + miJugador.getGoles());

        Equipo miEquipo = new Equipo("PSG", 3);
        Jugador miJugador2 = new Jugador("Jean Rodri", 17,21, "Delantero");
        System.out.println("Se creo un nuevo jugador: " + miJugador2.getNombre());
        System.out.println("Cantidad de goles: " + miJugador2.getGoles());
        System.out.println("Edad: " + miJugador2.getEdad());
        System.out.println("Codigo: " + miJugador2.getCodigo());
        System.out.println("Se creo un nuevo Equipo: " + miEquipo.toString());
    }
}