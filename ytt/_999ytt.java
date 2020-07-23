public class _999ytt {
    public int numRookCaptures(char[][] board) {
        int R_row = 0;//车的行
        int R_col = 0;//车的列
        int ans = 0;
        for(int i=0 ; i<8 ; i++){
            for(int j=0 ; j<8 ; j++){
                if(board[i][j] == 'R'){
                    R_row = i;
                    R_col = j;
                    break;
                }
            }
        }
        //向左判断，row一样，col递减
        if(R_col != 0){
            for(int i=R_col -1 ; i>=0 ; i--){
                if(board[R_row][i] == 'p') {
                    ans++;
                    break;
                }
                if(board[R_row][i] == 'B')break;
            }
        }
        //向右判断，row一样，col递增
        if(R_col != 7){
            for(int i=R_col +1 ; i<8 ; i++){
                if(board[R_row][i] == 'p') {
                    ans++;
                    break;
                }
                if(board[R_row][i] == 'B')break;
            }
        }
        //向上判断，row递减，col一样
        if(R_row != 0){
            for(int i=R_row -1 ; i>=0 ; i--){
                if(board[i][R_col] == 'p'){
                    ans++;
                    break;
                }
                if(board[i][R_col] == 'B')break;
            }
        }
        //向下判断，row递增，col一样
        if(R_row != 7){
            for(int i=R_row +1 ; i<8 ; i++){
                if(board[i][R_col] == 'p') {
                    ans++;
                    break;
                }
                if(board[i][R_col] == 'B')break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _999ytt test = new _999ytt();
        char[][] ch = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
        System.out.println(test.numRookCaptures(ch));
    }
}
