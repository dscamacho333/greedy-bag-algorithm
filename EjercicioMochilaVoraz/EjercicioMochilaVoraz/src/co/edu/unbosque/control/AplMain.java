package co.edu.unbosque.control;

public class AplMain {
	public static void main(String[] args) {
        // Crear una mochila que soporta hasta 20 Kg. de peso
        Mochila mochila = new Mochila(20);
        mochila.resolverProblema();
        mochila.mostrarMochila();
    }
}
