public class ToyBuilder {
    private Toy toy;

    public ToyBuilder() {
        toy = new Toy();
    }
    public Toy build() {
        if (toy.getName() == null || toy.getName().isEmpty())
            throw new RuntimeException("Некорректное название игрушки!");
        if (toy.getId() < 1)
            throw new RuntimeException("Некорректный id!");
        return toy;
    }
    public ToyBuilder setName(String name) {
        toy.setName(name);
        return this;
    }
    public ToyBuilder setWeight(int weight) {
        toy.setWeight(weight);
        return this;
    }
    public ToyBuilder setCountryOrigin(String countryOrigin) {
        toy.setCountryOrigin(countryOrigin);
        return this;
    }

}



