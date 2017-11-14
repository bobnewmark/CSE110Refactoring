
public class NewReleaseMovie extends Movie {

    private static final int FREQUENT_RENTER_POINTS = 1;
    private static final double BASE_RENTAL_COST = 3;

    public NewReleaseMovie(String title) {
        super(title);
    }

    public double getCharge(int _daysRented) {
        double result = 0;
        result += _daysRented * BASE_RENTAL_COST;
        return result;
    }

    public int getFrequentRenterPoints(int _daysRented) {
        int frequentRenterPoints = FREQUENT_RENTER_POINTS;
        // add bonus for a two day new release rental
        if (_daysRented > 1)
            frequentRenterPoints += FREQUENT_RENTER_POINTS;
        return frequentRenterPoints;
    }
}
