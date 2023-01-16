package Projects;

public class Topography {
    public static void main(String[] args) {

        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;

        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2001;

        boolean coldPrintingMode = false;
        double printRollerTemp = 90;

        int papersCount = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean printRollerTempForPrinting = printRollerMinTemp < printRollerTemp && printRollerTemp < printRollerMaxTemp;
        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;

        if ( paperIsEnough && inkIsEnough && coversAreEnough && (coldPrintingMode || printRollerTempForPrinting)) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }

    }
}
