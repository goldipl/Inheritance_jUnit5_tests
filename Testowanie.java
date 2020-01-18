package pl.edu.pw.ii.pte.junit.inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testowanie {

private Manager boss;

@BeforeEach
public void setup() {
	boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
}

@Test
public void Test1() {
	boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
	Manager boss2 = new Manager("Adam Cracker", 50000, 1997, 10, 05);
	assertTrue(!boss.equals(boss2));
}

@Test
public void TestName() {
	assertEquals("Carl Cracker", boss.getName());
}

@Test
public void TestSalary() {
	double salary = 80000;
	assertEquals(boss.getSalary(), salary);
}

@Test
public void TestCalendar() {
	GregorianCalendar calendar = new GregorianCalendar(1987, 12 - 1, 15);
	Date hireDay = calendar.getTime();
	assertEquals(boss.getHireDay(), hireDay);
}

@Test
public void TestBonus() {
	double expectedSalary = 81000;
	boss.setBonus(1000);
	assertEquals(expectedSalary, boss.getSalary());
}

@Test
public void TestRaiseSalary() {
	double expectedSalary = 88000;
	boss.raiseSalary(10);
	assertEquals(expectedSalary, boss.getSalary());
}

}