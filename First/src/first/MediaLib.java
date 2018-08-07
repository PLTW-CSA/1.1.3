package first;

public class MediaLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displaySong();
		displayMovie();

	}
	public static void displaySong()
	{
		Song song1 = new Song();
		song1.setTitle("Ring of Fire ");
		song1.setRunTime(211);
		Song song2 = new Song("Eulogy ", "", 224);
		
		//System.out.println(song1);
		System.out.print(song1.getTitle());
		song1.convertToProperTime();
		System.out.print(song2.getTitle());
		song2.convertToProperTime();
	}
	public static void displayMovie()
	{
		Movie movie1 = new Movie();
		movie1.setTitle("Big Lebowski ");
		movie1.setRunTime(125);
		Movie movie2 = new Movie("Star Wars Episode V ", "", 135);
		
		//System.out.println(movie1);
		System.out.print(movie1.getTitle());
		movie1.convertToProperTimeMovie();
		System.out.print(movie2.getTitle());
		movie2.convertToProperTimeMovie();
	}

}
