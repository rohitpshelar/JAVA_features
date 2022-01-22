package java8.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class emp {

	int id;
	String name;

	public emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		emp other = (emp) obj;
		return id == other.id;
	}

	

}

public class HashMapCustormClass {

	public static void main(String[] args) {
		Map<emp, Integer> m = new HashMap<emp, Integer>();
		m.put(new emp(1, "Rohit"), 1);
		m.put(new emp(1, "Rohit"), 1);
		m.put(new emp(2, "Rohit"), 1);
		m.put(new emp(1, "Don"), 1);

		System.out.println(m.size());
	}

}
