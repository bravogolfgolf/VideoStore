class Movie {
    static final int CHILDRENS = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    String getTitle() {
        return title;
    }

    double determineRentalAmount(int daysRented) {
        double rentalAmount = 0;
        switch (priceCode) {
            case REGULAR:
                rentalAmount += 2;
                if (daysRented > 2)
                    rentalAmount += (daysRented - 2) * 1.5;
                break;
            case NEW_RELEASE:
                rentalAmount += daysRented * 3;
                break;
            case CHILDRENS:
                rentalAmount += 1.5;
                if (daysRented > 3)
                    rentalAmount += (daysRented - 3) * 1.5;
                break;
        }
        return rentalAmount;
    }

    int determineFrequentRenterPoints(int daysRented) {
        boolean bonusIsEarned = priceCode == NEW_RELEASE && daysRented > 1;
        if (bonusIsEarned)
            return 2;
        return 1;
    }
}