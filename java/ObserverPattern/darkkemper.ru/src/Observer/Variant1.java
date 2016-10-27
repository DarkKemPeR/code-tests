package Observer;

/**
 * Created by darkkemper on 26.10.16.
 */

/**
 * First variant of realisation design pattern "Observer"
 */
public class Variant1
{
    /**
     * @param iterations Iterations count for finding fibonacci number
     */
    public Variant1(int iterations)
    {
        Process process = new Process();

        process.registerObserver(new Observer()
        {
            @Override
            public void onDone(int z)
            {
                System.out.print("Result: " + z);
            }
        });

        process.init(iterations);
    }
}
