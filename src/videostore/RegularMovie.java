package videostore;

class RegularMovie extends Movie {
    RegularMovie(String title) {
        super(title);
    }

    @Override
    double determineRentalAmount(int daysRented) {
        double rentalAmount = 2;
        if (daysRented > 2)
            rentalAmount += (daysRented - 2) * 1.5;
        return rentalAmount;
    }

    @Override
    int determineFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
