package coffeeProject.concretes;



import coffeeProject.abstracts.BaseCustomerManager;
import coffeeProject.abstracts.CustomerCheckService;
import coffeeProject.entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager   {

private CustomerCheckService customerCheckService;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db : " + customer.getFirstName());
		}
		else{
			System.out.println("Not a valid person");
		};
	}

	


	


	
}
