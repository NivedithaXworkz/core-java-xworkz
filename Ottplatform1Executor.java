class Ottplatform1Executor
{
public static void main(String ottp[])
{
Ottplatform1 ottplatform =new Ottplatform1();
ottplatform.addMoviesName("Appu");
ottplatform.addMoviesName("KGF");
ottplatform.addMoviesName("Ugram");
ottplatform.addMoviesName("Power");
ottplatform.addMoviesName("Appu");
ottplatform.addMoviesName("Kushi");
ottplatform.addMoviesName("KirikParty");
ottplatform.getMoviesName();

String mName = "Kushi";
System.out.println("Searching for the movie " +mName);
String movieName= ottplatform.searchByMovieName(mName);
System.out.println(movieName +" is found! thank you  for searching");

boolean deletedMovie=ottplatform.deletedByMovie("Ugram");
System.out.println("The Ugram movie is deleted :"  + deletedMovie);

}
}