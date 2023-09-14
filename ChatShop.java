class ChatShop{
String chatNames[]=new String[10];
int index;
	
public boolean addChatsName(String chatName){
System.out.println("Inside the chatNames()");
boolean isAdded=false;
if(chatName != null){
System.out.println("valitation is proper");
chatNames[index]=chatName;
index++;
isAdded=true;	
System.out.println(chatName+"is got added Successfully");	
}
return isAdded;	
}
	
public void getChatsName(){
for(int index=0; index<chatNames.length;index++){
System.out.println(chatNames[index]);			
}		
}	
}