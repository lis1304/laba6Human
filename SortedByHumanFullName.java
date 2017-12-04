package lab6;

import java.util.Comparator;


public class SortedByHumanFullName implements Comparator<Human> {

    public int compare(Human human1, Human human2)
    {
        return human1.getFullName().getFullName().compareTo(human2.getFullName().getFullName());
    }
}
