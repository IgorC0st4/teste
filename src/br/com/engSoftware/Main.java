package br.com.engSoftware;

import java.util.Scanner;

public class Main {

	// �rea do terreno
	double aTerreno;
	// Valor do terreno
	double valTerreno;
	// �rea Constru�da
	double aConstruida;
	// Valor da �rea Constru�da
	double valConstruida;
	// Valor do IPTU
	double iptu;

	// Ler entrada do usu�rio
	Scanner read;

	public static void main(String[] args) {

		Main main = new Main();

		main.read = new Scanner(System.in);

		// L� a �rea do terreno
		System.out.println("�rea do terreno (m2): ");
		main.aTerreno = main.read.nextFloat();
		// L� a �rea constru�da
		System.out.println("�rea constru�da (m2): ");
		main.aConstruida = main.read.nextFloat();

		main.definirValorTerreno();

		main.definirValorAreaConstruida();

		main.calcularIptu();
		
		System.out.println("Valor da �rea do Terreno: " + main.valTerreno);
		System.out.println("Valor da �rea Constru�da: " + main.valConstruida);
		System.out.println("Valor do IPTU           : " + main.iptu);

		main.read.close();

	}

	void definirValorTerreno() {
		if (aTerreno <= 200) {
			valTerreno = 0.10;
		} else {
			if (aTerreno > 200 && aTerreno <= 450) {
				valTerreno = 0.43;
			} else {
				valTerreno = 1.20;
			}
		}
	}

	void definirValorAreaConstruida() {
		if (aConstruida <= 60) {
			valConstruida = 0.00;
		} else {
			if (aConstruida > 60 && aConstruida <= 80) {
				valConstruida = 0.15;
			} else {
				if (aConstruida > 80 && aConstruida <= 100) {
					valConstruida = 0.35;
				} else {
					valConstruida = 0.45;
				}
			}
		}
	}

	void calcularIptu() {
		iptu = (aTerreno * valTerreno) + (aConstruida * valConstruida);
	}
}
