public int cal(int year, int month, int day){
	int sum = 0;
	for(int i = 0; i < mmonth; i++){
		switch(i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: sum += 31; break;
			case 4:
			case 6:
			case 9:
			case 11: sum += 30; break;
			case 2: if((year%4==0) & (year%100 !=0 ) | (year%400 == 0)) sum += 29; else sum += 28;
		}
	}
	return sum = sum + day;
}