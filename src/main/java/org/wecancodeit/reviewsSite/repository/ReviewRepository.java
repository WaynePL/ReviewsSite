package org.wecancodeit.reviewsSite.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	Map<Long, Review> reviewMap = new HashMap<>();

	public ReviewRepository() {
		add(new Review(1L, "Coffee", "/images/coffee.jpg", "bevarage",
				"The addictive standby. Will always be there for me and the "
						+ "standard that all other morning bevarages are " + "measured against. 5 out of 5."));
		add(new Review(2L, "Tea", "/images/tea.jpg", "beverage",
				"Usually doesn't pack enough of a punch to do much of anything. "
						+ "The taste is pretty good. 4 out of 5."));
		add(new Review(3L, "Red Bull", "/images/redbull.jpg", "beverage",
				"The desperate choice. Too much sugar but it really " + "gets the job done. 4.5 out of 5"));
	}

	public int size() {
		return reviewMap.size();
	}

	public void add(Review review) {
		reviewMap.put(review.getId(), review);
	}

	public Review findOne(long id) {
		return reviewMap.get(id);
	}

	public Collection<Review> findAll() {
		return reviewMap.values();
	}

}
