import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path pathFileRead=Paths.get("./resources/data.txt");
		List<String> lines=Files.readAllLines(pathFileRead);
		
		System.out.println("print without line break ");
		System.out.println(lines);
		
		System.out.println("print with line break ");
		Files.lines(pathFileRead).forEach(System.out::println);
		
		System.out.println("print string with letter A ");
		Files.lines(pathFileRead).filter(str -> str.contains("a"))
		.forEach(System.out::println);
		
		System.out.println("Convert upper case to lower case ");
		Files.lines(pathFileRead)
		.map(String::toLowerCase)
		.forEach(System.out::println);
		
	}

}
