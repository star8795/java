package generic03_extends;

public class Child<K,M,C> extends Parent<K,M>{

	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Child [company=" + company + ", getKind()=" + getKind() + ", getModel()=" + getModel() + "]";
	}
	
}
