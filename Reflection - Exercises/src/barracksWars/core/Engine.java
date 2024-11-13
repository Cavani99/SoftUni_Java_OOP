package barracksWars.core;

import barracksWars.interfaces.*;
import barracksWars.interfaces.Runnable;
import jdk.jshell.spi.ExecutionControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String result = interpretCommand(data);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException | ExecutionControl.NotImplementedException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpretCommand(String[] data) throws ExecutionControl.NotImplementedException {
		String result = "";
		String commandName = Character.toUpperCase(data[0].charAt(0)) + data[0].substring(1);

		try {
			Class<? extends Executable> commandClass =
					(Class<? extends Executable>) Class.forName("barracksWars.core.commands." + commandName);
			Constructor<? extends Executable> constructor = commandClass
					.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
			constructor.setAccessible(true);
			Executable executable = (Executable) constructor
					.newInstance(data, this.repository, this.unitFactory);
			result = executable.execute();
		} catch (ClassNotFoundException |
				 NoSuchMethodException |
				 InstantiationException |
				 IllegalAccessException |
				 InvocationTargetException e) {
			e.printStackTrace();
		}
        return result;
	}
}
