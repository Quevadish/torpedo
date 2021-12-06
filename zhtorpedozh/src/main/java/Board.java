public class Board {
    private int sizeX;
    private int sizeY;
    Square matrix[][];

    public Board(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fillBoard(sizeX,sizeY);
    }

    public int getSizeX() {
        return sizeX;
    }

    public Square getSquare(int x, int y){
        return matrix[x][y];
    }

    public int getSizeY() {
        return sizeY;
    }

    public Square[][] fillBoard(int x, int y){
        matrix= new Square[sizeX][sizeY];
        for (int row=0;row<x;row++){
            for (int col = 0;col<y;col++){
                matrix[row][col] = new Square(row,col,Squarstatus.OCEAN);
            }
        }
        return matrix;
    }

    public void placeShip(Square square, Ship ship){
        switch (ship.getShipType().label){
            case 1:
                square.setSquarstatus(Squarstatus.SHIP);
                ship.add(square);
                break;
            case 2:
                square.setSquarstatus(Squarstatus.SHIP);
                ship.add(square);
                int x= square.getX();
                int y= square.getY();
                ship.add(new Square(x,y+1, Squarstatus.SHIP));
                break;
            case 3:
                square.setSquarstatus(Squarstatus.SHIP);
                ship.add(square);
                x= square.getX();
                y= square.getY();
                ship.add(new Square(x,y+1, Squarstatus.SHIP));
                ship.add(new Square(x,y+2, Squarstatus.SHIP));
            case 4:
                square.setSquarstatus(Squarstatus.SHIP);
                ship.add(square);
                x= square.getX();
                y= square.getY();
                ship.add(new Square(x,y+1, Squarstatus.SHIP));
                ship.add(new Square(x,y+2, Squarstatus.SHIP));
                ship.add(new Square(x,y+3, Squarstatus.SHIP));


        }
    }
}