package hu.ak_akademia.oop.fizzbuzz_high.tagger2;

class Croak extends AbstractTagger {
	{
		divisor = -1;
		tag = "Croak";
	}

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
}
