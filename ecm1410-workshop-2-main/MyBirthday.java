public class MyBirthday {
	public static void main(String[] args) {
		int currentDate = 14;
		int currentDay = 1;
		final int DAYS_A_WEEK = 7;
		int myBirthdayDate = 29;
		byte myBirthdayDay = (byte) ((myBirthdayDate-currentDate)%DAYS_A_WEEK+currentDay);
		myBirthdayDay = (byte) (myBirthdayDay%DAYS_A_WEEK);
		System.out.print(myBirthdayDay);
	}
}
