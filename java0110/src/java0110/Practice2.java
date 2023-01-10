package java0110;

public class Practice2 {

	int sum(int ... values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	double avg(int ... values) {
		double result = 0;
		result = this.sum(values);
		result /= values.length;
		
		return result;
	}


}
