//SOAL NO 3

import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 10000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 20000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 30000;

    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String foodName) {
        switch (foodName.toLowerCase()) {
            case "burger":
                return new Burger();
            case "pizza":
                return new Pizza();
            case "steak":
                return new Steak();
            default:
                throw new IllegalArgumentException("Invalid food name: " + foodName);
        }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        for (Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);
        System.out.println("Total price: " + total);
    }
}

