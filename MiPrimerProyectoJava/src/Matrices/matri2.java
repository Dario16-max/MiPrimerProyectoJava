package Matrices;

public class matri2 {
    public static void main(String[] args) {
        char[][] tablero = {
            {'X', 'O', 'X'},
            {'O', 'X', ' '},
            {' ', 'O', ' '}
        };
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
