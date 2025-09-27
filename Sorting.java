class Sorting {
  public static void main(String[] args) {
    
  // int [] arrayInteger = {5,3,8,6,2};
  // int temp;   
  // // Sorting Logic | Bubble Sort
  // for (int i = 0; i <arrayInteger.length-1 ; i++) {
  //   for (int j = 0; j <arrayInteger.length-i-1; j++) {
  
  //     if(arrayInteger[j]>arrayInteger[j+1]){
  //       // swap
  //       temp = arrayInteger[j];
  //       arrayInteger[j] = arrayInteger[j+1];
  //       arrayInteger[j+1] = temp;
  //     }
  //   }
  // }
  // for(int k: arrayInteger){
  //   System.out.print(k+" ");
  // }

  // setection sort
  // int [] arrayInteger = {5,3,8,6,2};
  // int temp;
  // for (int i = 0; i <arrayInteger.length-1 ; i++) {
  //   int minIndex = i;
  //   for (int j = i+1; j <arrayInteger.length; j++) {
  //     if(arrayInteger[j]<arrayInteger[minIndex]){
  //       minIndex = j;
  //     }
  //   }
  //   // swap
  //   temp = arrayInteger[minIndex];
  //   arrayInteger[minIndex] = arrayInteger[i];
  //   arrayInteger[i] = temp;
  // }
  //   for(int k: arrayInteger){
  //   System.out.print(k+" ");
  // }

  // Insertion Sort
  int [] arrayInteger = {5,3,8,6,2};
  int key, j;
  for (int i = 1; i <arrayInteger.length ; i++) {
    key = arrayInteger[i];
    j = i-1;
    while(j>=0 && arrayInteger[j]>key){
      arrayInteger[j+1] = arrayInteger[j];
      j--;
    }
    arrayInteger[j+1] = key;
  }
    for(int k: arrayInteger){
    System.out.print(k+" ");
  }
}
}
