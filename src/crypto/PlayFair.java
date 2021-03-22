package crypto;

public class PlayFair {

	/*
	 * Public enumerated types
	 */

	/**
	 * Substitution direction when letters are in the same row or column
	 */
	public enum RowColDirection {
		LEFT, RIGHT, UP, DOWN
	}

	/**
	 * Substitution direction when letters are in different rows and columns
	 */
	public enum RectangleDirection {
		SAME_ROW, SAME_COLUMN
	}

	/**
	 * Cipher mode of the PlayFair instance
	 */
	public enum CipherMode {
		ENCRYPT, DECRYPT
	}

	/*
	 * Constants
	 */
	private static final int BUFFER_SIZE = 200;

	/*
	 * CONSTRUCTORS
	 */

	/**
	 * Constructor with default substitution parameters
	 * 
	 * @param mode      The cipher mode (encrypt/decrypt)
	 * @param secretKey The secret key
	 */
	public PlayFair(CipherMode mode, String secretKey) {
		// TODO
	}

	/**
	 * Constructor with explicit substitution parameters
	 * 
	 * @param mode       The cipher mode (encrypt/decrypt)
	 * @param secretKey  The secret key
	 * @param sameRow    The substitution direction in same row (default is
	 *                   RowColDirection.RIGHT)
	 * @param sameColumn The substitution direction in same column (default is
	 *                   RowColDirection.DOWN)
	 * @param rectangle  The substitution direction for different rows & columns
	 *                   (default is RectangleDirection.SAME_COLUMN)
	 */
	public PlayFair(CipherMode mode, String secretKey, RowColDirection sameRow, RowColDirection sameColumn,
			RectangleDirection rectangle) {
		// TODO
	}

	/*
	 * PUBLIC METHODS
	 */

	/**
	 * Processes the last input string and returns the remaining processed data
	 * 
	 * @param input The last input string
	 * @return The remaining processed data
	 */
	public String doFinal(String input) {
		return null; // TODO
	}

	/**
	 * Processes an input string and returns the available processed data
	 * 
	 * @param input An input string
	 * @return The available processed data
	 */
	public String update(String input) {
		return null; // TODO
	}

	/*
	 * MAIN - TESTS
	 */

	public static void main(String[] args) {
		// Encrypt
		PlayFair pf = new PlayFair(CipherMode.ENCRYPT, "DANSEZ MAINTENANT JULES");
		System.out.println(pf.doFinal("DEMANDE RENFORTS IMMEDIATEMENT"));
		System.out.println(pf.update("DEMANDE ") + pf.update("RENFORTS ") + pf.doFinal("IMMEDIATEMENT"));
		System.out.println(pf.update("D") + pf.update("") + pf.update("EM") + pf.update("A") + pf.update("N")
				+ pf.update("D") + pf.update("E ") + pf.update("RENFORTS ") + pf.doFinal("IMMEDIATEMENT"));

		// Decrypt
		pf = new PlayFair(CipherMode.DECRYPT, "DANSEZ MAINTENANT JULES");
		System.out.println(pf.doFinal("AD-BM-SA-YD-DS-PC-ZX-TN-VT-AU-ZN-MS-UA-DS-FS"));
		System.out.println(pf.doFinal("ADBMSAYDDSPCZXTNVTAUZNMSUADSFS"));

		// Performance
		System.out.println("Performance test...");
		pf = new PlayFair(CipherMode.ENCRYPT, "DANSEZ MAINTENANT JULES");
		long time = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			pf.doFinal("DEMANDE RENFORTS IMMEDIATEMENT");
		}
		long duration = (System.currentTimeMillis() - time);
		System.out.printf("Elapsed time = %.2f seconds\n", duration / 1000.0);
	}
}
