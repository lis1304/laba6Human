package lab6;

/**
 * Created by LIS on 27.11.2017.
 */
public class Address {

    private String country;
    private String town;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String town, String street, int house, int flat) {
        this.country = country;
        this.town = town;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return
                "Страна:'" + country + '\'' +
                " Город:'" + town + '\'' +
                " Улица:'" + street + '\'' +
                " Дом №:" + house +
                " Квартира №:" + flat;

    }
}
