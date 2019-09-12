package prog2;

import java.util.ArrayList;

public class rekrusivMetod {

	public static void main(String[] args) {
		String Sjalvaordet = "Hussein";
		String res = metoden(Sjalvaordet, Sjalvaordet.length() - 1, new ArrayList<String>());
		System.out.println(res);
	}

	public static String metoden(String ordet, int index, ArrayList<String> lista) {
		String res = "";

		String letter = "";
		lista.add(String.valueOf(ordet.charAt(index)));

		if (index != 0) {

			metoden(ordet, --index, lista);
		}

		for (String l : lista)
			res += l;

		return res;

	}
}
