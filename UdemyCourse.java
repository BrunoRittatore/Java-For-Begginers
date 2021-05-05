import java.util.ArrayList;

public class UdemyCourse {
    public static void main(String[] args){
        ArrayList <String> fruits = new ArrayList <>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("melon");

        int Listsize = fruits.size();
        fruits.set(1,"green banana");
        String place = fruits.get (1);
        // puedo modificar dentro de uno de los elementos del arraylist


        System.out.println(place);
        fruits.clear();
        System.out.println(fruits);




    }





}
