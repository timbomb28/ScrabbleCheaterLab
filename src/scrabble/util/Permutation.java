package scrabble.util;
public class Permutation {

	private final String word;

	public Permutation(String word) {
		this.word = word.toUpperCase(); // optional: normalize to uppercase
	}

	@Override
	public int hashCode() {
		return getNormalized().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Permutation that = (Permutation) obj;
		return this.getNormalized().equals(that.getNormalized());
	}

	@Override
	public String toString() {
		return getWord() + " / " + getNormalized();
	}

	public String getNormalized() {
		char[] chars = word.toCharArray();
		java.util.Arrays.sort(chars);
		return new String(chars);
	}

	public String getWord() {
		return word;
	}

	public int length() {
		return word.length();
	}

}
