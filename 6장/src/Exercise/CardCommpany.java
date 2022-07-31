package Exercise;

public class CardCommpany {
private static CardCompany instance = new CardCompany();
	
	private CardCommpany() {}
	public static CardCompany getInstance() {
		if(instance == null )
			instance = new CardCompany();
		return instance;
	}
	public Card createCard() {
		
		Card card = new Card();
		return card;
	}
}
