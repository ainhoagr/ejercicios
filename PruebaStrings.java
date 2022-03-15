/* STRINGS
 
 La clase String es un tipo de datos no primitivo (como los int, char, byte, boolean)
que viene "predefinido" en el lenguaje Java. Los Strings o cadenas de caracteres almacenan
una secuencia de caracteres. Además de almacenar una secuencia de caracteres, la clase String
proporciona métodos que nos permiten operar con las cadenas de caracteres: conocer su longitud,
pasar a mayúsculas-minúsculas, realizar búsquedas... 
Conviene tener claro que una vez creado un objeto de la clase String, el contenido de éste NO
puede ser modificado. Cuando queramos cambiar la secuencia de caracteres original, se creará
una nueva cadena. Eso explica, por ejemplo, que un método como toLowerCase() devuelva un objeto
String (la nueva cadena con los caracteres en minúsculas).

Estudia los ejemplos del programa, las referencias y realiza los ejercicios propuestos.
 
Referencias: 
 https://docs.oracle.com/javase/tutorial/java/data/strings.html
 
 https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 
 https://www.ntu.edu.sg/home/ehchua/programming/java/J3d_String.html
 
 


*/
import java.util.Scanner;


public class PruebaStrings {
	
    public static void main(String [] args) {
        
		
		
		
		Scanner lector = new Scanner(System.in);
		
		String str1 = "Hola a todos"; 
		String str2 = new String("Buenas tardes. ");; 

  
        // convertir una cadena a mayúsculas
        String str3 = str1.toUpperCase(); 
		
		// ver contenido y calcular longitud
        System.out.println(str1 + " Longitud: " + str1.length() ); 
		System.out.println(str2 + " Longitud: " + str2.length() ); 
		System.out.println(str3 + " Longitud: " + str3.length() ); 
	
		// imprimir una cadena carácter a carácter
		for(int i=0; i<str3.length(); i++) {
			System.out.print(str3.charAt(i));
		}
		System.out.println();
		
		// Comparar cadenas léxico-gráficamente (muy útil para ordenar)
		String str4 = "abad";
        String str5 = "zanahoria";
        int j = str4.compareTo(str5);
        System.out.println("El resultado de comparar '" + str4 + "' con '" + str5 + "' con str4.compareTo(str5) es: " + j);	
        j = str5.compareTo(str4);
        System.out.println("El resultado de comparar '" + str5 + "' con '" + str4 + "' con str5.compareTo(str4) es: " + j);			
		
		str4 = "zanahoria";
		j = str5.compareTo(str4);
		System.out.println("El resultado de comparar '" + str5 + "' con '" + str4 + "' con str5.compareTo(str4) es: " + j);			

		if (str4.equals(str5)) {
			System.out.println("Ahora las dos cadenas son iguales. Igual contenido");
		}
		if (str4 == str5) {
			System.out.println("Las dos referencias, str4 y str5 apuntan al mismo objeto");
		}
		str4 = new String("zanahoria");
		str5 = new String("zanahoria");
		if (str4 == str5) {
			System.out.println("Las dos referencias, str4 y str5 apuntan al mismo objeto");
		} else {
			System.out.println("Ahora str4 y str5 NO apuntan al mismo objeto");
		}
		
		// leer parámetros pasados al programa desde CONSOLA, al arrancar.
		for(String s: args) {
			System.out.println(s);
		}
		
		
		// Leer por consola: método nextLine
		
		System.out.print("Introduzca una cadena: ");
		String cadena = lector.nextLine();
		System.out.println("Leido por consola: " + cadena);
		System.out.println(cadena);
		//Ejercicio1
		
		System.out.println("Introduzca un caracter: ");
		String caracter = lector.nextLine();
		char c = caracter.charAt(0);
		
		int resul = cadena.indexOf(c);
		if(resul != -1) {
			System.out.println("el caracter " + c + "aparece por primera vez en index : " + resul);
		} else {
			System.out.println("El caracter"  + c + "no está");
		}
		
		System.out.print("Introduzca una cadena: ");
		String cadena2 = lector.nextLine();
		System.out.print("Introduzca otra cadena: ");
		String cadena3 = lector.nextLine();
		cadena = cadena2.concat(cadena3);
		System.out.println("Resulado de concatenar ambas cadenas : " + cadena);
		
		int comp = compareTo("alba", "albacea");
		System.out.println(comp);

	}
	/*
	Devuelve:
	0 si son iguales
	-menor que 0, si s1 es menor (alfabeticamente)
	mayor que 0, si s2 es mayor
	*/
	public static int compareTo(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		//limite equivale a un if else.
		int limite = (len1 < len2)? len1 : len2;
		int resta = 0;
			for(int i=0; i< limite && resta == 0; i++){
			 resta = s1.charAt(i)-s2.charAt(i);
			
		}
		if(resta==0 && len1!=len2) {
			//va antes la más corta
			if(len1 < len2){
				resta = -1;
			}else{
				resta = 1;
			}
		}
		return resta;
	}
}



/* 
   Ejercicio 1:
      Haz un programa que lea una cadena por ccnsola. A continuación, lee un carácter e informa al usuario 
	  de si el carácter está contenido en la cadena y su posición, o si no está.
	  
   Ejercicio 2: 
       Haz un programa que lea dos cadenas por ccnsola y las una o concatene en otra cadena.
	   Imprime el resultado.
	   
   Ejercicio 3:
       Asigna una palabra a tres cadenas de caracteres. Conviértelas a minúsculas. 
	   Ordénalas alfabéticamente e imprímelas por pantalla en orden.
	   /compareTo/
	   
   Ejercicio 4: 
       Lee diez cadenas por consola y guárdalas en un array.  Imprime el contenido del array en orden inverso.
	   
   Ejercicio 5:
        Realiza un programa que utilice el método substring (los dos métodos que hay).
		
	   
      
*/