public abstract class Movie {

    private String _title;

    Movie(String title) {
        set_title(title);
    }

    String get_title() {
        return _title;
    }

    private void set_title(String _title) {
        this._title = _title;
    }

    public abstract double getCharge(int _daysRented);

    public abstract int getFrequentRenterPoints(int _daysRented);
}
