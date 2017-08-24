package sorting;

public class Bubblesort {

    int array[]={1,5,3,32,54,6,87,5,1};
    int temp=0;
public void enter(){
    for(int i=0;i<array.length;i++){
        for(int j=0;j<(array.length-i);j++){
            if(array[j]>=array[j+1]){


                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                }

        }
    }
}
public void show(){

    for(int i:array){
    System.out.println(i);
    }
}
public static void main(String str[]){

    new Bubblesort().enter();
    new Bubblesort().show();
}
}