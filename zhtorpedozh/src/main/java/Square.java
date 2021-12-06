public class Square {
    private int x;
    private int y;
    private Squarstatus squarstatus;

    public Square(int x, int y, Squarstatus squarstatus) {
        this.x = x;
        this.y = y;
        this.squarstatus = squarstatus;
    }

    public void setSquarstatus(Squarstatus squarstatus) {
        this.squarstatus = squarstatus;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Squarstatus getSquarstatus() {
        return squarstatus;
    }
    public char getCharacter() {
        char result = ' ' ;
        switch (squarstatus) {
            case EMPTY:
                result = 'E' ;
                break;
            case HIT:
                result = 'H' ;
                break;
            case SHIP:
                result = 'S' ;
                break;
            case OCEAN:
                result = 'O' ;
                break;
            case MISSED:
                result = 'M';
                break;

        }
        return result;
    }
}