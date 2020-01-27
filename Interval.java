class Interval{

	int start,end; 
	Interval(int start, int end) { 
		if(start<end){
			this.start=start; 
			this.end=end; 
		}else{
			this.start=end; 
			this.end=start;
		}	
	} 
}