//Write a java program to rename a file.
import java.io.File;
import static java.lang.System.out;
import java.io.IOException;
class RenameFile {
	public static void main(String[] args) {
		try {
			File oldFile = new File("D:\\java
				programs\\Assignment\\Assignment8\\NewTextDocument.txt");
				File newFile = new File("D:\\java
				programs\\Assignment\\Assignment8\\NewTextDocument11.txt");
			if (oldFile.renameTo(newFile)){
				out.println("File created ");
			} else { 
				out.println("Rename failed ");
			}
		} catch (SecurityException e) {
			out.println("Error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
}