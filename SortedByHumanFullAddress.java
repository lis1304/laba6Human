package lab6;

import java.util.Comparator;


public class SortedByHumanFullAddress implements Comparator<Human>{

    public int compare(Human human1, Human human2)
    {
        String human1FullAddr = human1.getAddress().getFullAddress();
        String human2FullAddr = human2.getAddress().getFullAddress();


        return human1FullAddr.compareTo(human2FullAddr);
    }

}
