package com.how2java.springboot.dao;
 
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
 
import com.how2java.springboot.pojo.Category;
 
public interface CategoryDAO extends ElasticsearchRepository<Category,Integer>{
 
}