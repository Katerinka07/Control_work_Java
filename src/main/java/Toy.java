public class Toy {
    private int id;
    private String name;
    private int weight;
    private String countryOrigin;
    private static int count = 0;

    public Toy() {
        id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    @Override
    public String toString() {
        return String.format("Игрушка: %s; ID: %d; Страна производства: %s; Вероятность выпадения: %d%%\n", name, id, countryOrigin, weight);
    }
}


