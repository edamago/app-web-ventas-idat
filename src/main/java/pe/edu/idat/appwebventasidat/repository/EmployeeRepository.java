package pe.edu.idat.appwebventasidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.appwebventasidat.model.bd.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
