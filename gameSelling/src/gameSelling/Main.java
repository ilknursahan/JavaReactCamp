package gameSelling;

import java.util.GregorianCalendar;

import gameSelling.adapters.MernisServiceAdapter;
import gameSelling.concretes.CampaignManager;
import gameSelling.concretes.GameManager;
import gameSelling.concretes.GameSaleManager;
import gameSelling.concretes.GamerManager;
import gameSelling.entities.Campaign;
import gameSelling.entities.Game;
import gameSelling.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1,"Ýlknur", "Þahan", new GregorianCalendar(1993, 04 , 29).getTime(),"85642123655");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		Game game = new Game(1,"Counter",200);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		Campaign campaign = new Campaign(1,"Good Campaign","2021/05/01","2021/05/25",50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sale(game, gamer,campaign);
		

	}

}
