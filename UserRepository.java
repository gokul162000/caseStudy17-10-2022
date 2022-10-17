package com.gl.CaseStudyNew.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.CaseStudyNew.bean.MyUser;



@Repository
public interface UserRepository extends JpaRepository<MyUser, String> {
	Optional<MyUser> findUserByUsername(String username);

}
