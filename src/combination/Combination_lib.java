package combination;

public class Combination_lib {
	
public int getFactorial(int n) { //nの階乗
	int f = 1;
	for(int i = 0; i < n; i++) {
		f = f * (n - i);
	}
	return f;
}

}
