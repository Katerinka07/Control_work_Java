import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class SaveFile {
    private final Toy toy;

    public SaveFile(Toy toy) {
        this.toy = toy;
    }

    public static void fileWrite(LinkedList<Toy> toys){
        String fileName = "D:/Учеба/Control_Work_JAVA/src/main/java/raffle.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
                for (Toy toy: toys) {;
                    writer.write("Игрушка: " + toy.getName() + "; ");
                    writer.write("ID: " + toy.getId() + "; ");
                    writer.write("Вероятность выпадения: " + toy.getWeight() + "%\n");
                }
            writer.close();
            } catch (IOException e) {
                System.out.println("Произошла ошибка записи в файл");
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
    }

}
