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

}
