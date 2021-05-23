package gameSelling.concretes;


import gameSelling.abstracts.CheckGamerService;
import gameSelling.abstracts.GamerService;
import gameSelling.entities.Gamer;

public class GamerManager implements GamerService {

private CheckGamerService checkGamerService;
	

	public GamerManager(CheckGamerService checkGamerService) {
		this.checkGamerService = checkGamerService;
	}
	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		if(checkGamerService.CheckIfRealPerson(gamer)) {
			System.out.println("Add to db : " + gamer.getFirstName());
		}
		else{
			System.out.println("Not a valid person");
		};
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Deleted from db : " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Updated : " + gamer.getFirstName());
	}

}
