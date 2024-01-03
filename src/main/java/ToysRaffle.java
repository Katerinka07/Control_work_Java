import java.util.LinkedList;
import java.util.Random;

public class ToysRaffle {
    private static Random random = new Random();
    public static LinkedList<Toy> getToys(int count) {
        LinkedList<Toy> toys = new LinkedList<>();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        while (toys.size() < count) {
            int chance = random.nextInt(4);
            if (chance == 0 && counter1 < count * 0.2) {
                toys.add(ToyFactory.generateConstructor());
                counter1++;
            } else if (chance == 1 && counter2 < count * 0.2) {
                toys.add(ToyFactory.generateRobot());
                counter2++;
            } else if (chance == 2 && counter3 < count * 0.6) {
                toys.add(ToyFactory.generateDoll());
                counter3++;
            }
        }
        return toys;
    }
    public static LinkedList<Toy> addToys(LinkedList<Toy> toys, int count) {
        toys.addAll(getToys(count));
        return toys;
    }
    public static void putToys(LinkedList<Toy> toys) {
        if (toys.isEmpty())
            throw new RuntimeException("Игрушки закончились!");
        System.out.println("Вы выиграли: " + toys.getFirst());
        toys.removeFirst();
    }
    public static void main(String[] args) {
        LinkedList<Toy> toys = getToys(10);
        System.out.println(toys);
        System.out.println("Было игрушек: " + toys.size());
        SaveFile.fileWrite(toys);
        System.out.println("-".repeat(20));
        System.out.println(addToys(toys, 2));
        System.out.println("Стало игрушек: " + toys.size());
        System.out.println("-".repeat(20));
        putToys(toys);
        System.out.println("-".repeat(20));
        System.out.println(toys);
        System.out.println("Стало игрушек: " + toys.size());

    }


}
