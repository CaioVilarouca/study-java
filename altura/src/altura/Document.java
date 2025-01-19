package altura;

public class Document {
	private String name;
	private Integer ager;
	private Double height;
	
	public Document(String name, Integer ager, Double height) {
		this.name = name;
		this.ager = ager;
		this.height = height;
	}
	
	public double resultHeight(double height, double result) {
		return result += height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAger() {
		return ager;
	}

	public void setAger(Integer ager) {
		this.ager = ager;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Document [name=" + name + ", ager=" + ager + ", height=" + height + "]";
	}
	
}
