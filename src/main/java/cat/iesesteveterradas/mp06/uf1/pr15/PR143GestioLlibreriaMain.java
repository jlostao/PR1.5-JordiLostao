package cat.iesesteveterradas.mp06.uf1.pr15;

import java.io.IOException;
import java.util.Scanner;

import cat.iesesteveterradas.mp06.uf1.exemples.LecturaArxiuList;


public class PR143GestioLlibreriaMain {
        static Scanner in = new Scanner(System.in); 
        public static void main(String[] args) throws IOException {
        boolean running = true;

        while (running) {

            String menu = "Escull una opció:";
            menu = menu + "\n 1) Lectura del fitxer ";
            menu = menu + "\n 2) Modificació";
            menu = menu + "\n 3) Afegit";
            menu = menu + "\n 4) Esborrat ";
            menu = menu + "\n 5) Guardat ";
            menu = menu + "\n 0) salir";
            System.out.println(menu);

            int opcio = Integer.valueOf(llegirLinia("Opció:"));
            
            try {
                switch (opcio) {
                    case 1: ReadFile.main(args); break;
                    case 2: ModifyFile.main(args); break;
                    case 3: WriteFile.main(args); break;
                    case 4: DeleteFile.main(args); break;
                    case 5: LecturaArxiuList.main(args); break;
                    case 0: running = false; break;
                    default: break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        in.close();
    }

    static public String llegirLinia (String text) {
        System.out.print(text);
        return in.nextLine();
    }
}