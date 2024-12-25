package unlp.oo1.bag;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        this.elements = new HashMap<T, Integer>();
    }

    @Override
    public boolean add(T element) {
    	int occurrences = this.occurrencesOf(element);
    	if (occurrences == 0) {
    		this.elements.put(element, 0);
    	}
    	else
    		occurrences++;
    		this.elements.put(element, occurrences);
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
        return this.occurrencesOf(element);
 //       return 0;
    }

    @Override
    public void removeOccurrence(T element) {
        // TODO Completar con la implementación correspondiente
    }

    @Override
    public void removeAll(T element) {
        // TODO Completar con la implementación correspondiente
    }

    @Override
    public int size() {
        // TODO Completar con la implementación correspondiente
       return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
