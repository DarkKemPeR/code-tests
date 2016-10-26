package Observer;

/**
 * Created by darkkemper on 26.10.16.
 */

/**
 * Interface definition for a callback to be invoked when a init was done.
 */
public interface Observer
{
    /**
     *
     * @param z result value for a callback
     */
    void onDone(int z);
}