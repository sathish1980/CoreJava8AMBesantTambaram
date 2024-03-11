package Inheritance;

public class BesantTambaramInvoice extends BesantTambaram{

	public void GetInvoice()
	{
		System.out.println("Your invoice is ready");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantTambaramInvoice B = new BesantTambaramInvoice();
		System.out.println(B.BranchName);
		System.out.println("Base Branch NAme is : "+B.BaseBranchName);
		B.GetCourseExist("Java");
		B.GetInvoice();

	}

}
