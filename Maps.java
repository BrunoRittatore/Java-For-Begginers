import java.util.Map;
import java.util.HashMap;


public class Maps {
    public static void main (String[] args){
        Map cars = new HashMap ();
        cars.put("Bmw",3);// meto un objeto dentro del Hashmap con la Key bmw y value 3
        cars.put("Mercedes",5);
        cars.put("Honda",3);
        cars.remove( "Bmw");
        System.out.println(cars);

        int  size = cars.size();

        System.out.println(size);


    }
}
