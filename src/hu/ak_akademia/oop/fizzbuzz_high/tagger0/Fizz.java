package hu.ak_akademia.oop.fizzbuzz_high.tagger0;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

class Fizz implements Tagger {

	@Override
	public boolean isToApply(int number) {
		return number % 3 == 0;
	}

	@Override
	public String getTag() {
		return "Fizz";
	}
}
