import Observer.Variant1;
import Observer.Variant2;
/**
 * Created by darkkemper on 26.10.16.
 */

/**
 * Example of realisation design pattern "Observer"
 */
public class Main
{
    public static void main(String[] args)
    {
        /**
         * First without implementing interface test
         */
        new Variant1(20);

        /**
         * Second with implementing
         */
        new Variant2(20);
    }
}