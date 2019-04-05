package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class leerFichero {
	
	/*
	 * Programa que pide datos por pantalla y guarda la información en un archivo
	 * 
	 * Luego debe ser capaz de leer un archivo y mostrar por pantalla su información
	 * 
	 * 
	 * @autor Pedro Daniel Pérez Sánchez
	 * 
	 * @fecha 06/03/2019
	 * 
	 * */
	

	//###### Metodos de Utilidad #####
	
	
	//Metodo: pedirle datos al usuario
	public static String getDato(String text,int parametro) {
		/*
		 * Parametro 1: Metodo devuelve un numero dado por el usuario
		 * en el rango [0-4], lo uso para la opción del menu
		 * 
		 * Parametro 2: Devuelve la siguiente palabra introducida por el usuario
		 * 
		 * Parametro 3: Devuelve un DNI valido
		 * 
		 * Parametro 4: Devuelve varias palabras en un String
		 * 
		 * Parametro 5: Devuelve un valor numerico dado por el usuario en un string
		 * 
		 * El metodo muestra por pantalla el texto que le pasemos 
		 * devuelve un string con la salida validada según el parametro pasado
		 * 
		 * */
		
		
		//Variables locales del metodo
		String auxs = "-"; //Variable auxiliar que almacena un strings
		int aux = 0; //Variable auxiliar que almacena un valor entero
		double auxd = 0; //Variable auxiliar que almacena un valor de tipo long
		boolean v = false; //Flag que marca si el valor es valido o no
		
		//Declaro el objeto Scanner
		Scanner t = new Scanner(System.in);
		
		switch(parametro) {
		case 1: //Valor a solicitar: Entero positivo del 1 al 5
			do {
				
				try {
					//Doy por supuesto que el valor introducido es correcto
					v = true; 
					
					//Mostrar texto pasado por pantalla
					System.out.print(text);
					//Pido un numero entero
					aux = t.nextInt();
					
					//Si el rango no es correcto, repetimos el while
					if(aux<0||aux>5) {
						System.out.println("Debes introducir un numero en el rango [0-4]");
						v=false;
					}
				}
				catch(Exception e){
					System.out.println("¡El caracter introducido no es valido!");
					t.next();
					v=false;
				}
			}while(!v);
			
			auxs = Integer.toString(aux);
			break;
		case 2: //Valor a solicitar: Palabra introducida por el usuario
			do {
				
				try {
					//Doy por supuesto que el valor introducido es correcto
					v = true; 
					
					//Mostrar texto pasado por pantalla
					System.out.println(text);
					//Pido una Palabra entre 3 y 15 caracteres
					auxs = t.next();
					
					//Si el rango no es correcto, repetimos el while
					if(auxs.length()<3||auxs.length()>15) {
						System.out.println("Debes introducir una palabra entre 3 y 15 caracteres");
						v=false;
					}
					//Si hay un numero, lo volvemos a pedir
					for (int i = 0; i < auxs.length(); i++) {
						if((auxs.charAt(i)>=48)&&(auxs.charAt(i)<=57)) {
							i=auxs.length();
							System.out.println("Debes introducir una palabra entre 3 y 15 caracteres, no numeros");
							v=false;
							
						}
					}
					
					
				}
				catch(Exception e){
					System.out.println("¡La palabra introducida no es valida!");
					t.next();
					v=false;
				}
			}while(!v);
			
			break;
		case 3: //Devuelve un DNI en String 
			do {
				
				try {
					//Doy por supuesto que el valor introducido es correcto
					v = true; 
					
					//Mostrar texto pasado por pantalla
					System.out.println(text);
					//Pido una Palabra entre 3 y 15 caracteres
					auxs = t.next();
					
					//Si el rango no es correcto, repetimos el while
					if(auxs.length()<8||auxs.length()>9) {
						System.out.println("Debes introducir un DNI(Sin letra) de 8 Numeros enteros");
						v=false;
					}
					//Si hay un caracter, lo volvemos a pedir
					for (int i = 0; i < auxs.length(); i++) {
						if((auxs.charAt(i)>=48)&&(auxs.charAt(i)<=57)) {
							v=true;
							//Numero correcto
							
						}else { //Hay un caracter
							System.out.println("Debes introducir un DNI(Sin letra) de 8 Numeros enteros");
							i=auxs.length();
							v=false;							
							
						}
					}
					
				}
				catch(Exception e){
					System.out.println("¡El numero introducido no es valido!!");
					t.next();
					v=false;
				}
			}while(!v);
			break;
		case 4: //Parametro 4: Devuelve varias palabras en un String 
			do {
				
				try {
					//Doy por supuesto que el valor introducido es correcto
					v = true; 
					
					//Mostrar texto pasado por pantalla
					System.out.println(text);
					//Guardo la siguiente linea completa
					auxs = t.nextLine();
					
					//Si el rango no es correcto, repetimos el while
					if(auxs.length()<4) {
						System.out.println("Debes introducir un minimo de 4 caracteres para este elemento");
						v=false;
					}
					
				}
				catch(Exception e){
					System.out.println("¡El texto introducida no es valido!");
					t.next();
					v=false;
				}
			}while(!v);
			
			break;
			
		case 5: //Parametro 5: Devuelve un valor numerico dado por el usuario en un string
			do {
				
				try {
					//Doy por supuesto que el valor introducido es correcto
					v = true; 
					
					//Mostrar texto pasado por pantalla
					System.out.println(text);
					//Guardo la siguiente linea completa
					aux = t.nextInt();
					
					//Si el rango no es correcto, repetimos el while
					if(aux<=-1) {
						System.out.println("Debes introducir un valor positivo");
						v=false;
					}
					
				}
				catch(Exception e){
					System.out.println("¡El valor introducido no euks valido!");
					t.next();
					v=false;
				}
			}while(!v);
			
			auxs = Integer.toString(aux);
			
			break;
		
		}
		
		
		
		//Devuelvo un String
		return auxs;
	}
	
	
	//Metodos del programa
	
	public static void escribirArchivo() {
		
		//Declaración de objetos
	    FileWriter fichero = null;
	    PrintWriter pw = null;
	    
	    String archivo = getDato("Nombre del fichero",2) + ".txt";
	    String text = 
	    		"Nombre y Apellidos: "+getDato("Introduce nombre y apellidos", 4)+"\r\n"+
				"Dirección: "+getDato("Introduce una Dirección", 4)+"\r\n"+
				"Población: "+getDato("Introduce una Localidad", 4)+"\r\n"+
				"C.P: "+getDato("Introduce un Codigo Postal", 4)+"\r\n"+
				"Tlf: "+getDato("Introduce un Telefono", 4)+"\r\n";
	    
	    
	    try{
	        fichero = new FileWriter(archivo);
	        pw = new PrintWriter(fichero);
	
	        //Escribimos el texto en el archivo
            pw.println(text);
            
            System.out.println("El fichero fue escrito correctamente");
	
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	       try {
	       // Nuevamente aprovechamos el finally para 
	       // asegurarnos que se cierra el fichero.
	       if (null != fichero)
	          fichero.close();
	       } catch (Exception e2) {
	          e2.printStackTrace();
	       }
	    
	    }
		
		
	}
	
	public static void leerArchivo() {
		
		 File archivo = null;
		 FileReader fr = null;
		 BufferedReader br = null;
		 
		 String miarchivo = getDato("Nombre del fichero a leer",2) + ".txt";
		 
		 try {
			 // Apertura del fichero y creacion de BufferedReader para poder
			 // hacer una lectura comoda (disponer del metodo readLine()).
			 archivo = new File (miarchivo);
			 fr = new FileReader (archivo);
			 br = new BufferedReader(fr);
			
			 // Lectura del fichero
			     String linea;
			     while((linea=br.readLine())!=null)
			        System.out.println(linea);
			     
		 } catch(Exception e){
		     e.printStackTrace();
		  }finally{
		     // En el finally cerramos el fichero, para asegurarnos
			 // que se cierra tanto si todo va bien como si salta 
			 // una excepcion.
		     try{                    
		        if( null != fr ){   
		           fr.close();     
		        }                  
		     }catch (Exception e2){ 
		        e2.printStackTrace();
		     }
		  }
		
		
		
	}
	

	public static void main(String[] args) {
		
		/*
		 *  MÉTODO PRINCIPAL A EJECUTAR 
		 *  
		 *  Contiene el flujo Global del programa
		 *  
		 *  */
		
		
		// DECLARACIÓN DE VARIABLES DE CABECERA 
		int aux = 0; //Variable local que almacena posición del menu
		String auxs; //Variable local que almacena un Strins
		
		// CABECERA DEL PROGRAMA 
		System.out.println("+--------------------------------------+");
		System.out.println("|                                      |");
		System.out.println("|   Escritura y Lectura de archivos    |");
		System.out.println("|                                      |");
		System.out.println("|  06/03/2019            By Zoroboak   |");
		System.out.println("+--------------------------------------+");
				
		
		do {
			
			System.out.println();				
			System.out.println("+-------------------------------+");
			System.out.println("+###############################+");
			System.out.println("+-------------------------------+");
			System.out.println("| <>  Menu Principal            |");
			System.out.println("+-------------------------------+");
			System.out.println("| 0.- Salir                     |");
			System.out.println("| 1.- Escribir Archivo          |");
			System.out.println("| 2.- Leer Archivo              |");
			System.out.println("+-------------------------------+");
			
			//Le paso al metodo getDato un String, el parametro que indica lo que 
			//tiene que hacer con el dato, y un array de Strings que no usaremos en este caso
			auxs = getDato("Escoge opción del menu: ",1);
			//Paso el String a entero para trabajar con el
			aux = Integer.parseInt(auxs);
			
			switch(aux) {
			case 0: //0. - SALIR DEL PROGRAMA
				System.out.println();
				System.out.println("Gracias por utilizar este programa. º/(^_^)/º");
				break;
			case 1: //1.- Escribir Archivo
				escribirArchivo();
				break;
			case 2: //2.- Leer Archivo
				leerArchivo();
				break;
			}
		}while(aux!=0);
	}

}
