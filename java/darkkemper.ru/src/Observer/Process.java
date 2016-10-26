package Observer;

/**
 * Created by darkkemper on 26.10.16.
 */

/**
 *
 */
public class Process
{
    private Observer observer;

    public void registerObserver(Observer observer)
    {
        this.observer = observer;
    }

    /**
     *
     * @param iCount Iterations count for finding fibonacci number
     */
    public void init(int iCount)
    {
        /**
         * Counting
         */
        int k = 0;

        int[] z = new int[iCount];

        for (int i = 0; i < iCount - 1; i++)
        {
            if (i == 0 || i == 1)
            {
                z[i] = k = i;
            }
            else
            {
                z[i] = k = z[i - 2] + z[i - 1];
            }

            System.out.print(k + "\n");
        }

        /**
         * Invoke a callback function when it's done
         */
        observer.onDone(k);
    }
}
