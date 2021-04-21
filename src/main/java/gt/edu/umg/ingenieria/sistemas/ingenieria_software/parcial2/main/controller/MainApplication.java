package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.main.controller;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.main.service.SortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		SortService sort = new SortService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Que algoritmo de ordenamiento desea utilizar?");
		System.out.println("1- Bubble Sort" +
				           "2- Insertion Sort" +
						   "3- Quick Sort" +
						   "4- Selection Sort" +
						   "5- Shell Sort");
		String option=sc.next();
		sort.sortWords(option);
	}

}
