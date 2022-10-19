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
				double zambonusvergi=(((salary-salary*0.03)+((workHours-40)*30))+salary*0.05);
				System.out.println("�sim: "+isim);
				System.out.println("Zams�z maa�:"+salary);
				System.out.println("�al��ma saati: "+workHours);
				System.out.println("��e ba�lang�� y�l�: "+hireYear);
				System.out.println("Vergi: "+ salary*0.03);
				System.out.println("Bonus: "+ ((workHours-40)*30));
				System.out.println("Maa� art���: "+ salary*0.05);
				System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary-salary*0.03+((workHours-40)*30)));
				System.out.println("Toplam maa�: "+zambonusvergi);
			}
				else{
					double zambonusvergi=((salary-salary*0.03)+ (salary*105)/100);
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ salary*0.03);
					System.out.println("Bonus:"+0.0);
					System.out.println("Maa� art���: "+ salary*0.05);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary-salary*0.03));
					System.out.println("Toplam maa�: "+zambonusvergi);
					
				}
			}
			if(salary<1000){
				if (workHours>40){
					double zambonusvergi=((salary + salary*0.05)+ (workHours-40)*30);
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ 0.0);
					System.out.println("Bonus: "+ ((workHours-40)*30));
					System.out.println("Maa� art���: "+ salary*0.05);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary +((workHours-40)*30)));
					System.out.println("Toplam maa�: "+zambonusvergi);
	
					
				}
				else{
					double zambonusvergi=((salary + salary*0.05));
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ 0.0);
					System.out.println("Bonus: "+ 0.0);
					System.out.println("Maa� art���: "+ salary*0.05);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ salary);
					System.out.println("Toplam maa�: "+zambonusvergi);
	
				}
			}
		}
		
		
		
		
		else if((nowYear-hireYear)>9 && (nowYear-hireYear)<20 ){
			if(salary>1000){
				if(workHours>40){
					double zambonusvergi=(((salary-salary*0.03)+((workHours-40)*30))+salary*0.10);
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ salary*0.03);
					System.out.println("Bonus: "+ ((workHours-40)*30));
					System.out.println("Maa� art���: "+ salary*0.10);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary-salary*0.03+((workHours-40)*30)));
					System.out.println("Toplam maa�: "+zambonusvergi);
				}
				else{
					double zambonusvergi=((salary-salary*0.03)+ (salary*0.10));
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ salary*0.03);
					System.out.println("Bonus:"+0.0);
					System.out.println("Maa� art���: "+ salary*0.10);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary-salary*0.03));
					System.out.println("Toplam maa�: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){ 
					double zambonusvergi=((salary + salary*0.10)+ (workHours-40)*30);
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ 0.0);
					System.out.println("Bonus: "+ ((workHours-40)*30));
					System.out.println("Maa� art���: "+ salary*0.10);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary+((workHours-40)*30)));
					System.out.println("Toplam maa�: "+zambonusvergi);
	
					
				}
				else{
					double zambonusvergi=((salary + salary*0.10));
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ 0.0);
					System.out.println("Bonus: "+ 0.0);
					System.out.println("Maa� art���: "+ salary*0.10);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ salary);
					System.out.println("Toplam maa�: "+zambonusvergi);
				}
			}
			
				
		}
		else if((nowYear-hireYear)>19){
			if(salary>1000){
				if(workHours>40){
					double zambonusvergi=(((salary-salary*0.03)+((workHours-40)*30))+salary*0.15);
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ salary*0.03);
					System.out.println("Bonus: "+ ((workHours-40)*30));
					System.out.println("Maa� art���: "+ salary*0.15);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary-salary*0.03+((workHours-40)*30)));
					System.out.println("Toplam maa�: "+zambonusvergi);
				}
				else{
					double zambonusvergi=((salary-salary*0.03)+ (salary*0.15));
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ salary*0.03);
					System.out.println("Bonus:"+0.0);
					System.out.println("Maa� art���: "+ salary*0.15);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary-salary*0.03));
					System.out.println("Toplam maa�: "+zambonusvergi);
				}
			}
			if(salary<1000){
				if (workHours>40){
					double zambonusvergi=((salary + salary*0.15)+ (workHours-40)*30);
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ 0.0);
					System.out.println("Bonus: "+ ((workHours-40)*30));
					System.out.println("Maa� art���: "+ salary*0.15);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ (salary+((workHours-40)*30)));
					System.out.println("Toplam maa�: "+zambonusvergi);
				}
				else{
					double zambonusvergi=((salary + salary*0.15));
					System.out.println("�sim: "+isim);
					System.out.println("Zams�z maa�:"+salary);
					System.out.println("�al��ma saati: "+workHours);
					System.out.println("��e ba�lang�� y�l�: "+hireYear);
					System.out.println("Vergi: "+ 0.0);
					System.out.println("Bonus: "+ 0.0);
					System.out.println("Maa� art���: "+ salary*0.15);
					System.out.println("Vergi ve bonuslar ile birlikte maa�: "+ salary);
					System.out.println("Toplam maa�: "+zambonusvergi);
				}
			}
			
		}
	}
	
}
