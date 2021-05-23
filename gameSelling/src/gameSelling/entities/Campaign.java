package gameSelling.entities;

import gameSelling.abstracts.Entity;

public class Campaign implements Entity {
	
	private int campaignId;
	private String campaignName;
	private String startDate;
	private String endDate;
	private int  discountPercent;
	
	public Campaign(int campaignId, String campaignName, String startDate, String endDate, int discountPercent) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discountPercent = discountPercent;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setcampaignId(int companyId) {
		this.campaignId = companyId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

}
