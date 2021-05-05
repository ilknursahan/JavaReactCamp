package coffeeProject;


import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import coffeeProject.abstracts.BaseCustomerManager;
import coffeeProject.adapters.MernisServiceAdapter;

import coffeeProject.concretes.StarbucksCustomerManager;
import coffeeProject.entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
       BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
      
    
        customerManager.Save(new Customer(1,"Ýlknur", "Þahan", new GregorianCalendar(1993, 04 , 29).getTime(),"25346578188" ));
       
	}

}
