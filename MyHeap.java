import java.util.*;

public class MyHeap{

  private static void swap(int[] data, int i1, int i2) {
    int curr = data[i1];
    data[i1] = data[i2];
    data[i2] = curr;
  }

  private static void pushDown(int[]data, int size,int index){
		int parent = data[index];
    int newind=index*2+1;
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

  public static void heapify(int[] nums){
      for (int i = nums.length-1; i >= 0; i--) {
        pushDown(nums,nums.length, i);
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



  public static void heapsort(int[] nums){
      heapify(nums);
      for (int i = nums.length-1; i > 0; i--) {
        swap(nums, 0, i);
        pushDown(nums, i, 0);
      }
    }


}
