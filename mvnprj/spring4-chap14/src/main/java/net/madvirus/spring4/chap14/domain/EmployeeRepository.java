package net.madvirus.spring4.chap14.domain;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;

public interface EmployeeRepository extends Repository<Employee, Long> {
	public Employee save(Employee emp);
	public Employee findOne(Long id);
	public Iterable<Employee> findByBirthYear(int year);
	public Iterable<Employee> findByNameLike(String name);
	public Iterable<Employee> findByNameStartingWith(String name);
	public Iterable<Employee> findByNameEndingWith(String name);
	public Iterable<Employee> findByNameContaining(String string);
	
	public List<Employee> findByNameStartingWithOrderByNameAsc(String name);
	public List<Employee> findByTeamIdOrderByIdDesc(Long teamId);
	public List<Employee> findByBirthYearOrderByTeamNameAscNameAsc(int year);

	public long count();
	public long countByTeamId(Long teamId);
	
	public List<Employee> findAll(Sort sort);
	public List<Employee> findByTeam(Team team, Sort sort);
	
	public List<Employee> findByBirthYearLessThan(int birthYear, Pageable pageable);
	
	public List<Employee> findByTeamId(Long teamId, Pageable pageable);
	public Page<Employee> findByTeam(Team team, Pageable pageable);
	
	public Employee findByEmployeeNumber(String empNum);
	public Employee findByName(String name);
	public Employee findByBirthYearGreaterThan(int birthYear);
	
	public Iterable<Employee> findByTeamIdOrderByNameDesc(Long teamId, Sort sort);
	
}
