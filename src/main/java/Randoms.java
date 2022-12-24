import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    //protected Random random;
    private  int min;
    private  int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {

            return new Random().nextInt(max-min + 1) + min;
        }
    }

}
