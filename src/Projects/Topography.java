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

        boolean printRollerTempForPrinting = printRollerMinTemp <= printRollerTemp && printRollerTemp <= printRollerMaxTemp;
        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;

        boolean errors = false;

        if (!paperIsEnough || !inkIsEnough) {
            errors = true;
            System.out.println("Бумаги или чернил недостаточно");
        } else {
            if (coversAreEnough) {
                if (!coldPrintingMode && !printRollerTempForPrinting) {
                    errors = true;
                    System.out.println("Неверный режим печати или температуры печатающего ролла недопустимая");
            } else {
                errors = true;
                System.out.println("Обложек недостаточно");
                }
            }
        }

        if (!errors) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }

    }
}
