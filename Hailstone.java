import java.util.*;

public class Hailstone implements Iterable<Integer> {
 
	private int wartosc;

	public Hailstone(int wartosc) {
		this.wartosc = wartosc;
	}
	
	class MyIterator implements Iterator<Integer> {

		@Override
		public boolean hasNext() {
			
			if(wartosc != 1) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		int flag = 0;

		@Override
		public Integer next() {
			
			if(flag == 0) {
				flag ++;
				return wartosc;
			}
			
			if(wartosc % 2 == 0) {
				wartosc = wartosc/2;
				return wartosc;
			}
			else {
				wartosc = 3 * wartosc + 1;
				return wartosc;
			}
			
		}
	}
	
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new MyIterator();
	}
	
	
}
