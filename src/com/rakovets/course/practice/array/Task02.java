package com.rakovets.course.practice.array;

import com.rakovets.course.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		int countDisciplines = INPUT_SCANNER.nextInt();
		int countSemesters = INPUT_SCANNER.nextInt();
		int[][] marks = nextArray(countDisciplines, countSemesters);

		// Вызов методов
		getAverageMark(marks);
//		getMinMark(marks);
//		getMaxMark(marks);
	}

	/**
	 * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
	 * @param marks отметки
	 * @return средняя арифметическая отметка
	 */
	static double getAverageMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int sumAllMarks = 0;
		int sumAllMarks1 = 0;
		int sumAllMarks2 = 0;
		double result = 0.0;
		for (int i = 0; (i <= (marks.length - 1)); i++) {
			for (int j = 0; (j <= (marks[i].length - 1)); j++) {
				sumAllMarks += marks[i][j];
			}
//				result = (double) Math.round(((sumAllMarks * 100.0) / marks.length)) / 100.0;
//				System.out.println(sumAllMarks);
//			result = (double) Math.round(((sumAllMarks * 100.0) / (marks.length * marks[i].length)) / 100.0);
			result = marks.length * marks[i].length;
			System.out.println(result);
		}


		return result;

	}

	/**
	 * Возвращает минимальную отметку за весь период обучения.
	 * @param marks отметки
	 * @return минимальная отметка
	 */
	static int getMinMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		return 0;
	}

	/**
	 * Возвращает максимальну отметку за весь период обучения.
	 * @param marks отметки
	 * @return максимальная отметка
	 */
	static int getMaxMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		return 0;
	}

	private static int[][] nextArray(int countDisciplines, int countSemesters) {
		int[][] marks = new int[countDisciplines][countSemesters];
		for (int i = 0; i < countDisciplines; i++) {
			for (int j = 0; j < countSemesters; j++) {
				marks[i][j] = INPUT_SCANNER.nextInt();
			}
		}
		return marks;
	}
}