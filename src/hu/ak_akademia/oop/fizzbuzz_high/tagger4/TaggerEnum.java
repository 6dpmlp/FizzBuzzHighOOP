package hu.ak_akademia.oop.fizzbuzz_high.tagger4;

import hu.ak_akademia.oop.fizzbuzz_high.Tagger;

enum TaggerEnum implements Tagger {
	FIZZ(3, "Fizz"),
	BUZZ(5, "Buzz"),
	CHIRP(7, "Chirp"),
	WOOF(11, "Woof"),
	Croak("Croak"){
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
	};
	
	private final int divisor;
	private final String tag;
	
	TaggerEnum(int divisor, String tag){
		this.divisor = divisor;
		this.tag = tag;
	}
	
	TaggerEnum(String tag){
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
