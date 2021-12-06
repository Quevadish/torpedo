import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private List<Board> boards = new ArrayList<>();
    int choice;
    List<Integer> CoordinatesAndShipType = new ArrayList<>();

    public List<Board> getBoards(){
        generateBoard();
        return boards;
    }
    public void generateBoard(){
        System.out.println("Magasság kiválasztása: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("szélesség kiválasztása: ");
        int y = scanner.nextInt();
        Board board1 = new Board(x, y);
        Board board2 = new Board(x, y);
        boards.add(board1);
        boards.add(board2);
    }

    public void Input() {

    }

    public int getIntegerMenuOption(){
        choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private List<Integer> AskCoordinatesForShipsAndType(){
        this.CoordinatesAndShipType = new ArrayList<>();
        System.out.println("sor kiválasztása : ");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.println("oszlop kiválasztása : ");
        int col = scanner.nextInt();
        System.out.println("hajó kiválasztása: \n" + "1.CARRIER \n" + "2.CRUISER \n" + "3.BATTLESHIP \n" + "4.DESTROYER \n" + "5.SUBMARINE \n");
        int shipType = scanner.nextInt();
        CoordinatesAndShipType.add(row);
        CoordinatesAndShipType.add(col);
        CoordinatesAndShipType.add(shipType);
        return CoordinatesAndShipType;
    }

    public Ship createShip(int player){
        int GamePlayer = player +1;
        Square shipPart;
        Ship ship;
        System.out.println("Játékos " + GamePlayer + " hajó lerakása");
        CoordinatesAndShipType = AskCoordinatesForShipsAndType();
        int row = CoordinatesAndShipType.get(0);
        int col = CoordinatesAndShipType.get(1);
        int shipType = CoordinatesAndShipType.get(2);
        shipPart = new Square(row, col, Squarstatus.SHIP);
        ship = new Ship(new ArrayList<>(),ShipType.values()[shipType-1]);
        boards.get(player).placeShip(shipPart,ship);
        return ship;
    }

    public int[] shoot(int player){
        int GamePlayer = player +1;
        System.out.println("Játékos " + GamePlayer + " lövés");
        System.out.println("sor kiválasztása");
        int row = scanner.nextInt();
        System.out.println("oszlop kiválasztása: ");
        int col= col= scanner.nextInt();
        return new int[]{row,col};
    }

}