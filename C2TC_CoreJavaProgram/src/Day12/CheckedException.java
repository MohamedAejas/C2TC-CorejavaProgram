package Day12;

public class CheckedException {
	static String acceptText() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter the string: ");
			String str = br.readLine();
			// br.close(); The BufferedReader will be closed automatically when the try
			// block is exited, regardless of whether an exception is thrown or not.
			return str;
		}
	}
}

