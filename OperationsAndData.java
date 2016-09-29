package Storm;

import test.Search;
import test.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OperationsAndData implements Search, Sort {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<Person> allPersons = new ArrayList<>();
    ArrayList<Device> allDevices = new ArrayList<>();
    ArrayList<Sale> allSale = new ArrayList<>();

    public void CreatePerson() throws IOException {
        System.out.println("ввиде ФИО и год рождения");
        allPersons.add(Person.createPerson(reader.readLine(), Integer.parseInt(reader.readLine())));
        System.out.println("Запись сохранена");
    }

    public void CreateDevice() throws IOException {
        System.out.println("ввиде название бренда, тип устройства, цвет и дату резиза");
        allDevices.add(Device.createDevice(reader.readLine(), reader.readLine(),reader.readLine(), new Date(
                Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine())
        )));
        System.out.println("Запись сохранена");

    }

    public void CreateSale() throws IOException {
        System.out.println("ввиде дату продажи");
        System.out.println("ввиде ФИО и год рождения");
        System.out.println("ввиде название бренда, тип устройства, цвет и дату резиза");
        allSale.add(Sale.createDevice(new Date(
                Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine())),
                Person.createPerson(reader.readLine(), Integer.parseInt(reader.readLine())),
                Device.createDevice(reader.readLine(), reader.readLine(),reader.readLine(), new Date(
                Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine())
                ))));
    }

    @Override
    public void FullNameSearch(String fullName) {
        for (Person p : allPersons){
            if (p.getFullName().toLowerCase().equals(fullName.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    @Override
    public void FullNameSearchSale(String fullName) {
        for (Sale s : allSale){
            if (s.getPerson().getFullName().toLowerCase().equals(fullName.toLowerCase())){
                System.out.println(s);
            }
        }
    }

    @Override
    public void BrandSerch(String brand) {
        for (Device d : allDevices) {
            if (d.getBrand().toLowerCase().equals(brand)){
                System.out.println(d);
            }
        }
    }

    @Override
    public void DeviceTypeSearch(String deviceType) {
        for (Device d : allDevices) {
            if (d.getDeviceType().toLowerCase().equals(deviceType)){
                System.out.println(d);
            }
        }
    }

    @Override
    public void ReleaseYearSearch(int year) {
        for (Device d : allDevices) {
            if (d.getReleaseDate().getYear() == year){
                System.out.println(d);
            }
        }
    }

    @Override
    public void YearOfSaleSearch(int year) {
        for (Sale s : allSale) {
            if (s.getDateOfSale().getYear() == year){
                System.out.println(s);
            }
        }
    }

    @Override
    public void PersonIdSearch(int id) {
        for (Person p : allPersons){
            if (p.getPersonId() == id){
                System.out.println(p);
            }
        }
    }

    @Override
    public void DeviceIdSearch(int id) {
        for (Device d : allDevices){
            if (d.getDeviceId() == id){
                System.out.println(d);
            }
        }
    }

    @Override
    public void PersonSort(String param) {
        switch (param) {
            case "fullName": {
                Collections.sort(allPersons, new Comparator<Person>() {
                    public int compare(Person o1, Person o2) {
                        return o1.getFullName().compareTo(o2.getFullName());
                    }
                });
                break;
            }
            case "yearOfBirth": {
                Collections.sort(allPersons, new Comparator<Person>() {
                    public int compare(Person o1, Person o2) {
                        return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
                    }
                });
                break;
            }
            case "personId": {
                Collections.sort(allPersons, new Comparator<Person>() {
                    public int compare(Person o1, Person o2) {
                        return Integer.compare(o1.getPersonId(), o2.getPersonId());
                    }
                });
                break;
            }
        }
        for (Person p : allPersons) {
            System.out.println(p);
        }
    }
    @Override
    public void DeviceSort() {

    }

    @Override
    public void SaleSort() {

    }
}
