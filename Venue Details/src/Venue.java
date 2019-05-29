
public class Venue {
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Venue() {
		super();
	}
	/*@Override
	public String toString() {
		return "class "+getClass().getName()+"["+name + " -- " + city+"]";
	}*/
	@Override
	public String toString() {
		return name + "," + city;
	}
}
