

Model

	Review class:
		- id (make this of type long – you’ll find out why later) – just use 
			arbitrary, unique numbers for these ids
		- title
		- image url
		- review category
		- content
		- accessor (get* methods)
		- whatever other things you’d like to include. Some ideas:
			- date
			- description/synopsis
			- Stretch Task: tags (this should probably be a Collection)

 
	Review Repository class:
		- annotated properly so that it can be injected into ReviewsController.
		- should have a constructor that:
			- creates Review instances
			- populates a Map that stores reviews, review’s	id is the map key.
		- method to find all reviews
		- method to find one review by id

View

Controller

	Review Controller class:
		- apply proper annotation
		- inject…something appropriately
		- method mapped to a url that puts all of your reviews into the model, 
			forwarding to a “reviews” template.
		- method mapped to a url including an id parameter that puts one of 
			your reviews into the model, forwarding to a “review” template. 
			This method should expect an “id” query parameter in order to 
			select a specific review.