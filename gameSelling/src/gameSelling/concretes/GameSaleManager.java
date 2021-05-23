package gameSelling.concretes;

import gameSelling.abstracts.GameSaleService;
import gameSelling.entities.Campaign;
import gameSelling.entities.Game;
import gameSelling.entities.Gamer;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		double lastPrice;
		lastPrice  = game.getPrice()-((game.getPrice()*campaign.getDiscountPercent())/100);
		System.out.println("The game named "+game.getGameName()+" sold for "+lastPrice+" to "+gamer.getFirstName());
		
	}

}
