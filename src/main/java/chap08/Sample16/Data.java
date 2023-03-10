package chap08.Sample16;

public class Data {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1; 
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Data other = (Data)obj;
		if (getClass() != obj.getClass())
			return false;
		else if(!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	
}
