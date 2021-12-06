import java.util.List;

public class Player {

    private List<Ship> ships;
    private Board board;
    private int remainingShips=0;

    public Player(List<Ship> ships, Board board) {
        this.ships = ships;
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public int numberOfSquaresOfShips(List<Ship> ships){
        int sumOfAllSquares = 0;
        for (Ship ship : ships){
            sumOfAllSquares += ship.getShipType().label;
        }
        return sumOfAllSquares;
    }
    public boolean handleShot(int x, int y){
        for (Ship ship: ships){
            for (Square square: ship.getFields()){
                if (square.getY() == y && square.getX() == x && square.getSquarstatus().equals(Squarstatus.SHIP)){
                    square.setSquarstatus(Squarstatus.HIT);
                    board.getSquare(x,y).setSquarstatus(Squarstatus.HIT);
                    System.out.printf("Talált! \n ");
                    return true;
                } else if (square.getY() == y && square.getX()== x && square.getSquarstatus().equals(Squarstatus.HIT)){
                    square.setSquarstatus(Squarstatus.HIT);
                    board.getSquare(x,y).setSquarstatus(Squarstatus.HIT);
                    System.out.printf("Már lőttél ide \n");
                    return false;
                }
            }
        }
        board.getSquare(x, y).setSquarstatus(Squarstatus.MISSED);
        System.out.printf("Mellé! \n");
        return false;
    }
}