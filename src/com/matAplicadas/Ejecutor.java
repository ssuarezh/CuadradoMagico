package com.matAplicadas;

public class Ejecutor {

	public static void main(String[] args) {
		CuadradoMagico cuadrado= new CuadradoMagico(5);
		
		int[][] matriz = cuadrado.getMatrizCuadrada();
		int totalColumnas = matriz[0].length;
		System.out.println("totalCO: "+ totalColumnas);
		int totalFilas = matriz.length;
		System.out.println("totalFI: "+ totalFilas);
		
		for (int i = 0; i < totalFilas; i++) {
			for (int j = 0; j < totalColumnas; j++) {
				
				System.out.print("  |"+matriz[i][j]+"|  ");
			}
			System.out.println(" ");
		}

	}

}
