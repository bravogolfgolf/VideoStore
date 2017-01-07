
 class Rental
{
	private Movie movie;
	private int daysRented;

	 Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

    Movie getMovie() {
        return movie;
    }

    double determineRentalAmount() {
        return movie.determineRentalAmount(daysRented);
    }

    int determineFrequentRenterPoints() {
        return movie.determineFrequentRenterPoints(daysRented);
    }

}