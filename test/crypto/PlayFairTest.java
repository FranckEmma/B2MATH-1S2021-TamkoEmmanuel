package crypto;

import org.junit.jupiter.api.Test;

import crypto.PlayFair.CipherMode;
import crypto.PlayFair.RectangleDirection;
import crypto.PlayFair.RowColDirection;

import static org.junit.jupiter.api.Assertions.*;

public class PlayFairTest {
	private static final String TEST_KEY = "DANSEZ MAINTENANT JULES";
	private static final String TEST_MESSAGE = "DEMANDE RENFORTS IMMEDIATEMENT";

	/*
	 * ENCRYPT - doFinal()
	 */
	@Test
	public void testNull() {
		PlayFair pf = new PlayFair(CipherMode.ENCRYPT, TEST_KEY);
		assertThrows(NullPointerException.class, () -> { pf.doFinal(null); });
	}
	
	@Test
	public void testEmptyString() {
		PlayFair pf = new PlayFair(CipherMode.ENCRYPT, TEST_KEY);
		assertEquals("", pf.doFinal(""));
	}
	
	@Test
	public void testMediumMessage() {
		PlayFair pf = new PlayFair(CipherMode.ENCRYPT, TEST_KEY);
		assertEquals("AD-BM-SA-YD-DS-PC-ZX-TN-VT-AU-ZN-MS-UA-DS-FS", pf.doFinal(TEST_MESSAGE));
	}
	
	/* ---------------------------------------------------------------- */

	/*
	 * DECRYPT - doFinal()
	 */
	@Test
	public void testDecryptNull() {
		PlayFair pf = new PlayFair(CipherMode.DECRYPT, TEST_KEY);
		assertThrows(NullPointerException.class, () -> { pf.doFinal(null); });
	}
	
	@Test
	public void testDecryptEmptyString() {
		PlayFair pf = new PlayFair(CipherMode.DECRYPT, TEST_KEY);
		assertEquals("", pf.doFinal(""));
	}
	
	@Test
	public void testDecryptMediumMessage() {
		PlayFair pf = new PlayFair(CipherMode.DECRYPT, TEST_KEY);
		assertEquals("DE-MA-ND-ER-EN-FO-RT-SI-MX-ME-DI-AT-EM-EN-TX", pf.doFinal("AD-BM-SA-YD-DS-PC-ZX-TN-VT-AU-ZN-MS-UA-DS-FS"));
	}	
}
