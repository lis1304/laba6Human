package lab6;

/**
 * Created by LIS on 27.11.2017.
 */
public class SmartPhone implements Phone {
    @Override
    public void call(int number) {
        System.out.println("Звоним на номер " + number + " по смартфону");
    }
}
