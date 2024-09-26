package hu.ak_akademia.oop.fizzbuzz_high;

import hu.ak_akademia.oop.fizzbuzz_high.tagger3.TaggerCollection;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void print() {
		Tagger[] taggers = new TaggerCollection().getTaggers(new String[] { "Fizz","Buzz", "Chirp", "Woof", "Croak" });
		int upperThreshold = new UserInput().askInput();
		System.out.println();
		for (int i = 1; i <= upperThreshold; ++i) {
			System.out.printf("%3d", i);
			for (Tagger tagger : taggers) {
				if (tagger.isToApply(i)) {
					System.out.print(" " + tagger.getTag());
				}
			}
			System.out.println();
		}
	}

	private void run() {
		print();
	}
}
