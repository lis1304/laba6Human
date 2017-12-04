package lab6;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human human1 = new Human(new FullName("Петр","Иванов","Сергеевич"),65,
                                    new Address("Россия","Тольятти","Победы",1,2),Gender.MALE);
        Human human2 = new Human(new FullName("Юрий","Петров","Васильевич"),25,
                                    new Address("Россия","Самара","Мира",10,50),Gender.MALE);
        Human human3 = new Human(new FullName("Ольга","Медведева","Петровна"),30,
                                    new Address("Россия","Казань","Комсомольская",20,103),Gender.FEMALE);
        Human human4 = new Human(new FullName("Елена","Васильева","Владимировна"),35,
                                    new Address("Россия","Москва","Советская",60,80),Gender.FEMALE);
        Human human5 = new Human(new FullName("Павел","Сурков","Дмитриевич"),50,
                                    new Address("Россия","Волгоград","Ленина",64,5),Gender.MALE);

        Human[] humans = new Human[] {human1,human2,human3,human4,human5};

        //клонирование
        Human human6 = (Human) human5.clone();
        Human human7 = (Human) human5.clone();

        //сортировка по возрасту
        sortHumanAge(humans);

        //сортировка по ФИО
        sortHumanFio(humans);

        //Сортировка по адресу
        sortHumanAddress(humans);


        //звоним
        human1.setPhone(new ButtonPhone());
        human1.getPhone().call("123456789");
        human2.setPhone(new SmartPhone());
        human2.getPhone().call("987654321");


    }

    public static void sortHumanAge(Human[] humans){

        System.out.println("~~~~~~~Отсортировано по возрасту~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(humans, new SortedByHumanAge());
        for (Human human : humans){
            System.out.println(human);
        }

    }

    public static void sortHumanFio(Human[] humans){

        System.out.println("~~~~~~~Отсортировано по ФИО~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(humans, new SortedByHumanFullName());
/*
        Arrays.sort(humans, new Comparator<Human>() {
            public int compare(Human human1, Human human2) {
                return  human1.toString().compareTo(human2.toString());
            }
        });
*/
        for (Human human : humans){
            System.out.println(human);
        }

    }

    public static void sortHumanAddress(Human[] humans){

        System.out.println("~~~~~~~~Отсортировано по адресу~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Arrays.sort(humans, (humanAddres1,humanAddres2) -> humanAddres1.getAddress().toString().compareTo(humanAddres2.getAddress().toString()));
        Arrays.sort(humans, new SortedByHumanFullAddress());
        for (Human human : humans){
            System.out.println(human);
        }

    }

}
