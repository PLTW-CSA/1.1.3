package first;

public class Movie {
	private String title, artist;
    private int runTime;//for a song this is total seconds
    /**
     * Create constructors. Always create a default no value constructor first.
     * You should always have a constrcutor that passes all variables through.
     */
    public Movie() 
    {
        title = "";
        artist = "";
        runTime = 0;
    }
    public Movie(String title)
    {
        this.title = title;
        artist = "";
        runTime = 0;
    }
    public Movie(String title, String artist, int runTime){
        this.title = title;
        this.artist = artist;
        this.runTime = runTime;
    }
    /**
     * Getters and Setters
     */
    public void setTitle(String t)
    {
        title = t;
    }
    public String getTitle()
    {
        return title;
    }
    public void setArtist(String a)
    {
        artist = a;
    }
    public String getArtist()
    {
        return artist;
    }
    public void setRunTime(int rt)
    {
        runTime = rt;
    }
    public int getRunTime()
    {
        return runTime;
    }
    public void convertToProperTime()
    {
    	int hours = runTime/60;
    	int minutes = runTime/60;
    	int second = runTime%60;
    	System.out.println(minutes +" minutes and "+ second + " second run time.");
    }
    public void convertToProperTimeMovie()
    {
    	int hours = runTime/60;
    	int minutes = runTime/60;
    	System.out.println(hours +" hours and "+ minutes + " minute run time.");
    }
}
