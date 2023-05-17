package ubu.gii.dass.refactoring;

public class RegularPrice extends Price {

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.REGULAR;
	}

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 0;
		thisAmount += 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
		return thisAmount;
	}

}
