import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		
		Path pathFileWrite=Paths.get("./resources/file-write.txt");
		
		List<String> list =
				List.of("1","Apple","Ball","2","Dog");
		
		Files.write(pathFileWrite, list);
	}

}
