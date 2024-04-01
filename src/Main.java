import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение");
        String input = sc.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws IOException {
        String resultString;
        String[] arrStr = input.split(" ");
        if (arrStr.length != 3) {
            throw new IOException("Введите выражение в формате a + b");
        }
        String znak = arrStr[1];
        String firstStringNumber = arrStr[0];
        String secondStringNumber = arrStr[2];
        if (!isValidZnak(znak)) {
            throw new IOException("Некорректный знак вычисления");
        }
        if (isValidArabic(firstStringNumber, secondStringNumber)) {
            int result = calculate(znak, Integer.parseInt(firstStringNumber), Integer.parseInt(secondStringNumber));
            resultString = Integer.toString(result);
            return resultString;
        } else if (isValidRoman(firstStringNumber, secondStringNumber)) {
            int result = calculate(znak, convertToArab(firstStringNumber), convertToArab(secondStringNumber));
            if (result > 0) {
                resultString = (convertToRoman(result));
                return resultString;
            } else throw new IOException("Римское число не может быть меньше единиицы");
        } else {
            throw new IOException("Некорректный ввод");

        }
    }


    public static boolean isValidZnak(String znak) {
        String[] arrZnak = new String[]{"+", "-", "/", "*"};
        for (String s : arrZnak) {
            if (znak.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidArabic(String a, String b) {
        try {
            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            return !(a1 < 1 || a1 > 10 || b1 < 1 || b1 > 10);
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean isValidRoman(String a, String b) {
        String[] arrRoman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean aValid = false, bValid = false;
        for (String r : arrRoman) {
            if (a.equals(r)) {
                aValid = true;
            }
            if (b.equals(r)) {
                bValid = true;
            }
        }
        return aValid && bValid;
    }


    private static int calculate(String operator, int x, int y) {
//
        int i = switch (operator) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;
        };

        return i;
    }

    public static int convertToArab(String rome1) {
        int r1 = switch (rome1) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> -1000;
        };
        return r1;
    }

    public static String convertToRoman(int z) {
        String roman1 = switch (z) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            case 11 -> "XI";
            case 12 -> "XII";
            case 13 -> "XIII";
            case 14 -> "XIV";
            case 15 -> "XV";
            case 16 -> "XVI";
            case 17 -> "XVII";
            case 18 -> "XVIII";
            case 19 -> "XIX";
            case 20 -> "XX";
            case 21 -> "XXI";
            case 22 -> "XXII";
            case 23 -> "XXIII";
            case 24 -> "XXIV";
            case 25 -> "XXV";
            case 26 -> "XXVI";
            case 27 -> "XXVII";
            case 28 -> "XXVIII";
            case 29 -> "XXIX";
            case 30 -> "XXX";
            case 31 -> "XXXI";
            case 32 -> "XXXII";
            case 33 -> "XXXIII";
            case 34 -> "XXXIV";
            case 35 -> "XXXV";
            case 36 -> "XXXVI";
            case 37 -> "XXXVII";
            case 38 -> "XXXVIII";
            case 39 -> "XXXIX";
            case 40 -> "XL";
            case 41 -> "XLI";
            case 42 -> "XLII";
            case 43 -> "XLIII";
            case 44 -> "XLIV";
            case 45 -> "XLV";
            case 46 -> "XLVI";
            case 47 -> "XLVII";
            case 48 -> "XLVIII";
            case 49 -> "XLIX";
            case 50 -> "L";
            case 51 -> "LI";
            case 52 -> "LII";
            case 53 -> "LIII";
            case 54 -> "LIV";
            case 55 -> "LV";
            case 56 -> "LVI";
            case 57 -> "LVII";
            case 58 -> "LVIII";
            case 59 -> "LIX";
            case 60 -> "LX";
            case 61 -> "LXI";
            case 62 -> "LXII";
            case 63 -> "LXIII";
            case 64 -> "LXIV";
            case 65 -> "LXV";
            case 66 -> "LXVI";
            case 67 -> "LXVII";
            case 68 -> "LXVIII";
            case 69 -> "LXIX";
            case 70 -> "LXX";
            case 71 -> "LXXI";
            case 72 -> "LXXII";
            case 73 -> "LXXIII";
            case 74 -> "LXXIV";
            case 75 -> "LXXV";
            case 76 -> "LXXVI";
            case 77 -> "LXXVII";
            case 78 -> "LXXVIII";
            case 79 -> "LXXIX";
            case 80 -> "LXXX";
            case 81 -> "LXXXI";
            case 82 -> "LXXXII";
            case 83 -> "LXXXIII";
            case 84 -> "LXXXIV";
            case 85 -> "LXXXV";
            case 86 -> "LXXXVI";
            case 87 -> "LXXXVII";
            case 88 -> "LXXXVIII";
            case 89 -> "LXXXIX";
            case 90 -> "XC";
            case 91 -> "XCI";
            case 92 -> "XCII";
            case 93 -> "XCIII";
            case 94 -> "XCIV";
            case 95 -> "XCV";
            case 96 -> "XCVI";
            case 97 -> "XCVII";
            case 98 -> "XCVIII";
            case 99 -> "XCIX";
            case 100 -> "C";
            default -> "0";
        };
        return roman1;
    }
}