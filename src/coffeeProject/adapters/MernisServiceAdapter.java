package coffeeProject.adapters;

import java.rmi.RemoteException;

import coffeeProject.abstracts.CustomerCheckService;
import coffeeProject.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					1993);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
		
	}


