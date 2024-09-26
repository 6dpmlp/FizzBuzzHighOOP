package hu.ak_akademia.oop.fizzbuzz_high.tagger1;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

abstract class AbstractTagger implements Tagger {
	private final int divisor;
	private final String tag;

	AbstractTagger(int divisor, String tag) {
		this.divisor = divisor;
		this.tag = tag;
	}

	AbstractTagger(String tag) {
		this(-1, tag);
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
