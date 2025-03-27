package com.bridgelabz.mealPlanGenerator;

//Interface for all meal types
public interface MealPlan {
    void displayMeal();
}


//Meal types

//Vegetarian Meal
class VegetarianMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: Grilled tofu with steamed vegetables.");
    }
}

//Vegan Meal
class VeganMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: Quinoa salad with chickpeas, beans and avocado.");
    }
}

//High Protein Meal
class HighProteinMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("High-Protein Meal: Chicken breast with quinoa and spinach.");
    }
}



