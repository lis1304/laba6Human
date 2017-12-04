package lab6;

import java.util.Comparator;


public class SortedByHumanFullName implements Comparator<Human> {

    public int compare(Human human1, Human human2)
    {
        String human1FullName = human1.getFullName().getFullName();
        String human2FullName = human2.getFullName().getFullName();


        return human1FullName.compareTo(human2FullName);
    }
}
