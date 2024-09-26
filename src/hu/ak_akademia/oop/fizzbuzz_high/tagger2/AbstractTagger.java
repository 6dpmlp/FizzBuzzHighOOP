package hu.ak_akademia.oop.fizzbuzz_high.tagger2;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

abstract class AbstractTagger implements Tagger {
	int divisor;
	String tag;

	@Override
	public boolean isToApply(int number) {
		return number % divisor == 0;
	}

	@Override
	public String getTag() {
		return tag;
	}
}
