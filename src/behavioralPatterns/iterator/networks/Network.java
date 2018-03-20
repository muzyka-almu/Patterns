package behavioralPatterns.iterator.networks;

import behavioralPatterns.iterator.iterators.ProfileIterator;

public interface Network {
    public ProfileIterator createFriendsIterator(String profileEmail);
    public ProfileIterator createCoworkersIterator(String profileEmail);
}
