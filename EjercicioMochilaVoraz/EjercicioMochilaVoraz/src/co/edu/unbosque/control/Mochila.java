package co.edu.unbosque.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import co.edu.unbosque.modelo.Elemento;
import co.edu.unbosque.vista.Vista;

public class Mochila {

	ArrayList<Elemento> almacen = new ArrayList();
	ArrayList<Elemento> mochila = new ArrayList();
	ArrayList<Elemento> tmpMochila = new ArrayList();
	double pesoMaximo;
	Vista vista;

	public Mochila(int pm) {
		vista = new Vista();
		pesoMaximo = pm;
		cargarDatos();
	}

	public void cargarDatos() {
		almacen.add(new Elemento("TV", 300, 15, 5, 1));
		almacen.add(new Elemento("PS3", 100, 3, 4, 3));
		almacen.add(new Elemento("Libro Java", 10, 1, 1, 1));
		almacen.add(new Elemento("DVD Player", 5, 0.5, 2, 1));
		almacen.add(new Elemento("Blu-Ray", 50, 0.5, 6, 1));
		almacen.add(new Elemento("Balon", 30, 0.5, 1, 1));
		almacen.add(new Elemento("iPod", 150, 1, 2, 1));
		almacen.add(new Elemento("Printer", 20, 4, 2, 1));
		almacen.add(new Elemento("VideoBeam", 200, 4, 1, 1));
		almacen.add(new Elemento("LapTop", 20, 3, 1, 1));
		almacen.add(new Elemento("iPad", 150, 2, 2, 1));
		almacen.add(new Elemento("PC", 100, 5, 3, 1));
		almacen.add(new Elemento("BlackBerry", 150, 0.5, 4, 1));
		almacen.add(new Elemento("Pollo Asado", 100, 0.5, 2, 8));
		almacen.add(new Elemento("Torta de chocolate", 200, 1, 1, 8));

	}
	public void mostrarMochila() {
		double pesoMochila = 0;
		double valorMochila = 0;
		System.out.println(" ");
		System.out.println("--------------------------------------------MOCHILA----------------------------------------");
		System.out.println(" ");
		for (Elemento e : mochila) {
			vista.imprimirMensaje("" + e);
			pesoMochila += e.getPeso();
			valorMochila += e.getValor();
		}
		vista.imprimirMensaje("------");
		vista.imprimirMensaje("Peso  = %,12.2f %n", pesoMochila);
		vista.imprimirMensaje("Valor = %,12.2f %n", valorMochila);
	}

	// Soluci�n
	public void resolverProblema() {
		Collections.sort(almacen, new Comparator<Elemento>() {
			@Override
			public int compare(Elemento e1, Elemento e2) {
				return Double.valueOf(e2.getValorpeso()).compareTo(Double.valueOf(e1.getValorpeso()));
			}
		});

		for (Elemento elemento : almacen) {
			System.out.println(elemento);
		}

		for (Elemento elemento : almacen) {
			
			if ( ((elemento.getPeso() / elemento.getFactorDivision())) + getPeso(mochila) <= pesoMaximo) {
				mochila.add(elemento);
			}
		}
	}
	

	double getPeso(List<Elemento> tmp) {
		double respuesta = 0;
		for (Elemento e : tmp) {
			respuesta = respuesta + e.getPeso();
		}
		return respuesta;
	}

	double getValor(List<Elemento> tmp) {
		double respuesta = 0;
		for (Elemento e : tmp)
			respuesta += e.getValor();
		return respuesta;
	}

}