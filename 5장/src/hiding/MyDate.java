package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean isvaild;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public void setDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public MyDate(int pday,int pmonth, int pyear) {
		day=pday;
		month=pmonth;
		year=pyear;		
	}
	
	public boolean isVaild() {
		if(month==1 || month==3||month==5||month==7||month==8||month==10||month==12) {
			if(day>=1 && day<=31) {
				System.out.println("유효한 날짜입니다.");
			}
			else
				System.out.println("유효하지 않은날짜입니다.");	
		}
		else if(month==4 || month==6||month==9||month==11) {
			if(day>=1 && day<=30) {
				System.out.println("유효한 날짜입니다.");
			}
			else
				System.out.println("유효하지 않은날짜입니다.");	
		}
		else if(month==2) {
			if(day>=1 && day<=28) {
				System.out.println("유효한 날짜입니다.");
			}
			else
				System.out.println("유효하지 않은날짜입니다.");
		}
		return isvaild;
	}
}
