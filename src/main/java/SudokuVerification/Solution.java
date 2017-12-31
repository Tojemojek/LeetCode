package SudokuVerification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        List<List<Character>> lista = new ArrayList<>();


        for (int i = 1; i <= 9; i++) {
            lista.add(makeList(board, 1, 9, i, i));
        }

        for (int i = 1; i <= 9; i++) {
            lista.add(makeList(board, i, i, 1, 9));
        }

        for (int i = 1; i <= 9; i += 3) {
            for (int j = 1; j <= 9; j += 3) {
                lista.add(makeList(board, i, i + 2, j, j + 2));
            }
        }


        for (List<Character> characters : lista) {
            if (weryfikuj(characters) == false) {
                return false;
            }
        }

        return true;
    }


    private List<Character> makeList(char[][] board, Integer startX, Integer endX, Integer startY, Integer endY) {

        List<Character> lista = new ArrayList<>();

        for (int i = startX - 1; i <= endX - 1; i++) {
            for (int j = startY - 1; j <= endY - 1; j++) {
                if (board[i][j] != '.')
                    lista.add(board[i][j]);
            }
        }
        return lista;

    }

    private boolean weryfikuj(List<Character> list) {

        Set<Character> set = new HashSet<Character>(list);

        if (list.size() == set.size()) {
            return true;
        }
        return false;
    }

}
