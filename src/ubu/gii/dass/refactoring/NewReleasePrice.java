package ubu.gii.dass.refactoring;

public class NewReleasePrice extends Price {

	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}

	@Override
	double getCharge(int daysRented) {
		return daysRented * 3;
	}

	int getFrequentRenterPoints(Movie movie, int daysRented) {
		return getFrequentRenterPoints(daysRented);
	}

	int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1) return 2; 
		else return 1;
	}

}
