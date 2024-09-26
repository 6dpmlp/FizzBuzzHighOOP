package hu.ak_akademia.oop.fizzbuzz_high.tagger2;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;
import hu.ak_akademia.oop.fizzbuzz_high.TaggerServicePoint;

public class TaggerCollection implements TaggerServicePoint {

	@Override
	public Tagger[] getTaggers() {
		return new Tagger[] { new Fizz(), new Buzz(), new Chirp(), new Woof(), new Croak() };
	}

	@Override
	public Tagger getTagger(String tag) throws IllegalArgumentException {
		Tagger[] taggers = getTaggers();
		for (Tagger tagger : taggers) {
			if (tagger.getTag().equals(tag)) {
				return tagger;
			}
		}
		throw new IllegalArgumentException();
	}

	@Override
	public Tagger[] getTaggers(String[] tags) throws IllegalArgumentException {
		Tagger[] taggers = new Tagger[tags.length];
		int index = 0;
		for (String tag : tags) {
			taggers[index++] = getTagger(tag);
		}
		return taggers;
	}
}
