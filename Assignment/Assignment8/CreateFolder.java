//Write a java program to create a folder.
import java.io.File;
import static java.lang.System.out;
import java.io.IOException;
class CreateFolder {
	public static void main(String[] args) {
		try {
			File crF = new File("D:\\java programs\\Assignment\\Assignment8\\NewFolder.txt");
			// file path is mandatory for creation a file
			if (crF.createNewFile()){
			out.println("File created "+crF.getName());
			out.println("Absolute path "+crF.getAbsolutePath());
			} else {
				out.println("File already exists ");
			}
		}catch(IOException e) {
			out.println("An error occurred .");
			e.printStackTrace();
		}
	}
}