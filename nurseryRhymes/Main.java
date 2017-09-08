package nurseryRhymes;
import java.io.*;
import nurseryRhymes.oldMacdonald.*;

public class Main {
	
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader newInput = new BufferedReader(input); 

		Song.songIntro();
		//ask for a new animal until we find one that is on the farm
		do {
			try {
				String animal = newInput.readLine().toLowerCase();
				new Song(animal);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
		
	}
		
}