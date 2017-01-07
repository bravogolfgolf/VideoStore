
 class Rental
{
	private Movie movie;
	private int daysRented;

	 Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

	 int getDaysRented () {
		return daysRented;
	}
	Movie getMovie () {
		return movie;
	}

    double determineRentalAmount() {
        double rentalAmount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                rentalAmount += 2;
                if (getDaysRented() > 2)
                    rentalAmount += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                rentalAmount += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                rentalAmount += 1.5;
                if (getDaysRented() > 3)
                    rentalAmount += (getDaysRented() - 3) * 1.5;
                break;
        }
        return rentalAmount;
    }

    int determineFrequentRenterPoints() {
        boolean bonusIsEarned = getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1;
        if (bonusIsEarned)
            return 2;
        return 1;
    }
}