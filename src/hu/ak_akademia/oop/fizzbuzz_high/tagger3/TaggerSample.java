package hu.ak_akademia.oop.fizzbuzz_high.tagger3;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

class TaggerSample implements Tagger {

	private final int divisor;
	private final String tag;

	TaggerSample(int divisor, String tag) {
		this.divisor = divisor;
		this.tag = tag;
	}

	@Override
	public boolean isToApply(int number) {
		return number % divisor == 0;
	}

	@Override
	public String getTag() {
		return tag;
	}
}
