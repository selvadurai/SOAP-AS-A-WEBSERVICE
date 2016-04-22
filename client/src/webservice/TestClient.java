package webservice;

public class TestClient {

	public static void main(String[] args) {
		SaleServiceService serviceFactory=  new SaleServiceService();
		SaleService        service=serviceFactory.getSaleServicePort();
        System.out.println(service.idValidiation(4));
		
	}

}
