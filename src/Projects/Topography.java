package Projects;

public class Topography {

    public static void main(String[] args) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;
        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;
        int pagesInBook = 530;
        int booksCount = 2000;
        boolean coldPrintingMode = false;
        double printRollerTemp = 121;
        int papersCount = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;
        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal = printRollerTemp >= printRollerMinTemp && printRollerTemp <= printRollerMaxTemp;

        boolean paperNormalCount = !paperIsEnough || !inkIsEnough;
        boolean tempNormalMode = !coldPrintingMode && !rollerTempIsNormal;

        boolean errors = false;
        if (paperNormalCount) {
            errors = true;
            System.out.println("Бумаги или чернил недостаточно");}
        if (coversAreEnough) {
        } else { errors = true;
            System.out.println("Обложек недостаточно");}
        if (tempNormalMode) {
            errors = true;
            System.out.println("Неверный режим печати или температура печатающего ролла недопустимая");
        }




if (!errors) {
        System.out.println("Печать разрешена");
    } else {
        System.out.println("Печать запрещена");
    }
}
}
