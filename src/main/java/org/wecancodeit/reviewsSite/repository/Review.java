package org.wecancodeit.reviewsSite.repository;

public class Review {

	private long id;
	private String title;
	private String imageLocation;
	private String category;
	private String content;

	public Review(long id, String title, String imageLocation, String category, String content) {
		this.id = id;
		this.title = title;
		this.imageLocation = imageLocation;
		this.category = category;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

}
