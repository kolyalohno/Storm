package Storm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        OperationsAndData operationsAndData = new OperationsAndData();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            System.out.println("1 - создать новую запись");
            System.out.println("2 - поиск");
            System.out.println("3 - сортировка");
            System.out.println("Введите команду:");
            s = reader.readLine();
            if((s).equals("end")) {
                break;
            }
            int comand = Integer.parseInt(s);
            switch (comand) {
                case 1:{
                    System.out.println("1 - клиент");
                    System.out.println("2 - девайс");
                    System.out.println("3 - покупка");
                    System.out.println("Введите команду:");
                    switch (comand = Integer.parseInt(reader.readLine())) {
                        case 1:{
                            operationsAndData.CreatePerson();
                            break;
                        }
                        case 2: {
                            operationsAndData.CreateDevice();
                            break;
                        }
                        case 3: {
                            operationsAndData.CreateSale();
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("По чему оствляется поиск?");
                    System.out.println("1 - фио");
                    System.out.println("2 - марка девайс");
                    System.out.println("3 - тип устройства");
                    System.out.println("4 - год выпуска");
                    System.out.println("5 - год продажи товара");
                    System.out.println("6 - id клиента");
                    System.out.println("7 - id устройства");
                    System.out.println("Введите команду:");
                    switch (comand = Integer.parseInt(reader.readLine())) {
                        case 1: {
                            System.out.println("По какому справочнику осуществляется поиск?");
                            System.out.println("1 - клиентов");
                            System.out.println("2 - история покупок");
                            System.out.println("Введите команду:");
                            switch (comand = Integer.parseInt(reader.readLine())) {
                                case 1: {
                                    System.out.println("Введите фио");
                                    operationsAndData.FullNameSearch(reader.readLine());
                                    break;
                                }
                                case 2: {
                                    System.out.println("Введите фио");
                                    operationsAndData.FullNameSearchSale(reader.readLine());
                                    break;
                                }
                            }
                        }
                        case 2: {
                            System.out.println("По какому справочнику осуществляется поиск?");
                            System.out.println("1 - девайсы");
                            System.out.println("2 - история покупок");
                            System.out.println("Введите команду:");
                            switch (comand = Integer.parseInt(reader.readLine())) {
                                case 1: {
                                    System.out.println("Введите марку");
                                    operationsAndData.BrandSerch(reader.readLine());
                                    break;
                                }
                                case 2: {
                                    System.out.println("Введите марку");
                                    operationsAndData.FullNameSearchSale(reader.readLine());
                                    break;
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}
