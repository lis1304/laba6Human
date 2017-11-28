package lab6;

/**
 * Created by LIS on 27.11.2017.
 */
public class Human implements Cloneable,Comparable<Human>{
    private FullName fullName;
    private int age;
    private Address address;
    private Gender gender;
    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Human(FullName fio, int age, Address address, Gender gender) {
        this.fullName = fio;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Human o) {
        return age - o.age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Фамилия=" + fullName.getLastName() + " Имя=" + fullName.getFirstName() + " Отчество=" + fullName.getPatronymic() +
                ", возраст=" + age + " лет" +
                ", адрес=" + address.getCountry() +", "+ address.getTown() +", "+ address.getStreet() + ", " +
                               address.getFlat()+ ", " + address.getHouse() +
                '}';
    }
}
