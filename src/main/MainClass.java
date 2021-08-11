package main;

public class MainClass {
    public static void main(String[] args) {

        // Задача 1.
        System.out.println("Задача 1.");

        double cmInInch = 2.4;
        double amountInInch = 25;
        double amountInCm = cmInInch * amountInInch;
        System.out.println("25 дюймов - это " + amountInCm + " см");

        double amountInCm2 = 10;
        double amountInInch2 = amountInCm2 / cmInInch;
        System.out.printf("10 см - это %.2f  дюймов %n", amountInInch2);

        // Задача 2.
        System.out.println("Задача 2.");

        double earningsVasya = 5000;
        double parentsMoney = 5000;
        double euroRate = 28;
        System.out.printf("У Васи на отпуск есть %.2f евро. %n", (earningsVasya + parentsMoney) / euroRate);

        // Задача 3.
        System.out.println("Задача 3.");

        int number1 = 27;
        System.out.println(number1 % 10 + " " + number1 / 10);

        // Задача 4.
        System.out.println("Задача 4.");

        int number2 = 63;
        System.out.println(number2 / 10 * 10 + "+" + number2 % 10);

        // Задача 5.
        System.out.println("Задача 5.");
        int number3 = 74;
        System.out.println(number3 / 10 + number3 % 10);

        // Задача 6*.
        System.out.println("Задача 6*.");
        int number4 = 38;
        int even1stNumber = number4 / 10 % 2;
        int even2ndNumber = number4 % 2;

        if (even1stNumber == 0 && even2ndNumber == 0) {
            System.out.println("«Cтепень четности» числа: 2");
        } else if (even1stNumber == 1 && even2ndNumber == 1)
        {
            System.out.println("«Cтепень четности» числа: 0");
        }else{
            System.out.println("«Cтепень четности» числа: 1");
        }

        // Задача 7.
        System.out.println("Задача 7.");

        double number5 = -587452.33;
        if (number5 > 0) {
            System.out.println("Положительное");
        } else if (number5 < 0)
        {
            System.out.println("Отрицательное");
        }else{
            System.out.println("Ноль");
        }

        // Задача 8.
        System.out.println("Задача 8.");
        int number6 = 452;
        if (number6 >= 100) {
            System.out.println(--number6);
                }else{
            System.out.println("Число не трехзначное или не положительное");
        }

        // Задача 9.
        System.out.println("Задача 9.");
        int number7 = 57;
        int firstNumber = number1 / 10;
        int secondNumber = number7 % 10;
        int multiplication =  firstNumber*secondNumber;
        if (number7 > multiplication) {
            System.out.println("Число больше произведения его цифр");
        } else {
            System.out.println("Произведение цифр больше числа");
        }

        // Задача Волки/Овцы.

        System.out.println("Задача Волки/Овцы");

        int X = 3;
        int Y = 8;
        if (X>=4 && X<=8 && Y>=4 && Y<=7) {
            System.out.println("Это овца");
        } else if (X<2 || X>10 || Y<2 || Y>9 )
        {
            System.out.println("Кто-то не из леса и не из загона");
        }else{
            System.out.println("Это волк");
        }

    }

}
