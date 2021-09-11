package development;

public class EncapsClass1 {

	private int id;
	private String name;

	private int id1;
	private String name1;

	public int getId() {
		return id;

	}

	public String getName() {
		return name;

	}

	public void setId(int idd) {
		id = idd;

	}

	public void setName(String n) {
		name = n;

	}

	public void setId1(int id1) {
		this.id1 = id1;

	}

	public int getId1() {
		return id1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
		this.getId();
		
	}

}
