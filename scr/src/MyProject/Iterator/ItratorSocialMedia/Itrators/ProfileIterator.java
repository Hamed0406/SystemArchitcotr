package MyProject.Iterator.ItratorSocialMedia.Itrators;

import MyProject.Iterator.ItratorSocialMedia.Profiles.Profile;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/26/2021
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}