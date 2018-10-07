package org.wecancodeit.reviewsSite.repository;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewsSiteRepositoryTest {

	ReviewRepository underTest = new ReviewRepository();

	@Test
	public void shouldAddAReview() {
		Review coffee = new Review(1L, "Coffee", null, null, null);

		int sizeBefore = underTest.size();

		underTest.add(coffee);

		int sizeAfter = underTest.size();
		assertThat(sizeAfter, is(equalTo(sizeBefore + 1)));
	}

	@Test
	public void shouldGetOneReview() {
		Review coffee = new Review(1L, "Coffee", null, null, null);

		underTest.add(coffee);
		String result = underTest.findOne(1L).getTitle();

		assertThat(result, is("Coffee"));
	}

	@Test
	public void shouldGetAllReviews() {
		Review coffee = new Review(1L, "Coffee", null, null, null);
		Review tea = new Review(2L, "Tea", null, null, null);
		underTest.add(coffee);
		underTest.add(tea);

		Collection<Review> reviews = underTest.findAll();
		System.out.println(reviews);
		assertThat(reviews, hasItems(tea, coffee));
	}

}
