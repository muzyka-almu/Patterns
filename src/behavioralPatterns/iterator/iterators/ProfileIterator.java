package behavioralPatterns.iterator.iterators;

import behavioralPatterns.iterator.Profile;

public interface ProfileIterator {
    public boolean hasNext();
    public Profile getNext();
    public void reset();
}