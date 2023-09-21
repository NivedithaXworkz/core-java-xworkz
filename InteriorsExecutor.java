class InteriorsExecutor{

public static void main(String interiors[]){

Interiors materialName = new Interiors();
materialName.addMaterialName("Colouring");
materialName.addMaterialName("Glass");
materialName.addMaterialName("Marble");
materialName.addMaterialName("Digital Camera");
materialName.addMaterialName("Textile");
materialName.addMaterialName("scale");
materialName.addMaterialName("Metal");
materialName.addMaterialName("Handy multi-tool");
materialName.addMaterialName("Metal");
materialName.addMaterialName("Pair of gloves");

materialName.getMaterialNames();

      String materialsName = "Metal";
      System.out.println("Searching for the materialName " +materialsName);
      String mName=materialName.searchMaterialName(materialsName);
	  System.out.println(mName +" is found! thank you searching. " );
	  materialName.addMaterialName("Pair of gloves");
materialName.getDeletedMaterialNames();
}
}