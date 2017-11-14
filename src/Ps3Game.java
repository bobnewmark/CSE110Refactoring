
public class Ps3Game extends VideoGame {

	private static double CONSOLE_COST = 299.99 ;
	private static double CONSOLE_RENTAL_COST = 29.99 ;
	private static int NUM_DAYS_BASE_PRICE = 4;
	private static double BASE_PRICE = 4;
	private static double EXTRA_PRICE = 1.25;
	private static int FREQUENT_RENTER_POINTS = 2;
	private static String CONSOLE_NAME = "Playstation 3";
	private String _gameName;
		
	public Ps3Game(String name) {
		super();
		_gameName = name;
	}

	@Override
	public String get_gameName() {
		return _gameName;
	}

	@Override
	public String get_consoleName() {
		return Ps3Game.CONSOLE_NAME;
	}

	@Override
	public double getCharge(int _daysRented, boolean _consoleRented) {
		double result = 0;
		result += Ps3Game.BASE_PRICE;
		if(_daysRented > Ps3Game.NUM_DAYS_BASE_PRICE)
			result += (_daysRented - Ps3Game.NUM_DAYS_BASE_PRICE)* Ps3Game.EXTRA_PRICE;
		if(_consoleRented)
			result += Ps3Game.CONSOLE_RENTAL_COST + _daysRented;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int _daysRented, boolean _consoleRented) {
		if(_consoleRented && _daysRented > Ps3Game.NUM_DAYS_BASE_PRICE)
			return Ps3Game.FREQUENT_RENTER_POINTS + _daysRented - Ps3Game.NUM_DAYS_BASE_PRICE;
		else
			return Ps3Game.FREQUENT_RENTER_POINTS;
	}

	public String toString() {
		return _gameName;
	}
}
