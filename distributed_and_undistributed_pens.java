class distributed_and_undistributed_pens{
	public static void main(Static[] args){
		int pens = 14;
		int students = 3;
		int non-distributedpens = (pens % students);
		int distributedpens = pens - non-distributedpens;
		int penperperson = distributedpens/students;
		 
		System.out.println("The Pen Per Student is" + penperperson + "and the remaining pen not distributed is"  + non-distributedpens);
	}
}

		
		
	