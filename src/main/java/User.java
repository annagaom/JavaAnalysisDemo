/**
 * User class with proper initialization.
 */
@SuppressWarnings("checkstyle:Indentation")
public class User {

    private String name;

    /**
     * Constructor for User.
     *
     * @param name the name of the user
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the user.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}
