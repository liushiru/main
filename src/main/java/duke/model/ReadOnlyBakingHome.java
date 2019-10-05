package duke.model;

import duke.model.recipe.Recipe;
import javafx.collections.ObservableList;


/**
 * Unmodifiable view of an address book.
 */
public interface ReadOnlyBakingHome {

    /**
     * Returns an unmodifiable view of the order list.
     */
    ObservableList<Order> getOrderList();
    ObservableList<Recipe> getRecipeList();

}
