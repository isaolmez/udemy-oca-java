package oca.section7.lecture5;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class DeclarationForDirectThrowing {

	void play(int playerCount) throws GeneralSecurityException {
		if (playerCount > 4) {
			throw new GeneralSecurityException();
		}
	}

	void playGuide(String name) throws IOException {
		if (name.length() > 5) {
			throw new IOException();
		}
	}
}
