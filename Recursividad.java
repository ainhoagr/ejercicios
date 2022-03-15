/* 
    Algunos lenguajes de programación permiten que una función o método se llame a sí
    mismo. Esta técnica se denomina recursividad y permite solucionar ciertos
    problemas en programación.
    
    Como ejemplo típico veremos el caso del cálculo del factorial. La función
    (matemática) factorial es: n! = n*(n-1)*(n-2)...*1.
    Podemos decir que la función factorial es:
            1! = 1
            n! = n*(n-1)!
    Así, si tenemos que calcular el factorial de 10, podemos decir que:
         10! = 10* 9!
    Y, para calcular el factorial de 9: 9! = 9*8!
    Así sucesivamente, hasta llegar a el factorial de 1 que, por definición,
    es uno. 
    Si tenemos un método que calcula el factorial, podemos escribir:
               factorial (10) = 10*factorial(9) = 10*9*factorial(8) = ...
    
    En este programa calcularemos el factorial utilizando recursividad. Ya vimos
    que el factorial se puede calcular mediante  iteraciones y, de hecho, de 
    esta forma es más eficiente que utilizando recursividad.
    
    Es muy IMPORTANTE que las funciones o métodos recursivos tengan una condición que haga
    que un momento dado, deje de llamarse a sí misma y retorne. Si se llaman
    continuamente a sí mismas, el programa además de no terminar, terminaría
    "rompiéndose" por consumir todo el espacio disponible en la pila (la 
    dirección de retorno y los parámetros pasados a un método se almacenan en
    la pila y se liberan cuando retornamos del método. Si nunca retornamos...
    este espacio no se libera).
*/
import java.util.Scanner;


public class Recursividad {
	static Scanner lector = new Scanner(System.in);
	public static int factorial (int num) {
		if (num != 1) {
			return num*factorial(num -1);
		}
		else {
			return 1;
		}
	}
	
    public static void main(String [] args) {
        
		
	    int num; 
		Scanner lector = new Scanner(System.in);
			
		System.out.print("Introduce un numero entero: ");
		num = lector.nextInt();
		
		System.out.println("El factorial de " + num + " es " + factorial(num));
		lector.nextLine(); //limpia el buffer del teclado
		leeImprimeFraseInverso();
		
	}
	
	public static void leeImprimeFraseInverso(){
		System.out.println("Introduce frase: ");
		String str = lector.nextLine();
		if (str.length()!=0){
			leeImprimeFraseInverso();
			System.out.println(str);
			
	}
	
	}
	

}
/*  EJERCICIOS:

  1. Realiza un método:
    public static void int sumaNumeros (int n);
	que calcule recursivamente la suma de los primeros n números enteros.
	
  2. Codifica un método:
      public static void leeImprimeFrasesInverso()
	 que pida frases al usuario hasta que introduzca una línea vacía y que, entonces,
	 imprima las frases en el orden inverso al que fueron leídas.
	 Ejemplo:
	 Introduce frase: Hola, buenos días.
	 Introduce frase: ¿Cómo estás?
	 Introduce frase: Adiós
	 
	 Adiós
	 ¿Cómo estás?
	 Hola, buenos días.



*/
