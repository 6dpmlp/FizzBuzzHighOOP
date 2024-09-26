package hu.ak_akademia.oop.fizzbuzz_high.tagger3;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

class Croak implements Tagger {

	private final String tag = "Croak";

	@Override
	public boolean isToApply(int number) {
		if (0 == number % 2 || number < 2) {
			return number == 2;
		}
		int root = (int) Math.sqrt(number);
		boolean isPrime = true;
		for (int i = 3; i <= root && isPrime; i += 2) {
			isPrime = number % i != 0;
		}
		return isPrime;
	}

	@Override
	public String getTag() {
		return tag;
	}

}
