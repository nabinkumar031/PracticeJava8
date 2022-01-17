import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNoProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		numList.stream().filter(n -> n > 1 &&
				IntStream.range(2, n).noneMatch(i -> n % i == 0)).forEach(System.out::println);
		
	}
	
	

}
