package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Course> course = new HashSet<>();

		System.out.print("How many students for course A ? ");
		int alunoCourseA = sc.nextInt();
		for (int i = 0; i < alunoCourseA; i++) {
			int aluno = sc.nextInt();
			course.add(new Course(aluno));
		}

		System.out.print("How many students for course B ? ");
		int alunoCourseB = sc.nextInt();
		for (int i = 0; i < alunoCourseB; i++) {
			int aluno = sc.nextInt();
			course.add(new Course(aluno));
		}

		System.out.print("How many students for course C ? ");
		int alunoCourseC = sc.nextInt();
		for (int i = 0; i < alunoCourseC; i++) {
			int aluno = sc.nextInt();
			course.add(new Course(aluno));
		}

		sc.close();
		
		System.out.println("Total Students: " + course.size());
	}

}
