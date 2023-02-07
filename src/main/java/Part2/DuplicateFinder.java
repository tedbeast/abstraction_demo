package Part2;

/**
 * This interface defines behavior for an object that should be capable of adding items and checking for duplicate
 * items.
 *
 * A class may implement this interface by adding "implements DuplicateFinder" to the class defintition.
 */
public interface DuplicateFinder {
    /**
     * Add a number to the currently considered numbers for checking duplicates.
     * @param num an int.
     */
    void addItem(int num);

    /**
     * Check if a number is already within the currently considered number.
     * @param num an int.
     * @return true if num is a duplicate number, and false otherwise.
     */
    boolean isDuplicate(int num);

}