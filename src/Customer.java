import java.util.*;

class Customer {

    private String _name;
    private Vector<MovieRental> _movieRentals = new Vector<MovieRental>();
    private Vector<VideoGameRental> _videoGameRental = new Vector<VideoGameRental>(); 

    public Customer(String name) {
        set_name(name);
    }

    public void addMovieRental(MovieRental arg) {
        _movieRentals.addElement(arg);
    }

    public void addVideoGameRental(VideoGameRental arg) {
        _videoGameRental.addElement(arg);
    }
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<MovieRental> movieRentals = _movieRentals.elements();
        Enumeration<VideoGameRental> videoGameRentals = _videoGameRental.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + get_name() + "\n");

        while (movieRentals.hasMoreElements()) {
            MovieRental each = (MovieRental) movieRentals.nextElement();
            // add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();
            // show figures for this rental
            result.append("\t").append(each.getMovie().get_title()).append("\t").append(String.valueOf(each.getCharge())).append("\n");
            totalAmount += each.getCharge();
        }

        while (videoGameRentals.hasMoreElements()) {
            VideoGameRental each = (VideoGameRental) videoGameRentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
            result.append("\t").append(each.getVideoGame()).append("\t").append(String.valueOf(each.getCharge())).append("\n");
            totalAmount += each.getCharge();
        }
        // add footer lines
        result.append("Amount owed is ").append(String.valueOf(totalAmount)).append("\n");
        result.append("You earned ").append(String.valueOf(frequentRenterPoints)).append(" frequent renter points");
        return result.toString();
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
