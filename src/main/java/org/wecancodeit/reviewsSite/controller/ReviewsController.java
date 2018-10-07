package org.wecancodeit.reviewsSite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wecancodeit.reviewsSite.repository.ReviewRepository;

@Controller
public class ReviewsController {

	ReviewRepository reviewRepo = new ReviewRepository();

	@GetMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@GetMapping("/reviews/{id}")
	public String getReview(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";
	}

	@GetMapping("/")
	public String getDefault(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "/reviews";
	}
}
