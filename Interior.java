class Interior{
String materialNames[]=new String[10];
int index;
	
public boolean addMaterialsName(String materialName){
System.out.println("Inside the materialNames()");
boolean isAdded=false;
if(materialName != null){
System.out.println("valitation is proper");
materialNames[index]= materialName;
index++;
isAdded=true;
System.out.println(materialName+"is got added Successfully");	
}
return isAdded;	
}
	
public void getMaterialsName(){
for(int index=0; index<materialNames.length;index++){
System.out.println(materialNames[index]);			
}		
}	
}