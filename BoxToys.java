import java.util.ArrayList;
import java.util.Random;

public class BoxToys {
    protected ArrayList<Toy> toys;

    public BoxToys(ArrayList<Toy> toys) {
        this.toys = toys;
    }


    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void setToys(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public void addToys(Toy toy) {

        toys.add(toy);

    }

    public Toy getRandomToy() {
        Random rnd = new Random();
        int numberPlay = 7; //задать в консоли потом
        int randomIndex = rnd.nextInt(toys.size());

        for (int i = 0; i < numberPlay; i++) {
            Toy toy = toys.get(i);
            int freq = toy.getFrequencyLevel();

            if (i == randomIndex && freq!=0) {

                System.out.println((Toy) toys.get(i));
                for (int j = 0; j < toys.size(); j++) {
                    if (toys.get(j).getToyName().equals(toys.get(i).getToyName())) {
                        toys.get(j).chanceFrequency();
                    }
                }
                return (Toy) toys.remove(i);
                //добавить в текст файл
            }
        }
        Toy nullToy = new Toy(0, "null", 0);
        return nullToy;
    }

    public String toString() {
        String str = " ";
        for (Toy s : toys) {
            str = str + s.toString() + " \n";

        }
        return str;

    }
}