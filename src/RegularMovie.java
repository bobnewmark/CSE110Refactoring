
public class RegularMovie extends Movie {

    private static final int NUM_DAYS_BASE_CONST = 2;
    private static final int FREQUENT_RENTER_POINTS = 1;
    private static final double LONG_TERM_RENTAL_COST = 1.5;
    private static final double BASE_RENTAL_COST = 2;

    public RegularMovie(String title) {
        super(title);
    }

    public double getCharge(int _daysRented) {
        double result = 0;
        result += BASE_RENTAL_COST;
        if (_daysRented > NUM_DAYS_BASE_CONST)
            result += (_daysRented - NUM_DAYS_BASE_CONST) * LONG_TERM_RENTAL_COST;
        return result;
    }

    public int getFrequentRenterPoints(int _daysRented) {
        return FREQUENT_RENTER_POINTS;
    }
}
