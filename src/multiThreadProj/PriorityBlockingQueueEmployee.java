package multiThreadProj;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueEmployee {
	static PriorityBlockingQueue<Employee> employeePrirBlocQueue = new PriorityBlockingQueue<>();

	public static void main(String[] args) {
		employeePrirBlocQueue.add(new Employee(1L, "AAA", LocalDate.now()));
		employeePrirBlocQueue.add(new Employee(5L, "EEE", LocalDate.now()));
		employeePrirBlocQueue.add(new Employee(2L, "BBB", LocalDate.now()));
		employeePrirBlocQueue.add(new Employee(4L, "DDD", LocalDate.now()));
		employeePrirBlocQueue.add(new Employee(3L, "CCC", LocalDate.now()));
		employeePrirBlocQueue.add(new Employee(6L, "FFF", LocalDate.now()));

		while (true) {
			Employee e = employeePrirBlocQueue.poll();
			System.out.println("Employee :" + e);

			if (e == null) break;
		}

		Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
		PriorityBlockingQueue<Employee> employeeByNamePrirBlocQueue = new PriorityBlockingQueue<>(11, nameComparator);
		employeeByNamePrirBlocQueue.add(new Employee(1L, "AAA", LocalDate.now()));
		employeeByNamePrirBlocQueue.add(new Employee(5L, "EEE", LocalDate.now()));
		employeeByNamePrirBlocQueue.add(new Employee(3L, "BBB", LocalDate.now()));
		employeeByNamePrirBlocQueue.add(new Employee(4L, "DDD", LocalDate.now()));
		employeeByNamePrirBlocQueue.add(new Employee(2L, "CCC", LocalDate.now()));
		employeeByNamePrirBlocQueue.add(new Employee(6L, "FFF", LocalDate.now()));

		while (true) {
			Employee e1 = employeeByNamePrirBlocQueue.poll();
			System.out.println("Employee :" + e1);

			if (e1 == null) break;
		}

	}

}
