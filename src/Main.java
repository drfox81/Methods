import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYear(2000);
        System.out.println();
        systemSelection(0, 2022);
        System.out.println();
        deliveryCard(111);

    }

    public static void deliveryCard(int distance) {
        int deliveryTime = 1;
        if (distance < 0) {
            System.out.println("Вы ошиблись!");
            return;
        }
        if (distance <= 20) {
            System.out.printf("Доставка в пределах 20 км - потребуется %d день\n", deliveryTime);
            return;
        }
        deliveryTime++;
        if (distance <= 60) {
            System.out.printf("Доставка в пределах от 20 до 60 км - потребуется %d дня: \n", deliveryTime);
            return;
        }
        deliveryTime++;
        if (distance <= 100) {
            System.out.printf("Доставка в пределах от 60 до 100 км - потребуется %d дня: \n", deliveryTime);
            return;
        } else {
            System.out.println("За МКАДом терминалов не бывает!");
        }


    }


    private static void systemSelection(int type, int yearOfRelease) {
        int currentYear = LocalDate.now().getYear();
        if (yearOfRelease > currentYear) {
            System.out.println(yearOfRelease + " - Вы из будущего???");
            return;
        }
        if (type > 1 || type < 0) {
            System.out.println(type + "- Ну Вы серьезно???");
            return;
        }
        if (type == 0) {
            if (yearOfRelease == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (yearOfRelease == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static void leapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else if (year % 400 == 0 & year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
}