import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        curstomArray myArray = new curstomArray(1);
        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(40);
        myArray.add(50);
        myArray.add(60);
        System.out.println("Reversed array: " + Arrays.toString(myArray.reverse()));
    }
}
