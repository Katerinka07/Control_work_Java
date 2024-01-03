import java.util.Random;

public class ToyFactory {
    private static Random random = new Random();
    public static Toy generateDoll() {
        String[] names = new String[] {"Кукла Маша", "Кукла Barbie", "Кукла Весна", "Кукла LOL",
                "Кукла Monster High", "Кукла Настенька", "Кукла Милана", "Кукла Пупсик",
                "Кукла Карина","Кукла Bratz"};
        String[] countryOrigin = new String[] {"Россия", "Китай", "Беларусь", "Турция"};
        int weight = random.nextInt(20, 100);
        return new ToyBuilder()
                .setName(names[random.nextInt(10)])
                .setCountryOrigin(countryOrigin[random.nextInt(4)])
                .setWeight(weight)
                .build();
    }
    public static Toy generateRobot() {
        String[] names = new String[] {"Собака-Робот", "Робот Федя", "Robot Transformer", "Robot Trains",
                "Robot Robotics X", "Robot RexBot", "Robot Freind", "Robot R3000", "Robot HRT-0010",
                "Robot Xtrem Bots"};
        String[] countryOrigin = new String[] {"Россия", "Китай", "Южная Корея", "Германия"};
        int weight = random.nextInt(20, 100);
        return new ToyBuilder()
                .setName(names[random.nextInt(10)])
                .setCountryOrigin(countryOrigin[random.nextInt(4)])
                .setWeight(weight)
                .build();
    }
    public static Toy generateConstructor() {
        String[] names = new String[] {"Lego", "Магнитный конструктор", "Конструктор Blocks",
                "Конструктор шестерёнки", "Контруктор вертолёт", "3D Конструктор", "Деревянный конструктор",
                "Металлический конструктор", "Конструктор электронный","Конструктор машинка"};
        String[] countryOrigin = new String[] {"Россия", "Китай", "Беларусь", "Чехия"};
        int weight = random.nextInt(1, 100);
        return new ToyBuilder()
                .setName(names[random.nextInt(10)])
                .setCountryOrigin(countryOrigin[random.nextInt(4)])
                .setWeight(weight)
                .build();
    }

}
