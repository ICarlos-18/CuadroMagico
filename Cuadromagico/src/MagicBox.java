public class MagicBox {

    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[0][i];
        }

        // Verificar las filas
        for (int i = 1; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += matrix[i][j];
            }
            if (tmp != sum) {
                return false;
            }
        }

        // Verificar las columnas
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int j = 0; j < n; j++) {
                tmp += matrix[j][i];
            }
            if (tmp != sum) {
                return false;
            }
        }

        // Verificar las diagonales
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += matrix[i][i];
        }
        if (tmp != sum) {
            return false;
        }

        tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += matrix[i][n - i - 1];
        }
        if (tmp != sum) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] testMatrix = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        if (isMagicSquare(testMatrix)) {
            System.out.println("Es un cuadro mágico.");
        } else {
            System.out.println("No es un cuadro mágico.");
        }
    }
}