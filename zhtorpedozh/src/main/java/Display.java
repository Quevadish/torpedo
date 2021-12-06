

public class Display {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

    public Display() {

    }

    public void printMenu() {
        System.out.println("Torpedo játék inditása........ ");

    }

    public void printMessages(String message) {
        System.out.println(message);
    }

    public void printMainMenuOptions() {
        System.out.println("Nyomd meg a:\n" +
                "\t 1 - Játék\n" +
                "\t 2 - Hogyan játszunk?\n" +
                "\t 3 - Kilépés\n");
    }

    public void printExitMessage() {
        System.out.println("Legyen szép napod!!");

    }
    public void gameRules() {
        System.out.println("A 'Játék' kiválasztása után megadjuk a magasság és szélesség arányát. \n" +
                "Ezután megadjuk, hogy melyik sorba és oszlopba szeretnénk lerakni a hajónkat. \n" +
                "Kiválasszuk milyen hajót szeretnénk lerakni: carrier, cruiser \n" +
                "Akkor nyerünk ha az ellenfél összes hajóját elpusztitjuk! ");

    }

    public void printBoard(Board board) {
        System.out.print("    ");
        for (int i = 0; i < board.getSizeX(); i++) {
            System.out.print(i + "  " );
        }
        System.out.println();
        for (int row = 0; row < board.getSizeX(); row++) {
            if (row < 10) {
                System.out.print(row + "   ");
            } else {
                System.out.print(row);
            }

            for (int col = 0; col < board.getSizeY(); col++) {
                switch (board.getSquare(row, col).getCharacter()) {
                    case 'O':
                        System.out.print(ANSI_BLUE_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'H':
                        System.out.print(ANSI_RED_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'S':
                        System.out.print(ANSI_YELLOW_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'E':
                        System.out.print(ANSI_CYAN_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'M':
                        System.out.print(ANSI_BLACK_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                }

            }
            System.out.println();

        }
    }
}


