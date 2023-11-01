import java.util.Scanner;

public class MagicBox2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño de las filas y columnas: ");
            int r1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            
            int CF = 0;

            if (r1 == c1) {
                CF = r1;
            } else {
                System.out.println("La matriz no es cuadrada.");
                return; 
            }

            int[][] matriz = new int[CF][CF];

            System.out.println("Ingrese los elementos de la matriz:");
            for (int i = 0; i < CF; i++) {
                for (int j = 0; j < CF; j++) {
                    System.out.print("matriz[" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            boolean esCuadroMagico = true;
            int sumaFila0 = 0;
            int sumaDiagonalPrincipal = 0;

            for (int i = 0; i < CF; i++) {
                sumaFila0 += matriz[0][i];
                sumaDiagonalPrincipal += matriz[i][i];
            }

            if (sumaFila0 != sumaDiagonalPrincipal) {
                esCuadroMagico = false;
            }

            for (int i = 1; i < CF; i++) {
                int sumaFila = 0;
                for (int j = 0; j < CF; j++) {
                    sumaFila += matriz[i][j];
                }

                if (sumaFila != sumaFila0) {
                    esCuadroMagico = false;
                    break; 
                }
            }

            for (int j = 0; j < CF; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < CF; i++) {
                    sumaColumna += matriz[i][j];
                }

                if (sumaColumna != sumaFila0) {
                    esCuadroMagico = false;
                    break;
                }
            }

            boolean result = true;
            if(sumaFila0 != sumaDiagonalPrincipal){
                result = false;
            }
            if (esCuadroMagico) {

                System.out.println("El cuadro es mágico.");
                System.out.println("El resultado es "+sumaFila0);

            }else{

                System.out.println("No es cuadrada");
            }
        }
            
            
        }
}