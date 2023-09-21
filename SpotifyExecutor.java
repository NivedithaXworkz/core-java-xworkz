class SpotifyExecutor{
    public static void main(String spotifyplatform[])
	{
        Spotify spotify= new Spotify();

        // Adding song names
		spotify.addSongName("Heeriye");
		spotify.addSongName("Dil Jhoom");
		spotify.addSongName("Kasam Se");
		spotify.addSongName("Heeriye");
		spotify.addSongName("Ramaiya Vastavaiya");
		spotify.addSongName("Chammak Challo");
		spotify.addSongName("Chal Tere Ishq Mein");
        spotify.addSongName("Mahiye");
        spotify.addSongName("Gollimata");
        spotify.addSongName("Chandni");
		spotify.addSongName("sapta sagara");


        // Getting and printing song names
        spotify.getSongNames();
		
		String songName = "Mahiye";
      System.out.println("Searching for the Song Name " +songName);
      String sName=spotify.searchSongName(songName);
	  System.out.println(sName +" is found! thank you searching. " );
	  
	  boolean deletedsongName= spotify.deletedBySongNames("Mahiye");
System.out.println("The Mahiye song is deleted :"  + deletedsongName);
spotify.getDeletedSongNames();
    }
}