package in.mahesh.service;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import in.mahesh.entity.Student;
import in.mahesh.repo.CustomRepo;
@Service
public class CustomService {
	private CustomRepo customRepo;

	public CustomService(CustomRepo customRepo) {
		super();
		this.customRepo = customRepo;
	}
	
	public void studentSave() {
		Student s1=new Student("Rajesh","RajeshF",LocalDate.of(2000, 1, 1));
		Student s2=new Student("Balu","BaluF",LocalDate.of(2000, 2, 3));
		Student s3=new Student("kawshik","KawshikF",LocalDate.of(2000, 2, 3));
		customRepo.saveAll(Arrays.asList(s1,s2,s3));
		System.out.println("Sucessfully......");
		
	}

}
