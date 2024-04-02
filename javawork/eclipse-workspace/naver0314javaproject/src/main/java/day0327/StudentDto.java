package day0327;

public class StudentDto {
	private String name;
	private int age;
	private int java;
	private int spring;
	private int html;
	//디폴트 생성자
	public StudentDto(){		
	}
	//매개변수가 있는 생성자
	public StudentDto(String name, String age2, String java2, String spring2, String html2) {
		this.name = name;
		this.age = Integer.parseInt(age2);
		this.java = Integer.parseInt(age2);
		this.spring = Integer.parseInt(java2);
		this.html = Integer.parseInt(html2);
	}
	//setter&getter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	

	//java+spring+html의 합을 반환하는메서드(getTotal)
	public int getTotal(int java,int spring,int html) {
		return java+spring+html;
	}
	

	//getTotal()/3.0으로 나눠서 반환하는 메서드
	public double getAvg(int java,int spring,int html) {
		int total=getTotal(this.java,this.spring,this.html);
		return total/3.0;
		
	}
	
	//getAvg() 의 값이 90이상이면 "*****", 80 이상이면 "****", 70이상이면 "***",나머지는 "*"
	//반환하는 메서드 (getGrade)
	
	public String getGrade(int java,int spring,int html) {
		double avg=getAvg(this.java,this.spring,this.html);
		String grade="";
		grade=(avg>=90)?"*****":
			   (avg>=80)?"****":
				(avg>=70)?"***":
					"*";
		return grade;
	}
	
}
