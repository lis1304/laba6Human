package lab6;

import java.util.Comparator;


public class SortedByHumanFullAddress implements Comparator<Human>{

    public int compare(Human human1, Human human2)
    {
        return human1.getAddress().getFullAddress().compareTo(human2.getAddress().getFullAddress());

    }

}
