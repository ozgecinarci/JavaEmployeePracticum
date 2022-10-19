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
			System.out.println("Ayl�k Bonus: "+ bonus);
		}
	}
	

	public void raiseSalary(){
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("�sim Bilgisi Girin: ");
		String isim= scan.nextLine();
		System.out.println("Maa� bilgisi girin: ");
		float salary= scan.nextFloat();
		System.out.println("��e Ba�lama Y�l�: ");
		int hireYear= scan.nextInt();
		System.out.println("Haftal�k �al��ma saati: ");
		float workHours= scan.nextFloat();
		
		
		
		int nowYear=2021;
		if(nowYear-hireYear<10){
			if(salary>1000){
				if(workHours>40){
				double zambonusvergi=((((salary*105)/100)+((workHours-40)*30*4))*97)/100;
				System.out.println("�sim: "+isim);
				System.out.println("Zams�z maa�:"+salary);
				System.out.println("%5 Zaml� maa�:"+ salary*105/100 );
				System.out.println("%5 Zaml�+Bonuslu maa�: "+(((salary*105)/100)+((workHours-40)*30*4)));
				System.out.println("%5 Zaml�+Bonuslu maa� �zerine %3 vergi uygulanm�� maa�: "+ zambonusvergi);
				}
				else{
					float zambonusvergi=(((salary*105)/100)*97)/100;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�: "+salary);
					System.out.println("%5 Zaml� maa�: "+ ((salary*105)/100) );
					System.out.println("%5 Zam �zerine %3 vergi uygulanm�� maa�: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){
					
					float zambonusvergi=(salary*105)/100 + (workHours-40)*30*4;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�: "+salary);
					System.out.println("%5 Zaml� maa�: "+salary*105/100);
					System.out.println("%5 Zaml�+bonuslu maa�"+ zambonusvergi);
					
				}
				else{
					float zambonusvergi=(salary*105)/100;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:" +salary);
					System.out.println("%5 Zaml� maa�:" +zambonusvergi);
				}
			}
		}
		
		
		
		
		else if((nowYear-hireYear)>9 && (nowYear-hireYear)<20 ){
			if(salary>1000){
				if(workHours>40){
				float zambonusvergi=(((salary*110)/100)+((workHours-40)*30*4)) *97/100 ;
				System.out.println("�sim: "+isim);
				System.out.println("Zams�z maa�:"+salary);
				System.out.println("%10 Zaml� maa�:"+ salary*105/100 );
				System.out.println("%10 Zaml�+Bonuslu maa�: "+(salary*110/100)+ ((workHours-40)*30*4)) ;
				System.out.println("%10 Zaml�+Bonuslu maa� �zerine %3 vergi uygulanm�� maa�: "+ zambonusvergi);
				
				}
				else{
					float zambonusvergi=(((salary*110)/100)*97)/100;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�: "+salary);
					System.out.println("%10 Zaml� maa�: "+ ((salary*110)/100) );
					System.out.println("%10 Zam �zerine %3 vergi uygulanm�� maa�: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){ 
					float zambonusvergi=(salary*110)/100 + (workHours-40)*30*4;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�: "+salary);
					System.out.println("%10 Zaml� maa�: "+salary*110/100);
					System.out.println("%10 Zaml�+bonuslu maa�"+ zambonusvergi);
					
				}
				else{
					float zambonusvergi=(salary*110)/100;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:" +salary);
					System.out.println("%10 Zaml� maa�:" +zambonusvergi);
				}
			}
			
				
		}
		else if((nowYear-hireYear)>19){
			if(salary>1000){
				if(workHours>40){
					float zambonusvergi=(((salary*115)/100)+((workHours-40)*30*4)) *97/100 ;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("%15 Zaml� maa�:"+ salary*115/100 );
					System.out.println("%15 Zaml�+Bonuslu maa�: "+(salary*115/100)+ ((workHours-40)*30*4)) ;
					System.out.println("%15 Zaml�+Bonuslu maa� �zerine %3 vergi uygulanm�� maa�: "+ zambonusvergi);
				}
				else{
					float zambonusvergi=(((salary*115)/100)*97)/100;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�: "+salary);
					System.out.println("%15 Zaml� maa�: "+ ((salary*115)/100) );
					System.out.println("%15 Zam �zerine %3 vergi uygulanm�� maa�: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){
					float zambonusvergi=(salary*115)/100 + (workHours-40)*30*4;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�: "+salary);
					System.out.println("%15 Zaml� maa�: "+salary*115/100);
					System.out.println("%15 Zaml�+bonuslu maa�:"+ zambonusvergi);
				}
				else{
					float zambonusvergi=(salary*115)/100;
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:" +salary);
					System.out.println("%15 Zaml� maa�:" +zambonusvergi);
				}
			}
			
		}
	}
	
}
