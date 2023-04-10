import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Toy> toys = ToyFactory.createToys(32);
        BoxToys toyInBox = new BoxToys(toys);
        ToyFactory.PrintToyBox(toys);
        LinkedList<Toy> prizeQueue = new LinkedList<>();
        int d = 7; //кол-во игроков
        while (prizeQueue.size()<7){
            Toy toyWin = toyInBox.getRandomToy();
            if (toyWin.getFrequencyLevel() != 0) {
                prizeQueue.add(toyWin);
            }
        }
        if (prizeQueue.size() != 0) {
            for (int i = 0; i < prizeQueue.size(); i++) {
                Toy takePrize = prizeQueue.removeFirst();
                System.out.println(takePrize);
                try (FileWriter writer = new FileWriter("Prizes.txt", true)) {
                    // запись всей строки
                    String text = takePrize.toString();
                    writer.write(text);
                    // запись по символам
                    writer.append('\n');

                    writer.flush();
                } catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
            }
        }
        else{
                System.out.println("Призы закончились !!!");
            }


        }

    }







