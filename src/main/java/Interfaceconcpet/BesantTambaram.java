package Interfaceconcpet;

import Inheritance.BesantBaseBranch;
import Inheritance.Besantannanagar;


public class BesantTambaram extends Besantannanagar implements Interface1,Interface2{

	int totalCourse =2;

	BesantBaseBranch b = new BesantBaseBranch();

	@Override
	public void Fees() {
		System.out.println(b.BaseBranchName);
		// TODO Auto-generated method stub
		int feesamount = 10000;
		int totalFees =feesamount* totalCourse;
		System.out.println(totalFees);
	}

	@Override
	public void Course() {
		// TODO Auto-generated method stub
		String[] allCourses = {"python","C#","Testing","SQL"};

		for(String eachvalue : allCourses)
		{
			System.out.println(eachvalue);
		}
	}

	@Override
	public void holiday() {
		// TODO Auto-generated method stub
		String[] HolidayList = {"Pongal","New Year","Christmas"};
		for(String eachvalue : HolidayList)
		{
			System.out.println(eachvalue);
		}
	}

	@Override
	public void Gender() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 B = new BesantTambaram();
		B.Fees();
		BesantTambaram B1= new BesantTambaram();
		B1.GetCourseExist("SQL");
	}





}
