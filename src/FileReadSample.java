import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadSample {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {



		
		System.out.println(new BufferedReader(new FileReader(new File("E:\\test.txt"))).readLine());
	}

}
