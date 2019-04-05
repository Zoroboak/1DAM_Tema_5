package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


/*
 * 	Pedro Daniel Pérez Sánchez 
 * 
 * 	Ejercicio de programación donde aprendemos a utilizar flujos
 * 
 * 	28/02/2019 
 * 
 * 
 * */



public class flujo {
	
	public static String miEscrituraPantalla() {
		
		String cad = " ";
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			cad = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		if (cad.indexOf(" ") != -1) {
			cad = cad.substring(0,cad.indexOf(" "));
		}
		
		
		
		return cad;
	}
	
	
	public static void miLeerCadena(String text) {
		
		PrintWriter pantalla = new PrintWriter(System.out);
		//char[] array = { 'M', 'o', 'r', 'e', 'n', 'o' };
		String str = new String(text);
		pantalla.write(str);
		pantalla.print(" ");
		//pantalla.write(array, 0, 6);
		//pantalla.println("");
		pantalla.flush();
		
	}
	
	

	public static void main(String[] args) {

		System.out.println("#Escribe algo Nº1: ");
		Scanner s = new Scanner(System.in);
		System.out.println("Con Scanner: "+s.next());
		
		
		miLeerCadena("#Escribe algo Nº2: ");
		String mi = miEscrituraPantalla();
		miLeerCadena("Con mi leer cadena: "+mi);
		
		

	}

}
