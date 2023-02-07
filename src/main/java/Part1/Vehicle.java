package Part1;

/**
 * This interface defines the basic behavior that should be exhibited by any land, sea, or air-borne craft.
 * All implementing classes must provide implementations for stop() and go(). This should constitute of
 * System.out.println statements describing how the particular vehicle accomplishes this task.
 *
 * A class may implement this interface by adding "implements Vehicle" to the class definition.
 */
public interface Vehicle {

    void stop();

    void go();

}
