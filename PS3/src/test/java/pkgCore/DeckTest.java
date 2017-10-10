package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test
	public void TestEmptyDeck() throws DeckException {
		for (int i = 1; i <= 52; i++) {
			new Deck().Draw();
		}
	}

	
	@Test
	public void TestDrawSuit() {
		//TODO: Build a deck, test the Draw(eSuit) method
		for (eSuit eSuit : eSuit.values()) {
			assertTrue(new Deck().Draw(eSuit).geteSuit() == eSuit);
		}
	}
	
	@Test
	public void TestDrawRank( ) {
		for (eRank eRank : eRank.values()) {
			assertTrue(new Deck().Draw(eRank).geteRank() == eRank);
		}
	}

	@Test
	public void TestDeckSuitCount() {
		for (eSuit eSuit : eSuit.values()) {
			int eSuitCount = new Deck().counteSuit(eSuit);
			assertEquals(eSuitCount, 13);
	}
	}
	@Test
	public void TestDeckRankCount() {
		for (eRank eRank:eRank.values()) {
			int eRankCount = new Deck().counteRank(eRank);
			assertEquals(eRankCount, 4);
			}
	}
	
	@Test
	public void TestIsCardLeft() throws DeckException {
		Deck d = new Deck();
		for (int x = 1; x < 53; x++) {
			Card c = d.Draw();
			assertEquals(d.cardLeft(c.geteSuit(), c.geteRank()), 0);
		}
	}
	}
