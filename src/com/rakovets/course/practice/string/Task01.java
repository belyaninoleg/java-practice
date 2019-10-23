package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для парсера полного имени сотрудника компании.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
	/**
	 * Запрашивает ввод данных от пользователя и вызывает все методы класса для этих данных.
	 */
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		System.out.println("Enter full name with format: 'Name Surname'");
		String text = INPUT_SCANNER.nextLine();

		// Вызов методов
		System.out.println(getName(text));
		System.out.println(getSurname(text));
		System.out.println(reverseFullName(text));
	}

	/**
	 * Возвращает имя сотрудника.
	 * @param fullName полное имя сотрудника в формате '${name} ${surname}'
	 * @return имя сотрудника
	 */
	static String getName(String fullName) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int end = fullName.indexOf(" ");
		String firstName = fullName.substring(0,end);
		return firstName;
	}

	/**
	 * Возвращает фамилию сотрудника.
	 * @param fullName полное имя сотрудника в формате '${name} ${surname}'
	 * @return фамилия сотрудника
	 */
	static String getSurname(String fullName) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int start = (fullName.indexOf(" ") + 1);
		int end = fullName.length();
		String surName = fullName.substring(start,end);
//		System.out.println(surName);
		return surName;
	}

	/**
	 * Возвращает полное имя сотрудника в обратном формате.
	 * @param fullName полное имя сотрудника в формате '${name} ${surname}'
	 * @return полное имя сотрудника в обратном формате
	 */
	static String reverseFullName(String fullName) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int end = fullName.indexOf(" ");
		String firstName = fullName.substring(0,end);

		int start = (fullName.indexOf(" ") + 1);
		int end2 = fullName.length();
		String surName = fullName.substring(start,end2);

		String reverseName = String.join(" ", surName, firstName);

		return reverseName;
	}
}