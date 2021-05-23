package gameSelling.abstracts;

import gameSelling.entities.Campaign;
import gameSelling.entities.Game;
import gameSelling.entities.Gamer;

public interface GameSaleService {
    void sale(Game game, Gamer gamer, Campaign campaign);
}
