package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ChildrenDetails;
import com.example.demo.Repository.RepoClass;

@Service
public class ServiceDetails {
	@Autowired 
	RepoClass s_repo;
	public String adddetails(ChildrenDetails stu)
	{
		s_repo.save(stu);
		return "Welcome to REST API";
	}
	public List<ChildrenDetails> getdetails()
	{
		return s_repo.findAll();
	}
	public Optional<ChildrenDetails> getdetailsById(int id)
	{
		return s_repo.findById(id);
	}
	public String updateSS(ChildrenDetails stu)
	{
		s_repo.save(stu);
		return "Updated!";
	}
	public String deleteByRequestParamId(int id)
	{
		s_repo.deleteById(id);
		return "Deleted!";
	}
	//sorting
	public List<ChildrenDetails>sort(String field)
	{
		return s_repo.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	//pagination
	public List<ChildrenDetails>paging( int offset,int pagesize)
	{
		Page<ChildrenDetails> page=s_repo.findAll(PageRequest.of(offset,  pagesize));
		return page.getContent();
	}
}