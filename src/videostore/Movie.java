package videostore;

abstract class Movie {

    private String title;

    Movie(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    abstract double determineRentalAmount(int daysRented);

    abstract int determineFrequentRenterPoints(int daysRented);
}