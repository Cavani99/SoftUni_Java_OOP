package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String modifier = scanner.nextLine();
		while (!modifier.equals("HARVEST")){
			Field [] fields = RichSoilLand.class.getDeclaredFields();

			Field[] getFields;
			switch (modifier) {
				case "private":
					getFields =  Arrays.stream(fields)
							.filter(m -> Modifier.isPrivate(m.getModifiers()))
							.toArray(Field[]::new);
					break;
				case "protected":
					getFields =  Arrays.stream(fields)
							.filter(m -> Modifier.isProtected(m.getModifiers()))
							.toArray(Field[]::new);
					break;
				case "public":
					getFields =  Arrays.stream(fields)
							.filter(m -> Modifier.isPublic(m.getModifiers()))
							.toArray(Field[]::new);
					break;
				default:
					getFields =  Arrays.stream(fields).toArray(Field[]::new);
					break;
			}

			Arrays.stream(getFields).forEach(m ->
					System.out.printf("%s %s %s\n", Modifier.toString(m.getModifiers()), m.getType().getSimpleName(), m.getName()));

			modifier = scanner.nextLine();
		}
	}
}
