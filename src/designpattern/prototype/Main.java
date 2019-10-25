package designpattern.prototype;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		BenzCard card = new BenzCard();
		card.setBenzEngine(new BenzEngine());
		card.setWheel(new BenzWheel());
		
		System.out.println(card);
		System.out.println(card.getBenzEngine());
		System.out.println(card.getWheel());
		
//		BenzCard copyBenzCard = (BenzCard) card.depthClone();
		BenzCard copyBenzCard = (BenzCard) card.clone();
		System.out.println(copyBenzCard);
		System.out.println(copyBenzCard.getBenzEngine());
		System.out.println(copyBenzCard.getWheel());
	}
}
