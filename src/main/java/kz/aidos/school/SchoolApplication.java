package kz.aidos.school;

import kz.aidos.school.model.Pupil;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Pupil.class)
@MapperScan("kz.aidos.school.mapper.UsersMapper")
@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

}
