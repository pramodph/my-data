package Examples;

public class CountValley {

	public static void main(String[] args) {
		int steps = 8;
		String path = "UDDDUDUU";
		int valleyCount = 0;
		int level = 0;

		for (int i = 0; i < steps; i++) {
			char step = path.charAt(i);
			switch (step) {
				case 'U':
					level++;
					if (level == 0) {
						valleyCount++;
					}
					break;
				case 'D':
					level--;
					break;
			}
		}

		System.out.println("Number of valleys: " + valleyCount);
		System.out.println("Final level: " + level);
		System.out.println("Final path: " + path);
		System.out.println("Steps: " + steps);
	}

}
