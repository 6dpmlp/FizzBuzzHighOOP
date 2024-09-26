package hu.ak_akademia.oop.fizzbuzz_high;

public interface TaggerServicePoint {
	Tagger[] getTaggers();

	Tagger getTagger(String tag) throws IllegalArgumentException;

	Tagger[] getTaggers(String[] tags) throws IllegalArgumentException;
}
