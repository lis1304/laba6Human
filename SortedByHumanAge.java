package lab6;


import java.util.Comparator;

public class SortedByHumanAge implements Comparator<Human> {

    public int compare(Human human1, Human human2)
    {
        if (human1.getAge() > human2.getAge()) {
            return 1;
        } else if (human1.getAge() < human2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
