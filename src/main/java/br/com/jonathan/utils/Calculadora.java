package br.com.jonathan.utils;

public class Calculadora {
	public double calcularAutonomia(double... kmL) {
		double autonomia = 1;
		for(double d: kmL) {
			autonomia *= d;
		}
		return autonomia;
	}
}
