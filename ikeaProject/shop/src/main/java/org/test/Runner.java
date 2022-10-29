package org.test;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            String input = console.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            if (input.equalsIgnoreCase("count")) {
                System.out.println(shop.countItems());
                continue;
            }
            if (input.equalsIgnoreCase("add")) {
                String inputItems = console.nextLine();
                String[] split = inputItems.split(",");
                if (split.length != 3) {
                    System.out.println("введено менее 3 параметров");
                    continue;
                }
                String name = split[0];
                int count = Integer.parseInt(split[1]);
                double weight = Double.parseDouble(split[2]);
                shop.add(name, count, weight);
                continue;
            }
        }
    }
}
