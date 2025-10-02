package JavaCollectors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LearnStream {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("Sharan");
        name.add("Paddu");
        name.add("Mathi");
        name.add("Vethi");
        name.add("Sharan");

        System.out.println(name);

         Set<String> set =name.stream().collect(Collectors.toSet());
         System.out.println(set);


    }

}
