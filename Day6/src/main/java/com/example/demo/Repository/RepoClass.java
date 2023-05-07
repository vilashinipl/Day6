package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ChildrenDetails;

public interface RepoClass extends JpaRepository<ChildrenDetails,Integer>{

}
