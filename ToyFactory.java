import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class ToyFactory {
    public static void main(String[] args) {
        ArrayList<Toy> toyInBox = new ArrayList<Toy>();

    }

    public static ArrayList<Toy> createToys (int toyCount){
        ArrayList<Toy> toyInBox = new ArrayList<Toy>(toyCount);
        ArrayList<String> typeToys = new ArrayList<>(Arrays.asList("Bear", "Cat", "Dog", "Barby", "Fox"));

        Random rnd = new Random();

        for(int i = 0; i < toyCount; i++){
            String typeToy = typeToys.get(rnd.nextInt(5));
            int fr = 0;
            switch (typeToy){
                case "Bear":
                    fr = 3;
                case "Cat", "Dog", "Fox":
                     fr = 6;
                case "Barby":
                     fr = 1;
            }
            Toy toy = new Toy(i, typeToy, fr);
            toyInBox.add(toy);

        }
        return toyInBox;
    }
    public static void PrintToyBox(ArrayList<Toy> toyInBox) {
        for (Toy toy : toyInBox)
            System.out.println(toy.toString() + "\n");
    }
}
