package com.daeyun.app;

import com.daeyun.app.entity.*;
import com.daeyun.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;


	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("홍길동", "데이터 분석", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("이대윤", "anonymous", "anonymous", "anonymous"));
		interestsRepository.save(new Interests("이대윤"));
		skillRepository.save(new Skill("이대윤",24));
		workRepository.save(new Work("백엔드","이대윤주식회사", "12","ㅎㅎ"));

	}



	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
