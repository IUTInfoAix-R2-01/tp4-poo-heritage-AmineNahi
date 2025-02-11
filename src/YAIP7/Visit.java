package YAIP7;

import java.time.LocalDate;

public class Visit {
    private Customer customer;
    private double serviceExpens;
    private double productExpens;
    private LocalDate date;

    public Visit(String name, LocalDate date) {
        this.customer = new Customer(name);
        this.date = date;
    }
    
    public String getName() {
    	return customer.getName();
    }
    
    public double getServiceExpens() {
		return serviceExpens;
	}

	public void setServiceExpens(double serviceExpens) {
		this.serviceExpens = serviceExpens;
	}

	public double getProductExpens() {
		return productExpens;
	}

	public void setProductExpens(double productExpens) {
		this.productExpens = productExpens;
	}

	public double getTotalExpens() {
		return serviceExpens + productExpens;
	}
	
	@Override
    public String toString() {
        return "Visit{" +
               "customer=" + customer.getName() +
               ", serviceAmount=" + serviceExpens +
               ", productAmount=" + productExpens +
               ", date=" + date +
               '}';
    }
}
