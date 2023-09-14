class Spotify{
String songNames[]=new String[11];
int index;
	
public boolean addSongsName(String songName){
System.out.println("Inside the songNames()");
boolean isAdded=false;
if(songName != null){
System.out.println("valitation is proper");
songNames[index]= songName;
index++;
isAdded=true;	
System.out.println(songName+"is got added Successfully");
}
return isAdded;	
}
	
public void getSongsName(){
for(int index=0; index<songNames.length;index++){
System.out.println(songNames[index]);			
}		
}	
}