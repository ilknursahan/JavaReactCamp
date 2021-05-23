package gameSelling.concretes;

import gameSelling.abstracts.CampaignService;
import gameSelling.entities.Campaign;


public class CampaignManager implements CampaignService  {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kmpanya eklendi: "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi: "+campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: "+campaign.getCampaignName());
		
	}
  
}
