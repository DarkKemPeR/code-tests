package Observer;

/**
 * Created by darkkemper on 26.10.16.
 */

/**
 * Second variant of realisation design pattern "Observer"
 */
public class Variant2 implements Observer
{
    /**
     * @param iterations Iterations count for finding fibonacci number
     */
    public Variant2(int iterations)
    {
        Process process = new Process();
        process.registerObserver(this);
        process.init(iterations);
    }

    @Override
    public void onDone(int z)
    {
        System.out.print("Result: " + z);
    }
}
