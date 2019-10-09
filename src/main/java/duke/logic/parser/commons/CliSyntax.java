package duke.logic.parser.commons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands.
 */
public class CliSyntax {
    /* Command keywords */
    public static final Set<String> KEYWORDS = new HashSet<>(Arrays
            .asList("order", "add", "remove", "edit", "short"));

    /* Prefix definitions */
    public static final Prefix PREFIX_ORDER_ITEM = new Prefix("-item");
    public static final Prefix PREFIX_CUSTOMER_NAME = new Prefix("-name");
    public static final Prefix PREFIX_CUSTOMER_CONTACT = new Prefix("-contact");
    public static final Prefix PREFIX_ORDER_REMARKS = new Prefix("-rmk");
    public static final Prefix PREFIX_ORDER_DEADLINE = new Prefix("-by");
    public static final Prefix PREFIX_ORDER_STATUS = new Prefix("-status");
    public static final Prefix PREFIX_ORDER_INDEX = new Prefix("-i");

    public static final Prefix PREFIX_PRODUCT_NAME = new Prefix("-name");
    public static final Prefix PREFIX_PRODUCT_INGREDIENT = new Prefix("-ingt");
    public static final Prefix PREFIX_PRODUCT_COST = new Prefix("-cost");
    public static final Prefix PREFIX_PRODUCT_PRICE = new Prefix("-price");
    public static final Prefix PREFIX_PRODUCT_INDEX = new Prefix("-i");
    public static final Prefix PREFIX_PRODUCT_STATUS = new Prefix("-status");
}