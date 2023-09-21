class Interiors{

String materialNames[] = new String[10];
int index;

public boolean addMaterialName(String materialName)
  {
      boolean isAdded = false;
     if(index< materialNames.length)
      {
        if(materialName != null)
         {
	         boolean exist =  checkIfMaterialNameExist(materialName);
	         if(exist == false)
		     {   
              materialNames[index++]= materialName;
              isAdded  = true;
			  }
            else
		     {
	          System.out.println(materialName+" Material name already exist .. please add other");
             }
         }
      }
      else
      {
       System.out.println("Array index out of bound Exception");
      }
 return isAdded;
}
 //read/read method
  public void  getMaterialNames()
  {
  System.out.println("List Of Materials are: ");
   for(int index = 0;index <materialNames.length; index++)
   {
   System.out.println(materialNames[index]);
   }
  }
  public boolean checkIfMaterialNameExist(String materialName)
  {
	boolean exist = false;
	for(int index = 0;index < materialNames.length; index++){
    if(materialNames[index] ==  materialName){
	exist = true;
  }
  }
 return exist;
}

//search
  public String searchMaterialName( String materialName)
 {      
    for(int i=0;i<materialNames.length;i++)
	{
		if(materialNames[i]==materialName)
		   return materialName;
	}
   return null;
  }
  
  String materialNamesAfterDelete[] = new String[materialNames.length-1];

	
	public boolean deletedByMaterialNames(String materialName){
	boolean isDeleted = false;
	int ind = 0;
	 for(int index=0; index< materialNames.length; index++){
		 
		 if(materialNames[index]!= materialName){
	materialNamesAfterDelete[ind++]= materialNames[index];
		 isDeleted = true;

		 }
	 }
	 return isDeleted;
}	

public void getDeletedMaterialNames(){
	System.out.println("List of material name After Deleted are: ");
	 for(int index=0; index< materialNamesAfterDelete.length; index++){
		 System.out.println(materialNamesAfterDelete[index]);
}

}


}