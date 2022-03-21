import java.util.ArrayList;
import java.util.List;

public class Ed01 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		lista.add(10);
		lista.add(20);
		lista.add(30);
for(int i = 0; i		<lista.size(); i++) {		
			System.out.println(lista.get(i));
		}
	}
}