package in.nit.model;

public class Product {
	private Integer pId;
	private String pName;
	private String pSal;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer pId) {
		super();
		this.pId = pId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpSal() {
		return pSal;
	}

	public void setpSal(String pSal) {
		this.pSal = pSal;
	}

}
