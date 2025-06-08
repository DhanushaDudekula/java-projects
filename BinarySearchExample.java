package hello;

public class BinarySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,4,3,6,8,10};
		int target = 10;
		int left = 0;
		int right = numbers.length-1;
		boolean found = false;
		while(left<=right) {
			int mid = (left+right)/2;
			if(numbers[mid]==target) {
				System.out.println("Found" + target+"at index"+mid);
				found = true;
				break;
				
			}else if(target<numbers[mid])
			{		right=mid-1;
			
			}
			else {
				left=mid+1;
				}
}
		if(!found) {
			System.out.println("number not found");
			
			}
			}
		}



