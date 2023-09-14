class Hotel{
String menuNames[]=new String[10];
int index;
	
public boolean addMenusName(String menuName){
System.out.println("Inside the menuNames()");
boolean isAdded=false;
if(menuName != null){
System.out.println("valitation is proper");
menuNames[index]=menuName;
index++;
isAdded=true;	
System.out.println(menuName+"is got added Successfully");	
}
return isAdded;	
}
	
public void getMenusName(){
for(int index=0; index<menuNames.length;index++){
System.out.println(menuNames[index]);			
}		
}	
}