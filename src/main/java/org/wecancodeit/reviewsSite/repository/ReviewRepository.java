package org.wecancodeit.reviewsSite.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {

	Map<Long, Review> reviewMap = new HashMap<>();

	public ReviewRepository() {
		add(new Review(1L, "Coffee", "/images/coffee.jpg", "bevarage",
				"The addictive standby. Will always be there for me and the standard that all other morning bevarages are measured against. 5 out of 5."));

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
