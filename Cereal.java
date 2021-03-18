import java.util.ArrayList;

public class Cereal {
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private float fiber;
    private float carbohydrates;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private float weight;
    private float cups;
    private float rating;

    public Cereal(
            String name, String type, int calories, int protein, int fat, int sodium, float fiber,
            float carbohydrates, int sugar, int potassium, int vitamins, int shelf, float weight, float cups,
            float rating
    ) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }

    public static float averageCalories(ArrayList<Cereal> cereals) {
        float aveCalories = 0;
        int i = 1;
        for (Cereal cereal : cereals) {
            aveCalories += cereal.getCalories();
            i++;
            System.out.printf("Current Average: %.1f", (aveCalories / i));
        }

        return aveCalories / cereals.size();
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getProtein() {
        return this.protein;
    }

    public int getFat() {
        return this.fat;
    }

    public int getSodium() {
        return this.sodium;
    }

    public float getFiber() {
        return this.fiber;
    }

    public float getCarbohydrates() {
        return this.carbohydrates;
    }

    public int getSugar() {
        return this.sugar;
    }

    public int getPotassium() {
        return this.potassium;
    }

    public int getVitamins() {
        return this.vitamins;
    }

    public int getShelf() {
        return this.shelf;
    }

    public float getWeight() {
        return this.weight;
    }

    public float getCups() {
        return this.cups;
    }

    public float getRating() {
        return this.rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setFiber(float fiber) {
        this.fiber = fiber;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setPotassium(int potassium) {
        this.potassium = potassium;
    }

    public void setVitamins(int vitamins) {
        this.vitamins = vitamins;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setCups(float cups) {
        this.cups = cups;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
