package lab6;


import java.util.Comparator;

public class SortedByHumanAge implements Comparator<Human> {

    public int compare(Human human1, Human human2)
    {
        int human1Age = human1.getAge();
        int human2Age = human2.getAge();

        if (human1Age > human2Age) {
            return 1;
        } else if (human1Age < human2Age) {
            return -1;
        } else {
            return 0;
        }
    }
}
