class Cricket{
String playerNames[]=new String[11];
int index;
	
public boolean addPlayersName(String playerName){
System.out.println("Inside the playerNames()");
boolean isAdded=false;
if(playerName != null){
System.out.println("valitation is proper");
playerNames[index]= playerName;
index++;
isAdded=true;
System.out.println(playerName+"is got added Successfully");		
}
return isAdded;	
}
	
public void getPlayersName(){
for(int index=0; index<playerNames.length;index++){
System.out.println(playerNames[index]);			
}		
}	
}