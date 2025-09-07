package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (!isBarking) return false;
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        return hourOfDay < 8 || hourOfDay > 22;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upper = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upper;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1.0;
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) return -1.0;
        return Math.PI * radius * radius;
    }


    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reversed = 0, temp = original;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }
        return original == reversed;
    }


    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }


    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        if (number == 0) return "Zero";

        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(number);

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '0': sb.append("Zero"); break;
                case '1': sb.append("One"); break;
                case '2': sb.append("Two"); break;
                case '3': sb.append("Three"); break;
                case '4': sb.append("Four"); break;
                case '5': sb.append("Five"); break;
                case '6': sb.append("Six"); break;
                case '7': sb.append("Seven"); break;
                case '8': sb.append("Eight"); break;
                case '9': sb.append("Nine"); break;
            }
            if (i < s.length() - 1) sb.append(" ");
        }
        return sb.toString();
    }
}