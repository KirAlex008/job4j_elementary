package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if ('X' != board[row][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
        public static boolean monoVertical(char[][] board, int column) {
            boolean result = true;
            for (int i = 0; i < board.length; i++) {
                if ('X' != board[i][column]) {
                    result = false;
                    break;
                }
            }

        return result;
    }
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] diag = MatrixCheck.extractDiagonal(board);
        for (int i = 0; i < 3; i++) {
            if ((diag[i] == 'X') & ((monoHorizontal(board, i) || monoVertical(board, i)))) {
                result = true;
                break;
            }
            }
        return result;
        }


}