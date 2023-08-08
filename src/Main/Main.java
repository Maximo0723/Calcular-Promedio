package Main;

import java.util.Scanner;

public class Main {
//Calcula el promedio
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de alumnos");
		int numeroAlumnos= scanner.nextInt();
		float [] calificaciones= new float[numeroAlumnos];
		float suma= 0;
		int numeroMayor= 0;
		int numeroMenor= 100;
		for(int i=0; i < numeroAlumnos; i++) {
			System.out.println("Ingrese la calificacion del alumno " + i);
			int calificacionAlumnos= scanner.nextInt();
			calificaciones[i]= calificacionAlumnos;
			suma= suma + calificaciones[i];
			if(calificacionAlumnos > numeroMayor) {
				numeroMayor= calificacionAlumnos;
			}
			if(calificacionAlumnos < numeroMenor) {
				numeroMenor= calificacionAlumnos;
			}
		} 
		float promedio= suma / numeroAlumnos;
		System.out.println("Promedio: " + promedio);
		System.out.println("Mayor calificación: " + numeroMayor);
		System.out.println("Menor calificación: " + numeroMenor);
	}
}
