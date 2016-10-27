import Observer.Variant1;
import Observer.Variant2;
/**
 * Created by darkkemper on 26.10.16.
 */
public class Main
{
    public static void main(String[] args)
    {
        /**
         * Example of realisation design pattern "Observer"
         * First without implementing interface
         */
        new Variant1(20);

        /**
         * Example of realisation design pattern "Observer"
         * Second with implementing
         */
        new Variant2(20);
    }
}