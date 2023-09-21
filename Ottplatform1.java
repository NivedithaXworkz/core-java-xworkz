class Ottplatform1
{
	//instance variableclass OttPlatForm 
	String movieNames[]=new String[7];
	int index;//instance variable
	
	//create/add/save operation
	public boolean addMoviesName(String movieName)
	{	
		boolean isAdded=false;//local variable it shoul be initialize at the time of declarartion
			
		if(index < movieNames.length) //validation
		{  
	   
		   if(movieName != null)
		   {
			   boolean exists=checkIfNameExists(movieName);
			   if(exists==false)
			   {
			    movieNames[index++]=movieName;
			    isAdded=true;
			   }
               else
			   {
				  System.out.println( movieName +" is aleady added");
			   }				  
		   }
		}
		else{
		   System.out.println("movieName size is full..cannot procees to add the data");
		   }
	return isAdded;
	}
	
	public boolean checkIfNameExists(String movieName)
		{
			boolean exists=false;
	      for(int index=0;index<movieNames.length;index++)
	       {
			   if (movieNames[index]==movieName)
			   { 
			   exists=true;
			   }
	       }  
		  return exists;
		}
		
		// Search for a movie by name
		public String searchByMovieName(String movieName) {
        for (int i = 0; i < movieNames.length; i++) {
            if (movieNames[i] == movieName) 
			{
                return movieName;
            }
        }
        return null; // Return null if movie not found
    }
	
	 // Read and display all movie names
	public void getMoviesName()
	{
		System.out.println("The list of MOvie names are :");
		for(int index=0; index < movieNames.length;index++)
		{
			System.out.println(movieNames[index]);
		}
		
	}
	public boolean deletedByMovie(String movieName){
	boolean isDeleted = false;
	String movieNamesAfterDelete [] = new String[movieNames.length-1];
	int ind = 0;
	 for(int index=0; index< movieNames.length; index++){
		 //"Appu == KGF"
		 if(movieNames[index]!= movieName){
		 movieNamesAfterDelete[ind++]= movieNames[index];
		 isDeleted = true;
		 }
	 }
	 return isDeleted;
}	

}
 