package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
        int firstFriday = 1;
        for (int reportingFriday = firstFriday; reportingFriday <= 31; reportingFriday = reportingFriday + 7) {
            System.out.println("Сегодня пятница, " + reportingFriday + "-е число. Необходимо подготовить отчет.");
        }
        int currentYear = 2021;
        int past = currentYear - 200;
        int future = currentYear + 100;
        for (int y = past; y < future; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }
    }
}