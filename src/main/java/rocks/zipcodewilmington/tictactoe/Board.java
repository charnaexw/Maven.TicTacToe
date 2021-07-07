package rocks.zipcodewilmington.tictactoe;

import java.util.ArrayList;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        String winning = getWinner();
        Boolean tie = isTie();
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++)
                if(isInFavorOfO().equals(this.matrix[x][y])){
                    return false;}
        }return true;
    }

    public Boolean isInFavorOfO() {
        String winning = getWinner();
        Boolean tie = isTie();
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++){
                if (tie.equals(this.matrix[x][y]) == winning.equals(this.matrix[x][y]))
                    return false;}
        }return true;
    }

    public Boolean isTie() {
        String winning = getWinner();
        for (int x = 0; x < matrix.length-1; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                if (winning.equals(this.matrix[x][y]) == winning.equals(this.matrix[x][y])) {
                    return false;
                }
            }

        }return true;
    }

    public String getWinner() {
        for (int x = 0; x < this.matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                if ((this.matrix[x][y]) == (this.matrix[x + 1][y]) && (this.matrix[x][y]) == (this.matrix[x + 2][y])) {
                    return String.valueOf(matrix[x][y]);//straight across win

                } else if ((this.matrix[x][y + 2])==(this.matrix[x + 1][y + 2])&&(this.matrix[x][y+2])==(this.matrix[x + 2][y + 2])) {
                    return String.valueOf(matrix[x][y + 2]);//bottom win

                } else if ((this.matrix[x][y]) == (this.matrix[x][y + 1]) && (this.matrix[x][y]) == (this.matrix[x][y + 2])) {
                    return String.valueOf(matrix[x][y]);//left side

                } else if ((this.matrix[x + 2][y]) == (this.matrix[x + 2][y + 1]) && (this.matrix[x + 2][y]) == (this.matrix[x + 2][y + 2])) {
                    return String.valueOf(matrix[x + 2][y]);//right side

                } else if ((this.matrix[x + 1][y]) == (this.matrix[x + 1][y + 1]) && (this.matrix[x + 1][y]) == (this.matrix[x + 1][y + 2])) {
                    return String.valueOf(matrix[x + 1][y+1]);//middle column

                } else if ((this.matrix[x][y + 1]) == (this.matrix[x + 1][y + 1]) && (this.matrix[x][y + 1]) == (this.matrix[x + 2][y + 1])) {
                    return String.valueOf(matrix[x][y + 1]);//middle row

                } else if ((this.matrix[x][y]) == (this.matrix[x + 1][y + 1]) && (this.matrix[x][y]) == (this.matrix[x + 2][y + 2])) {
                    return String.valueOf(matrix[x][y]);//diagonal left

                } else if ((this.matrix[x + 2][y]) == (this.matrix[x + 1][y + 1]) && (this.matrix[x + 2][y]) == (this.matrix[x][y + 2]))
                    return String.valueOf(matrix[x + 2][y]);//diagonal right
            }
        }
        return "";
    }
}


