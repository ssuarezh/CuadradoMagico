package com.matAplicadas;

public class CuadradoMagico {
	int numero;
	int [][] matrizCuadrada;
	int numeroDatos;
	int constanteMagica;
	
	//CONSTRUCTOR
	public CuadradoMagico(int numero) {
		this.numero = numero;
		this.matrizCuadrada= new int[numero][numero];
		this.numeroDatos = (int) Math.pow(numero, 2);
		this.constanteMagica = hallarConstanteMagica();
		llenarCuadrado();
	}
	
	//HALLA EL RESULTADO FINAL 
	public int hallarConstanteMagica() {
		constanteMagica = (numero * ( ((int)Math.pow(numero, 2)) +1))/2;
		return constanteMagica;
	}
	
	//LLENA LA MATRIZ 
	public void llenarCuadrado(){
		int totalColumnas = matrizCuadrada[0].length;
		int totalFilas = matrizCuadrada.length;
		int casillaMitad = (totalColumnas/2);
		System.out.println("Casilla mitad: "+ casillaMitad);
		int fila = 0;
		int columna = casillaMitad;
		matrizCuadrada[fila][columna] = 1;
		for (int i = 2; i <= numeroDatos; i++) {
			int filaTemporal = fila;
			int columnaTemporal = columna;
			fila --;
			columna ++;
			if(fila < 0){
				fila = totalFilas-1;
			}
			if(columna > totalColumnas-1){
				columna = 0;
			}
			if(matrizCuadrada[fila][columna] == 0){
				matrizCuadrada[fila][columna] = i;
			}else{
				fila = filaTemporal +1;
				columna = columnaTemporal;
				matrizCuadrada[fila][columna] = i;
			}
		}
	}
	
	//GETTERS AND SETTERS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int[][] getMatrizCuadrada() {
		return matrizCuadrada;
	}

	public void setMatrizCuadrada(int[][] matrizCuadrada) {
		this.matrizCuadrada = matrizCuadrada;
	}

	public int getNumeroDatos() {
		return numeroDatos;
	}

	public void setNumeroDatos(int numeroDatos) {
		this.numeroDatos = numeroDatos;
	}

	public int getConstanteMagica() {
		return constanteMagica;
	}

	public void setConstanteMagica(int constanteMagica) {
		this.constanteMagica = constanteMagica;
	}
	
}
