package test.main;

import test.mypac.Bike;

public class MainClass07 {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		
		for(int i=0;i<nums.length;i++) {
			int tmp=nums[i];
			System.out.println(tmp);
		}
		System.out.println("-------- 확장 for 문을 사용하면--------");
		for(int tmp:nums) {
			//tmp의 경우 대상이 되는 배열의 data type과 같아야한다.
			System.out.println(tmp);
		}
		Bike[] bikes=new Bike[3];
		
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(Bike tmp:bikes) {
			tmp.ride();
		}
	}
}
