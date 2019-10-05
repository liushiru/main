package duke.model.recipe;

import com.fasterxml.jackson.annotation.JsonProperty;
import duke.model.Ingredient;

import java.util.ArrayList;

public class Step {
    private String description;
    private int time; //in minutes

    public Step() {

    }

    public Step(@JsonProperty("description") String description) {
        this.description = description;
        time = parseTime(description);
    }

    public ArrayList<Ingredient> parseIngredient(String description) {
        //Assume able to return a list of integer.
        return new ArrayList<Ingredient>();
    }

    public int parseTime(String description) {
        return 1;
    }

    public Step init() {
        description = "add cream to cheese";
        time = 30;
        return this;
    }

    public String getDescription() {
        return description;
    }

//    public int getTime() {
//        return time;
//    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public void setTime(int time) {
//        this.time = time;
//    }
}