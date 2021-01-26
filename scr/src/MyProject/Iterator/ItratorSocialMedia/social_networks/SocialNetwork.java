package MyProject.Iterator.ItratorSocialMedia.social_networks;

import MyProject.Iterator.ItratorSocialMedia.Itrators.ProfileIterator;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/26/2021
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}