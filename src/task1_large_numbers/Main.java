package task1_large_numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n\nВведите длинну ключа (в битах)");
                Scanner scanner = new Scanner(System.in);
                Key key = new Key(Integer.parseInt(scanner.nextLine()));
                System.out.println("Длинна ключа:" + key.bitLength);
                System.out.println("Пространство ключей:" + key.getRange());
                System.out.println("Рандомное значение:" + key.value);
                System.out.println("Время на нахождение ключа: " + key.getBruteforceTime() + " мс");
            } catch (Exception e) {
                System.out.println("Было введено неверное значение");
            }
        }
    }
}

