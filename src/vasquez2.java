import java.util.Scanner;


public class vasquez2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner mi_scanner = new Scanner(System.in);
		
	    int nota1;
	    int nota2;
	    int nota3;
	    int nota4;
	    System.out.println("nombre del Alumno");
		Scanner mi_scannera = new Scanner (System.in);
		String nombre1=mi_scannera.next();
	    System.out.println("nota1: ");
	    nota1 = mi_scanner.nextInt();
	    System.out.println("nota2: ");
	    nota2 = mi_scanner.nextInt();
	    System.out.println("nota3: ");
	    nota3 = mi_scanner.nextInt();
	    nota4 = ((nota1+nota2+nota3)/(3));
	    System.out.println("El promedio es: " + nota4);

	    if(nota4>=60){
	        System.out.println("El Alumno Aprobo");
	    }else
	        System.out.println("El Alumno Reprobo");

	    System.out.println("nombre del Alumno");
		Scanner mi_scannerv = new Scanner (System.in);
		String nombre2=mi_scannera.next();
	    System.out.println(" nota1: ");
	    nota1 = mi_scanner.nextInt();
	    System.out.println("nota2: ");
	    nota2 = mi_scanner.nextInt();
	    System.out.println("nota3: ");
	    nota3 = mi_scanner.nextInt();
	    nota4 = ((nota1+nota2+nota3)/(3));
	    System.out.println("El promedio es: " + nota4);

	    if(nota4>=60){
	        System.out.println("El Alumno Aprobo");
	    }else
	        System.out.println("El Alumno Reprobo");

	    System.out.println("nombre del Alumno");
		Scanner mi_scannerc = new Scanner (System.in);
		String nombre3=mi_scannera.next();
	    System.out.println("nota1: ");
	    nota1 = mi_scanner.nextInt();
	    System.out.println("nota2: ");
	    nota2 = mi_scanner.nextInt();
	    System.out.println("nota3: ");
	    nota3 = mi_scanner.nextInt();
	    nota4 = ((nota1+nota2+nota3)/(3));
	    System.out.println("El promedio es: " + nota4);

	    if(nota4>=60){
	        System.out.println("El Alumno Aprobo");
	    }else
	        System.out.println("El Alumno Reprobo");
	}

	}