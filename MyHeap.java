public class MyHeap{

  private static void swap(int[] data, int i1, int i2) {
    int curr = data[i1];
    data[i1] = data[i2];
    data[i2] = curr;
  }

  private static void pushDown(int[]data, int size,int index){
		int parent = data[index];
    newind=index*2+1;
		int left = newind;
		int right = newind+1;
		if (right >= size && left < size && parent < data[left]){
			swap(data, left, index);
		}
		else if (right < size && (parent < data[left] || parent < data[right])){
			if (data[left] >= data[right]){
				swap(data, index, left);
				pushDown(data, size, left);
			}
			else{
				swap(data, index, right);
				pushDown(data,size,right);
			}
		}
	}

  private static void pushUp(int[]data,int index){
    int i = (index-1)/2;
    if (data[i] > data[index] || index == 0 ){
      return;
    }
    else{
      swap(data, i, index);
      pushUp(data, i);
    }
  }



  public static void heapsort(int[]){
    /*
    - sort the array [ should be O(nlogn) ] :
     converting it into a heap
     removing the largest value n-1 times (remove places at end of the sub-array).
   */

 }
}
