package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository{

	@Override
	public Client save(Client c) {
		System.out.println("DAOLayer: ClientRepositoryImpl Level...");
		return null;
	}

	public ClientRepositoryImpl() {
		System.out.println("Call ClientRepository ...");
	}
	
}
