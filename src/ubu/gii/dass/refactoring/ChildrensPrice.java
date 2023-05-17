package ubu.gii.dass.refactoring;

public class ChildrensPrice extends Price {

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.CHILDRENS;
	}

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 0;
		thisAmount += 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}

	int getFrequentRenterPoints(Movie movie, int daysRented) {
		return getFrequentRenterPoints(daysRented);
	}

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
