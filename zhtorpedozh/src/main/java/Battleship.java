
public class Battleship {
    private Display display;
    private Game game = new Game();
    private Input input;

    public Battleship() {
        display = new Display();
    }

    public void Start() {
        display.printMenu();
        mainMenu();
    }

    public void mainMenu() {
        int choice;
        boolean exit = false;
        input = new Input();

        while (!exit) {

            display.printMainMenuOptions();
            System.out.println("Mit választasz?: ");
            System.out.println();
            choice = input.getIntegerMenuOption();
            switch (choice) {
                case 1:
                    display.printMessages("Játszunk! ");
                    game.addShipsToEmptyBoard();

                    break;
                case 2:
                    display.printMessages("\033[H\033[2J");
                    System.out.flush();
                    display.gameRules();
                    break;
                case 3:
                    display.printMessages("Kilépés...");
                    exitGame();
                    break;
                default: mainMenu();

            }

        }


    }

    public void exitGame() {
        display.printExitMessage();
        System.exit(0);
    }


}

