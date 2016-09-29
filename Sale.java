package Storm;

import java.util.Date;

public class Sale {
    private static int number = 0;
    private int salenId;
    private Date dateOfSale;
    private Person person;
    private Device device;

    private Sale(int salenId, Date dateOfSale, Person person, Device device) {
        this.salenId = salenId;
        this.dateOfSale = dateOfSale;
        this.person = person;
        this.device = device;
    }

    @Override
    public String toString() {
        return "История покупок{" +
                "salenId=" + salenId +
                ", dateOfSale=" + dateOfSale +
                ", person=" + person +
                ", device=" + device +
                '}';
    }

    static public Sale createDevice (Date dateOfSale, Person person, Device device) {
        return new Sale(number++, dateOfSale, person, device);

    }

    public Date getDateOfSale() {
        return dateOfSale;
    }
    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Device getDevice() {
        return device;
    }
    public void setDevice(Device device) {
        this.device = device;
    }
}
