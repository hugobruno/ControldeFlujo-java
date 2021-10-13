package com.generation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa tu edad");
	int edad = sc.nextInt();
	System.out.println("¿Cual es tu nombre?");
	sc.nextLine();
	String nombre = sc.nextLine();
	if (edad >= 18) {
		System.out.println("Felicidades " + nombre + ", puedes votar");
	}else{
		System.out.println("Hola! " + nombre + " ,aun no puedes votar");
    }
    }
}