import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task2_5();
        task2_6();
        task2_7();
        task2_8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        //2 й вариант(полный)
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год високосный");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        // Пишем код для задачи 8
        int total = 0;
        int monthMoneySave = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + monthMoneySave;
            System.out.println("Месяц" + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        // Пишем код для задачи 9
        float total = 0;
        float monthMoneySave = 29000;
        float monthlyPercent = 0.01f;
        for (int i = 1; i <= 12; i++) {
            total = total + monthMoneySave + total * monthlyPercent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        // Пишем код для задачи 10
        int x = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }

    public static void task2_1() {
        System.out.println("Задача 2-1");
        // Пишем код для задачи 2-1
        int total = 0;
        int monthMoneySave = 15000;
        int month = 0;
        while (total < 2_459_000) {
            total = total + monthMoneySave;
            month++;

        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
    }

    public static void task2_2() {
        System.out.println("Задача 2-2");
        // Пишем код для задачи 2-2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");

        }


    }

    public static void task2_3() {
        System.out.println("Задача 2-3");
        // Пишем код для задачи 2-3
        float countryPopulation = 12_000_000;
        float deltaPopulation = 0;
        float birthRate = 0.017f;
        float mortalityRate = 0.008f;
        int period = 0;
        while (period < 10) {
            deltaPopulation = deltaPopulation + (birthRate - mortalityRate) * countryPopulation;
            period++;
        }
        countryPopulation = countryPopulation + deltaPopulation;
        System.out.println("Год " + period + "," + " численность населения составляет " + countryPopulation);

    }

    public static void task2_4() {
        System.out.println("Задача 2-4");
        // Пишем код для задачи 2-4
        float bankDepositSum = 15000;
        float percentDepositMonth = 0.07f;
        float sumDepositTotal = 0;

        int month = 0;
        while (sumDepositTotal <= 12_000_000) {

            sumDepositTotal = sumDepositTotal + bankDepositSum + sumDepositTotal * percentDepositMonth;
            month++;
            System.out.println("Месяц " + month + " сумма накопления : " + sumDepositTotal);
        }

    }

    public static void task2_5() {
        System.out.println("Задача 2-5");
        // Пишем код для задачи 2-5
        float bankDepositSum = 15000;
        float percentDepositMonth = 0.07f;
        float sumDepositTotal = 0;

        int month = 0;
        while (sumDepositTotal <= 12_000_000) {

            sumDepositTotal = sumDepositTotal + bankDepositSum + sumDepositTotal * percentDepositMonth;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накопления : " + sumDepositTotal);
            }

        }

    }

    public static void task2_6() {
        System.out.println("Задача 2-6");
        // Пишем код для задачи 2-6
        float bankDepositSum = 15000;
        float percentDepositMonth = 0.07f;
        float sumDepositTotal = 0;

        int month = 0;
        while (month <= 108) {

            sumDepositTotal = sumDepositTotal + bankDepositSum + sumDepositTotal * percentDepositMonth;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накопления : " + sumDepositTotal);
            }

        }

    }

    public static void task2_7() {
        System.out.println("Задача 2-7");
        // Пишем код для задачи 2-7
        int friday = 1;
        int month = 31;
        int monthDay = 1;
        while (monthDay <= month) {

            if (monthDay == friday) {
                friday = friday + 7;
                System.out.println("Сегодня пятница, " + monthDay + "-е число. Необходимо подготовить отчет");
            }
            monthDay++;
        }
    }

    public static void task2_8() {
        System.out.println("Задача 2-8");
        // Пишем код для задачи 2-8
        int periodComet=79;
        int yearVisibleComet=0;
            while (yearVisibleComet<=2123){
                yearVisibleComet++;
                if(yearVisibleComet%periodComet==0){
                    if(yearVisibleComet>=1823 && yearVisibleComet<=2123)
                    System.out.println(yearVisibleComet+" год прилета кометы");
                }

            }

    }

}