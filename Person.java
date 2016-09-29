package Storm;

public class Person {
    private static int number = 0;
    private int personId;
    private String fullName;
    private int yearOfBirth;

    private Person(int personId, String fullName, int yearOfBirth) {
        this.fullName = fullName;
        this.personId = personId;
        this.yearOfBirth = yearOfBirth;
    }

    static public Person createPerson(String fullName, int yearOfBirth) {
        return new Person(number++, fullName, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", fullName='" + fullName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    //Геттеры и сеттеры
    public int getPersonId() {
        return personId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

}
