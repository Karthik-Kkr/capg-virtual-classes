package com.capg.movierating.model;

import javax.persistence.Id;

public class MovieRating {

	  	@Id
		private Long id;
		private double rating;
		public MovieRating() {
			
		}
		
		public MovieRating(Long id, double rating) {
			super();
			this.id = id;
			this.rating = rating;
		}
	
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public double getRating() {
			return rating;
		}
		
		public void setRating(double rating) {
			this.rating = rating;
		}
		
		@Override
		public String toString() {
			return "MovieRating [id=" + id + ", rating=" + rating + "]";
		}
}



