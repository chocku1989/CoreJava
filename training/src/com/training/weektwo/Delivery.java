package com.training.weektwo;

public class Delivery {

	void displayDeliveryDetails(String bowler, String batsman) {

		String[] bow = bowler.split(" ");
		bowler = bow[bow.length - 1];

		String[] bat = batsman.split(" ");
		batsman = bat[bat.length - 1];

		System.out.println("Bowler : " + bowler + " Batsman :" + batsman);
	}

	void displayDeliveryDetails(Long runs) {

		Long l = new Long(runs);
		int run = l.intValue();
		switch (run) {
		case 0:
			System.out.println("Dot ball");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("its a " + run);
			break;
		case 4:
			System.out.println("its a bounday");
			break;
		case 6:
			System.out.println("Its a sixer");
			break;
		}
	}

	void displayDeliveryDetails(String wicket) {

		System.out.println(" its a wicket");
	}
}
