class SortAsc {
static int arr[] = {5,2,8,7,1};
public static void main(String rams[]){
int temp = 0;
System.out.println("Elements of original array:");
for(int index=0; index < arr.length; index++){
System.out.println(arr[index]);
}
for(int index = 0; index < arr.length; index++){
for(int index1 = index+1; index1 <arr.length; index1++){
if (arr[index] > arr[index1]){
temp = arr[index];
arr[index] = arr[index1];
arr[index1] = temp;
}
}
} 
System.out.println();
System.out.println("Elements of array  sorted in descending order :");
for (int index =0 ; index < arr.length; index++){
System.out.println(arr[index]);
}
}
}