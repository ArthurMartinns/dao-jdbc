package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findById(1);
		System.out.print(dep);

		Department dep2 = departmentDao.findById(2);
		dep.setName("Tamo ai");
		departmentDao.update(dep2);
		System.out.println("Updated!");
		
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
	}

}
