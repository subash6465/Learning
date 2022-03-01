import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentsCollection implements Comparable<StudentsCollection>{
	
	private int id;
	private String name;
	
	
	public StudentsCollection(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return id + " " + name;
	}

	@Override
	public int compareTo(StudentsCollection that) {
		
		return Integer.compare(this.id,that.id);
		// return Integer.compare(that.id,this.id); (to reverse sort)
	}
	
	public static void main(String[] args) {
		List <StudentsCollection> student=List.of(new StudentsCollection(1,"Ranga"),
				new StudentsCollection(3, "Adam"),
				new StudentsCollection(2, "Eve"));
		
		List<StudentsCollection> studentsAl=new ArrayList<>(student);
		
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl);
		
		System.out.println("Assending order : " +studentsAl);

	}
	}
