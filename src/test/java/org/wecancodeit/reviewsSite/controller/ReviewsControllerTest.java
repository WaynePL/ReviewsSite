package org.wecancodeit.reviewsSite.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancodeit.reviewsSite.controller.ReviewsController;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewsController.class)
public class ReviewsControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void shouldBeOkWhenGoingToReview() throws Exception {
		mockMvc.perform(get("/reviews/1")).andExpect(status().isOk());
	}

	@Test
	public void shouldBeCalledReview() throws Exception {
		mockMvc.perform(get("/reviews/1")).andExpect(view().name("review"));
	}

	@Test
	public void shouldBeOkWhenGoingToReviews() throws Exception {
		mockMvc.perform(get("/reviews")).andExpect(status().isOk());
	}
}