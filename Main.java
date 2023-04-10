import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Toy> toys = ToyFactory.createToys(15);// в магазине 15 игрушек
        BoxToys toyInBox = new BoxToys(toys);
        Toy addToy = new Toy(55, "Barby", 1); //добавили новую игрушку
        toyInBox.addToys(addToy);
        ToyFactory.PrintToyBox(toys);
        LinkedList<Toy> prizeQueue = new LinkedList<>();
        int d = 7; //кол-во игроков
        while (prizeQueue.size() < 7){
            Toy toyWin = toyInBox.getRandomToy();

            if (toyWin.getFrequencyLevel() != 0) {
                prizeQueue.add(toyWin);
            }
        }
        while (prizeQueue.size() != 0) {

                Toy takePrize = prizeQueue.removeFirst();
                WriterFile.Writer(takePrize);
            }

        }

    }