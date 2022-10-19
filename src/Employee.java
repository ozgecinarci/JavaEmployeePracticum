import java.util.Scanner;
public class Employee {
	private String name;
	private float salary ;
	private float  workHours ;
	private int hireYear;
	
	public Employee (String name,float salary,float workHours, int hireYear){
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
			float bonus= (workHours-40)*30*4;
			System.out.println("Aylýk Bonus: "+ bonus);
		}
	}
	

	public void raiseSalary(){
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Ýsim Bilgisi Girin: ");
		String isim= scan.nextLine();
		System.out.println("Maaþ bilgisi girin: ");
		float salary= scan.nextFloat();
		System.out.println("Ýþe Baþlama Yýlý: ");
		int hireYear= scan.nextInt();
		System.out.println("Haftalýk Çalýþma saati: ");
		float workHours= scan.nextFloat();
		
		
		
		int nowYear=2021;
		if(nowYear-hireYear<10){
			if(salary>1000){
				if(workHours>40){
				double zambonusvergi=((((salary*105)/100)+((workHours-40)*30*4))*97)/100;
				System.out.println("Ýsim: "+isim);
				System.out.println("Zamsýz maaþ:"+salary);
				System.out.println("%5 Zamlý maaþ:"+ salary*105/100 );
				System.out.println("%5 Zamlý+Bonuslu maaþ: "+(((salary*105)/100)+((workHours-40)*30*4)));
				System.out.println("%5 Zamlý+Bonuslu maaþ üzerine %3 vergi uygulanmýþ maaþ: "+ zambonusvergi);
				}
				else{
					float zambonusvergi=(((salary*105)/100)*97)/100;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ: "+salary);
					System.out.println("%5 Zamlý maaþ: "+ ((salary*105)/100) );
					System.out.println("%5 Zam üzerine %3 vergi uygulanmýþ maaþ: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){
					
					float zambonusvergi=(salary*105)/100 + (workHours-40)*30*4;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ: "+salary);
					System.out.println("%5 Zamlý maaþ: "+salary*105/100);
					System.out.println("%5 Zamlý+bonuslu maaþ"+ zambonusvergi);
					
				}
				else{
					float zambonusvergi=(salary*105)/100;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ:" +salary);
					System.out.println("%5 Zamlý maaþ:" +zambonusvergi);
				}
			}
		}
		
		
		
		
		else if((nowYear-hireYear)>9 && (nowYear-hireYear)<20 ){
			if(salary>1000){
				if(workHours>40){
				float zambonusvergi=(((salary*110)/100)+((workHours-40)*30*4)) *97/100 ;
				System.out.println("Ýsim: "+isim);
				System.out.println("Zamsýz maaþ:"+salary);
				System.out.println("%10 Zamlý maaþ:"+ salary*105/100 );
				System.out.println("%10 Zamlý+Bonuslu maaþ: "+(salary*110/100)+ ((workHours-40)*30*4)) ;
				System.out.println("%10 Zamlý+Bonuslu maaþ üzerine %3 vergi uygulanmýþ maaþ: "+ zambonusvergi);
				
				}
				else{
					float zambonusvergi=(((salary*110)/100)*97)/100;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ: "+salary);
					System.out.println("%10 Zamlý maaþ: "+ ((salary*110)/100) );
					System.out.println("%10 Zam üzerine %3 vergi uygulanmýþ maaþ: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){ 
					float zambonusvergi=(salary*110)/100 + (workHours-40)*30*4;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ: "+salary);
					System.out.println("%10 Zamlý maaþ: "+salary*110/100);
					System.out.println("%10 Zamlý+bonuslu maaþ"+ zambonusvergi);
					
				}
				else{
					float zambonusvergi=(salary*110)/100;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ:" +salary);
					System.out.println("%10 Zamlý maaþ:" +zambonusvergi);
				}
			}
			
				
		}
		else if((nowYear-hireYear)>19){
			if(salary>1000){
				if(workHours>40){
					float zambonusvergi=(((salary*115)/100)+((workHours-40)*30*4)) *97/100 ;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ:"+salary);
					System.out.println("%15 Zamlý maaþ:"+ salary*115/100 );
					System.out.println("%15 Zamlý+Bonuslu maaþ: "+(salary*115/100)+ ((workHours-40)*30*4)) ;
					System.out.println("%15 Zamlý+Bonuslu maaþ üzerine %3 vergi uygulanmýþ maaþ: "+ zambonusvergi);
				}
				else{
					float zambonusvergi=(((salary*115)/100)*97)/100;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ: "+salary);
					System.out.println("%15 Zamlý maaþ: "+ ((salary*115)/100) );
					System.out.println("%15 Zam üzerine %3 vergi uygulanmýþ maaþ: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){
					float zambonusvergi=(salary*115)/100 + (workHours-40)*30*4;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ: "+salary);
					System.out.println("%15 Zamlý maaþ: "+salary*115/100);
					System.out.println("%15 Zamlý+bonuslu maaþ:"+ zambonusvergi);
				}
				else{
					float zambonusvergi=(salary*115)/100;
					System.out.println("Ýsim: "+isim);
					System.out.println("Zamsýz maaþ:" +salary);
					System.out.println("%15 Zamlý maaþ:" +zambonusvergi);
				}
			}
			
		}
	}
	
}
