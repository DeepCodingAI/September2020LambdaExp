package stream.example;

import java.util.Arrays;
import java.util.List;

public class UseStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango","Banana","Barries","Lichi");

        System.out.println("Iterating using for each loop");
        for(String fruit:list){
            if(fruit.startsWith("B")) {
                System.out.println(fruit);
            }
        }
        System.out.println("Iterating using Stream ");
        list.stream()
            .filter((fruit -> fruit.startsWith("B")))
            .forEach(fruit -> System.out.println(fruit));
    }
}
