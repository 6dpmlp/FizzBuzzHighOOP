package hu.ak_akademia.oop.fizzbuzz_high.tagger0;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

class Buzz implements Tagger {

	@Override
	public boolean isToApply(int number) {
		return number % 5 == 0;
	}

	@Override
	public String getTag() {
		return "Buzz";
	}
}
