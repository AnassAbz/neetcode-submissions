class Solution {
public boolean isValidSudoku(char[][] board) {
              if (board == null) return false;
        if (board.length != 9 || board[0].length != 9) return false;

        HashSet<Character> rowSet;
        HashSet<Character> colSet;

        HashSet<Character> blockSet01 = new HashSet<>();
        HashSet<Character> blockSet02 = new HashSet<>();
        HashSet<Character> blockSet03 = new HashSet<>();

        // Checking first, each row, and each column
        // Checking rows i = 0 -> 8 [[...] [...]  [...] [...]  ...]
        for (int i =0; i < 9; i++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int j =0; j < 9; j++){

                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) return false;
                    rowSet.add(board[i][j]);
                }

                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) return false;
                    colSet.add(board[j][i]);
                }
            }
        }

        for (int i =0; i < board.length; i++){
            if (i % 3 == 0){
                blockSet01 = new HashSet<>();
                blockSet02 = new HashSet<>();
                blockSet03 = new HashSet<>();
            }
            for (int j =0; j < board.length; j++){
                if (j < 3){
                    if (blockSet01.contains(board[i][j]) && board[i][j] != '.'){
                        return false;
                    }
                    blockSet01.add(board[i][j]);
                }
                else if (j < 6){
                    if (blockSet02.contains(board[i][j]) && board[i][j] != '.'){
                        return false;
                    }
                    blockSet02.add(board[i][j]);
                }
                else {
                    if (blockSet03.contains(board[i][j]) && board[i][j] != '.'){
                        return false;
                    }
                    blockSet03.add(board[i][j]);
                }

            }
        }
        return true;
    }
}
