package Lab4.ch4;

public class Digit {
    private int height;
    private int width;
    private char[][] representation;

    public Digit(int height, int width) {
        this.height = height;
        this.width = width + 2;
    }

    public void createRepresentation(char digit) {
        char basicRepresentation[][];
        //basic representation is on width 1 and height 3;

        switch(digit){
            case '0':
                basicRepresentation = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
                break;
            case '1' :
                basicRepresentation = new char[][]{{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ','|'}};
            break;
            case '2':
                basicRepresentation = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_',' '}};
                break;
            case '3':
                basicRepresentation = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_','|'}};
                break;
            case '4' :
                basicRepresentation = new char[][]{{' ', ' ', ' '}, {'|', '_', '|'}, {' ', ' ','|'}};
                break;
            case '5':
                basicRepresentation = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {' ', '_','|'}};
                break;
            case '6':
                basicRepresentation = new char[][]{{' ', '_', ' '}, {'|', '_', ' '}, {'|', '_','|'}};
                break;
            case '7' :
                basicRepresentation = new char[][]{{' ', '_', ' '}, {' ', ' ', '|'}, {' ', ' ','|'}};
                break;
            case '8':
                basicRepresentation = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_','|'}};
                break;
            case '9':
                basicRepresentation = new char[][]{{' ', '_', ' '}, {'|', '_', '|'}, {' ', '_','|'}};
                break;
            default:
                basicRepresentation = new char[][]{{' ', ' ', ' '}, {' ', '|', ' '}, {' ', '|',' '}};
        }

        if(height == 3 && width == 3) {
            this.representation = basicRepresentation;
        }
        else { //extend the digit
            this.representation = new char[height][width];
            //first row
            this.representation[0][0] = basicRepresentation[0][0];
            this.representation[0][width - 1] = basicRepresentation[0][2];
            for(int j = 1; j < width - 1; j++) {
                this.representation[0][j] = basicRepresentation[0][1];
            }
            //first half
            for(int i = 1; i < (height / 2); i++) {
                this.representation[i][0] = basicRepresentation[1][0];
                this.representation[i][width - 1] = basicRepresentation[1][2];
                for(int j = 1; j < width - 1; j++) {
                    this.representation[i][j] = ' ';
                }
            }
            //middle
            int middle = height / 2;
            this.representation[middle][0] = basicRepresentation[1][0];
            this.representation[middle][width - 1] = basicRepresentation[1][2];
            for(int j = 1; j < width - 1; j++) {
                this.representation[middle][j] = basicRepresentation[1][1];
            }
            //second half
            for(int i = (height / 2) + 1; i < height - 1; i++) {
                this.representation[i][0] = basicRepresentation[2][0];
                this.representation[i][width - 1] = basicRepresentation[2][2];
                for(int j = 1; j < width - 1; j++) {
                    this.representation[i][j] = ' ';
                }
            }
            //last row
            this.representation[height - 1][0] = basicRepresentation[2][0];
            this.representation[height - 1][width - 1] = basicRepresentation[2][2];
            for(int j = 1; j < width - 1; j++) {
                this.representation[height - 1][j] = basicRepresentation[2][1];
            }

        }
    }

    public char[][] getRepresentation() {
        return representation;
    }
}
