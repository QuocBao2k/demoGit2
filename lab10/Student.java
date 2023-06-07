class Student{
	private String name;
	private String address;
	private String sex;
	private double score;
	 public Student(String name, String address,String sex,double score){
		 this.name=name;
		 this.address=address;
		 this.sex=sex;
		 this.score=score;
	 }
	static class StudentOperator{
		public String type(){
			if(score>8){
				return "A";
			}
			else if(score >= 5){
				return "B";
			}
			else{
				return "C";
			}
		}
		
		public String print(){
			return "Student ["+name+","+address+","+sex+","+score+"]";
		}
	}
}