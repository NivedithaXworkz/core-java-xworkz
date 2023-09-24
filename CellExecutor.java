class CellExecutor{
 public static void main(String[] time){
   Cell cell=new Cell();
   cell.setCellId(9);
   cell.setCellName("Button cells");
   cell.setVoltage(3);
		
		Watch watch=new Watch();
		watch.cell=cell;
		System.out.println("The Cell id  is: "+ watch.cell.getCellId());
		System.out.println("The Cell Name is : "+ watch.cell.getCellName());
		System.out.println("The Cell voltage is : "+ watch.cell.getVoltage());
}
}