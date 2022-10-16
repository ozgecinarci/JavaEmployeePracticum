
public class Employee {
	private String name;
	private float salary ;
	private float  workHours ;
	private int hireYear;
	
	public Employee (String name,float salary,int workHours, int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	
	
	public void tax(){
		if(salary>1000){
			double tax= 0.03;
			System.out.println("Tax: "+ tax);
		}
		else if (salary<1000){
		 int tax=0;
		 System.out.println("Tax: "+tax);
		}
	}
	
	public void bonus(){
		if(workHours>40){
			float bonus= (workHours-40)*30;
			System.out.println("Bonus: "+ bonus);
		}
	}
	public void raiseSalary(){
		int nowYear=2021;
		if(nowYear-hireYear<10){
			if(salary>1000){
				if(workHours>40){
				salary=(((salary*97)/100)*105)/100 + (workHours-40)*30;
				System.out.println(salary);
				}
				else{
					salary=(((salary*97)/100)*105)/100;
					System.out.println(salary);
				}
			}
			if(salary<1000){
				if (workHours>40){
					salary=(salary*105)/100 + (workHours-40)*30;
					System.out.println(salary);
				}
				else{
					salary=(salary*105)/100;
					System.out.println(salary);
				}
			}
		}
		
		
		
		
		else if((nowYear-hireYear)>9 && (nowYear-hireYear)<20 ){
			if(salary>1000){
				if(workHours>40){
				salary=(((salary*97)/100)*110)/100 + (workHours-40)*30;
				System.out.println(salary);
				}
				else{
					salary=(((salary*97)/100)*110)/100;
					System.out.println(salary);
				}
			}
			if(salary<1000){
				if (workHours>40){ 
					salary=(salary*110)/100 + (workHours-40)*30;
					System.out.println(salary);
				}
				else{
					salary=(salary*110)/100;
					System.out.println(salary);
				}
			}
			
			
			
			
			
			
		}
		else if((nowYear-hireYear)>19){
			if(salary>1000){
				if(workHours>40){
				salary=(((salary*97)/100)*115)/100 + (workHours-40)*30;
				System.out.println(salary);
				}
				else{
					salary=(((salary*97)/100)*115)/100;
					System.out.println(salary);
				}
			}
			if(salary<1000){
				if (workHours>40){
					salary=(salary*115)/100 + (workHours-40)*30;
					System.out.println(salary);
				}
				else{
					salary=(salary*115)/100;
					System.out.println("Maaþ: "+salary);
				}
			}
			
		}
		
	}
	

	
	public void showInformations(){
		System.out.println("Bilgiler...");
		System.out.println("Ýsim: "+this.name);
		System.out.println("Çalýþma Saati: "+this.workHours);
		System.out.println("Ýþe baþladýðý yýl: "+this.hireYear);
	
	
		
	}
	
	
	
	

}
