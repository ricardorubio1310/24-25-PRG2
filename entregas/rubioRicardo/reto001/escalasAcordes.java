package entregas.rubioRicardo.reto001;

import java.util.Scanner;

public class escalasAcordes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] notas = {
                "Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"
        };
        String[][] acordesMayores = {
                { "Do", "Mi", "Sol" },
                { "Do#", "Mi#", "Sol#" },
                { "Re", "Fa#", "La" },
                { "Re#", "Fa##", "La#" },
                { "Mi", "Sol#", "Si" },
                { "Fa", "La", "Do" },
                { "Fa#", "La#", "Do#" },
                { "Sol", "Si", "Re" },
                { "Sol#", "Si#", "Re#" },
                { "La", "Do#", "Mi" },
                { "La#", "Do#", "Fa" },
                { "Si", "Re#", "Fa#" }
        };

        String[][] escalasMayores = {
                { "Do", "Re", "Mi", "Fa", "Sol", "La", "Si", "Do" },
                { "Do#", "Re#", "Mi#", "Fa#", "Sol#", "La#", "Si#", "Do#" },
                { "Re", "Mi", "Fa#", "Sol", "La", "Si", "Do#", "Re" },
                { "Re#", "Fa", "Sol", "Sol#", "La#", "Do", "Re#", "Re#" },
                { "Mi", "Fa#", "Sol#", "La", "Si", "Do#", "Re#", "Mi" },
                { "Fa", "Sol", "La", "Si", "Do", "Re", "Mi", "Fa" },
                { "Fa#", "Sol#", "La#", "Si", "Do#", "Re#", "Fa", "Fa#" },
                { "Sol", "La", "Si", "Do", "Re", "Mi", "Fa#", "Sol" },
                { "Sol#", "La#", "Si#", "Do#", "Re#", "Mi#", "Fa#", "Sol#" },
                { "La", "Si", "Do#", "Re", "Mi", "Fa#", "Sol#", "La" },
                { "La#", "Do", "Re", "Fa", "Sol", "Si", "Do#", "La#" },
                { "Si", "Do#", "Re#", "Fa#", "Sol#", "La", "Si", "Si" }
        };

        System.out.println("Ingrese una la nota a trabajar: ");
        System.out.println("0: Do, 1: Do#, 2: Re, 3: Re#, 4: Mi, 5: Fa, 6: Fa#, 7: Sol, 8: Sol#, 9: La, 10: La#, 11: Si");

        int notaElegida = scanner.nextInt();
        System.out.println("Ha elegido la nota " + notas[notaElegida]);
        
         System.out.print("Acorde Mayor: ");
            for (String nota : acordesMayores[notaElegida]) {
                System.out.print(nota + " ");
            }
            System.out.println();

            
            System.out.print("Escala Mayor: ");
            for (String nota : escalasMayores[notaElegida]) {
                System.out.print(nota + " ");
            }
            System.out.println();
            scanner.close();
        }

        
        

}
