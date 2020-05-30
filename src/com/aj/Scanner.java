package com.aj;

import java.util.Scanner;

    class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter character: ");
        char c = scanner.next().charAt(0);
        System.out.println("value: " + c);
    }
}
