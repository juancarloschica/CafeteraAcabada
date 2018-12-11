import java.util.Scanner;

public class Cafetera {
	static int capsulas = 200;
	static int leche = 200;
	static int vasos = 300;
	static int ventas = 0;
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
       
		System.out.println("Hola, soy su cafetera, dígame que desea.");
		System.out.println("1. Pedir un café.");
		System.out.println("2. Entrar como administrador.");
		System.out.println("3. Apagar máquina.");
		System.out.println("");
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
            System.out.println("¿Qué café desea? Todos valen 1'50€.");
            System.out.println("");
            System.out.println("1. Café solo.");
            System.out.println("2. Café cargado.");
			System.out.println("3. Café con leche.");
			System.out.println("4. Leche.");
			System.out.println("5. Salir.");
			System.out.println("");
			int opcion2 = sc.nextInt();
			
			switch (opcion2) {
				
				case 1:
					System.out.println("Ha seleccionado café solo, gracias y que disfrute de su café.");
					capsulas--; capsulas--; capsulas--; vasos--; ventas++;
					System.out.println("");
					main(args);
				case 2:
					System.out.println("Ha seleccionado café cargado, gracias y que disfrute de su café.");
					capsulas--; capsulas--; leche--; vasos--; ventas++;
					System.out.println("");
					main(args);
				case 3:
					System.out.println("Ha seleccionado café con leche, gracias y que disfrute de su café.");
					capsulas--; leche --; leche--; vasos--; ventas++;
					System.out.println("");
					main(args);
				case 4:
					System.out.println("Ha seleccionado leche manchada, gracias y que disfrute de su café.");
					leche --; leche--; leche--; vasos--; ventas++;
					System.out.println("");
					main(args);
				default:
					System.out.println("");
					main(args);
			}
		}
		
		if (opcion == 2) {
			
			System.out.println("");
            System.out.println("Quiere acceder como administrador, introduzca el cógido de administrador, por favor.");
            System.out.println("");
			int codigo2 = sc.nextInt();
				if (codigo2 != 123) {
					System.out.println("Lo siento, el código no es correcto.");
					main(args);
			} else {
				System.out.println("");
				System.out.println("Hola administrador, ¿qué desea hacer?");
				System.out.println("1. Ver el stock disponible.");
				System.out.println("2. Ver la recaudación.");
				System.out.println("3. Reponer el stock y recoger el dinero.");
				System.out.println("4. Salir");
				System.out.println("");
				int opcion3 = sc.nextInt();
					
				switch (opcion3) {
				
					case 1:
						System.out.println("Capsulas = " + capsulas + ", Leche = " + leche + " y Vasos = " + vasos);
						System.out.println("");
						main(args);
					case 2:
						double recaudacion = ventas * 1.5;
						System.out.println(recaudacion + "€");
						System.out.println("");
						main(args);
					case 3:
						System.out.println("El stock ha sido repuesto.");
						capsulas = 200; leche = 200; vasos = 300; ventas = 0;
						System.out.println("");
						main(args);
					default:
						System.out.println("");
						main(args);
				}
			}
		}
		
		if (opcion == 3) {
			System.out.println("");
            System.out.println("Quiere apagar la máquina, por favor introduzca el código de administrador, por favor.");
            System.out.println("");
			int codigo = sc.nextInt();
			if (codigo != 123) {
				System.out.println("Lo siento, el código no es correcto.");
				System.out.println("");
				main(args);
			} else {
					System.out.println("Máquina apagada.");
			}	
		}
	}
}
