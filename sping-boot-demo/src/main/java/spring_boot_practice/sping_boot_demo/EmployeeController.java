package spring_boot_practice.sping_boot_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	List<HourlyEmployees> al = new ArrayList<HourlyEmployees>();
	List<SalariedEmployees> se = new ArrayList<SalariedEmployees>();
	List<Managers> m = new ArrayList<Managers>();


	@GetMapping(path = "/hourlyempdetails")
	public List<HourlyEmployees> getHourlyEmployeeDetails() {
		HourlyEmployees HE1 = new HourlyEmployees("1", "Naresh", 2000.89);
		HE1.Work(100);
		HE1.TakeVacation(1);
		al.add(HE1);

		HourlyEmployees HE2 = new HourlyEmployees("2", "Nick", 3000.89);
		HE2.Work(150);
		HE2.TakeVacation(2);
		al.add(HE2);

		HourlyEmployees HE3 = new HourlyEmployees("3", "Suresh", 1000.89);
		HE3.Work(200);
		HE3.TakeVacation(3);
		al.add(HE3);

		HourlyEmployees HE4 = new HourlyEmployees("4", "Ramesh", 2900.89);
		HE4.Work(260);
		HE4.TakeVacation(1);
		al.add(HE4);

		HourlyEmployees HE5 = new HourlyEmployees("5", "Kiran", 2700.89);
		HE5.Work(50);
		HE5.TakeVacation(1);
		al.add(HE5);

		HourlyEmployees HE6 = new HourlyEmployees("6", "prashant", 2300.89);
		HE6.Work(130);
		HE6.TakeVacation(1);
		al.add(HE6);

		HourlyEmployees HE7 = new HourlyEmployees("7", "ravi",  2100.89);
		HE7.Work(120);
		HE7.TakeVacation(1);
		al.add(HE7);

		HourlyEmployees HE8 = new HourlyEmployees("8", "nagendra",  2400.89);
		HE8.Work(140);
		HE8.TakeVacation(1);
		al.add(HE8);

		HourlyEmployees HE9 = new HourlyEmployees("9", "geetha",  2400.89);
		HE9.Work(160);
		HE9.TakeVacation(2);
		al.add(HE9);

		HourlyEmployees HE10 = new HourlyEmployees("10", "satya",  2030.89);
		HE10.Work(190);
		HE10.TakeVacation(3);
		al.add(HE10);

		return al;

	}

	@GetMapping(path = "/salariedempdetails")
	public List<SalariedEmployees> getSalariedEmployeeDetails() {
		SalariedEmployees SE1 = new SalariedEmployees("1", "Naresh",  2000.89);
		SE1.Work(100);
		SE1.TakeVacation(1);
		se.add(SE1);

		SalariedEmployees SE2 = new SalariedEmployees("2", "Nick", 3000.89);
		SE2.Work(150);
		SE2.TakeVacation(3);
		se.add(SE2);

		SalariedEmployees SE3 = new SalariedEmployees("3", "Suresh", 1000.89);
		SE3.Work(200);
		SE3.TakeVacation(3);
		se.add(SE3);

		SalariedEmployees SE4 = new SalariedEmployees("4", "Ramesh",  2900.89);
		SE4.Work(260);
		SE4.TakeVacation(5);
		se.add(SE4);

		SalariedEmployees SE5 = new SalariedEmployees("5", "Kiran", 2700.89);
		SE5.Work(50);
		SE5.TakeVacation(1);
		se.add(SE5);

		SalariedEmployees SE6 = new SalariedEmployees("6", "prashant", 2300.89);
		SE6.Work(130);
		SE6.TakeVacation(2);
		se.add(SE6);

		SalariedEmployees SE7 = new SalariedEmployees("7", "ravi", 2100.89);
		SE7.Work(120);
		SE7.TakeVacation(3);
		se.add(SE7);

		SalariedEmployees SE8 = new SalariedEmployees("8", "nagendra", 2400.89);
		SE8.Work(140);
		SE8.TakeVacation(1);
		se.add(SE8);

		SalariedEmployees SE9 = new SalariedEmployees("9", "geetha",  2400.89);
		SE9.Work(160);
		SE9.TakeVacation(2);
		se.add(SE9);

		SalariedEmployees SE10 = new SalariedEmployees("10", "satya",  2030.89);
		SE10.Work(190);
		SE10.TakeVacation(2);
		se.add(SE10);

		return se;

	}
	
	@GetMapping(path = "/managersdetails")
	public List<Managers> getManagersDetails() {
		Managers M1 = new Managers("1", "Naresh", 0, 2000.89);
		M1.Work(100);
		M1.TakeVacation(4);
		m.add(M1);

		Managers M2 = new Managers("2", "Nick", 0, 3000.89);
		M2.Work(150);
		M2.TakeVacation(4);
		m.add(M2);

		Managers M3 = new Managers("3", "Suresh", 0, 1000.89);
		M3.Work(200);
		M3.TakeVacation(4);
		m.add(M3);

		Managers M4 = new Managers("4", "Ramesh", 0, 2900.89);
		M4.Work(260);
		M4.TakeVacation(4);
		m.add(M4);

		Managers M5 = new Managers("5", "Kiran", 0, 2700.89);
		M5.Work(50);
		M5.TakeVacation(4);
		m.add(M5);

		Managers M6 = new Managers("6", "prashant", 0, 2300.89);
		M6.Work(130);
		M6.TakeVacation(5);
		m.add(M6);

		Managers M7 = new Managers("7", "ravi", 0, 2100.89);
		M7.Work(120);
		M7.TakeVacation(2);
		m.add(M7);

		Managers M8 = new Managers("8", "nagendra", 0, 2400.89);
		M8.Work(140);
		M8.TakeVacation(1);
		m.add(M8);

		Managers M9 = new Managers("9", "geetha", 0, 2400.89);
		M9.Work(160);
		M9.TakeVacation(3);
		m.add(M9);

		Managers M10 = new Managers("10", "satya", 0, 2030.89);
		M10.Work(190);
		M10.TakeVacation(5);
		m.add(M10);

		return m;

	}
	

}
