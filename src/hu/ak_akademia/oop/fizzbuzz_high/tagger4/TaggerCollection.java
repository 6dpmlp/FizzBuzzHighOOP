package hu.ak_akademia.oop.fizzbuzz_high.tagger4;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;
import hu.ak_akademia.oop.fizzbuzz_high.TaggerServicePoint;

public class TaggerCollection implements TaggerServicePoint {

	@Override
	public Tagger[] getTaggers() {
		TaggerEnum[] taggerEnums = TaggerEnum.values();
		return taggerEnums;
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
