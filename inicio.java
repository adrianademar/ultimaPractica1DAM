package awtAdrianAdemar;

import java.util.Scanner;

public class inicio {
	static Scanner sc ;
/**
 *Te pregunta a que ejercicio quieres acceder
 * @param args
 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int selector;
		System.out.println("Elija el ejercicio a comprobar del 1 al 8");
		System.out.println("El 9 es para salir del programa");
		selector = sc.nextInt();
		switch (selector) {
		case 1:
			ejercicio1 ejercicio = new ejercicio1("ventana", 500, 500);
			break;
		case 2:
			System.out.println("En terminos de ejercicio 2 no hay ejercicio 2");
			break;
		case 3:
			ejercicio3 ejercicio3 = new ejercicio3("ventana", 500, 500);
			break;
		case 4:
			ejercicio4 ejercicio4 = new ejercicio4("ventana", 500, 500);
			break;
		case 5:
			ejercicio5 ejercicio5 = new ejercicio5("ventana", 500, 500);
			break;
		case 6:
			ejercicio6 ejercicio6 = new ejercicio6("ventana", 500, 500);
			break;
		case 7:
			ejercicio7 ejercicio7 = new ejercicio7("ventana", 500, 500);
			break;
		case 8:
			ejercicio8 ejercicio8 = new ejercicio8("ventana", 500, 500);
			 break;
		case 9:
			System.out.println("Hasta la proxima");
			break;
		default:
			System.out.println("Debe seleccionar una opcion que aparezca en el menu");
		}
	
	}

}
