package Telephony;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] phones = scanner.nextLine().split("\\s+");
        String [] urls = scanner.nextLine().split("\\s+");

        List<String> telephoneList = new ArrayList<>();
        Collections.addAll(telephoneList, phones);

        List<String> urlList = new ArrayList<>();
        Collections.addAll(urlList, urls);
        Smartphone smartphone = new Smartphone(telephoneList, urlList);

        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());
    }
}
