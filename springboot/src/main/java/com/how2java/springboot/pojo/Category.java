package com.how2java.springboot.pojo;
 
import org.springframework.data.elasticsearch.annotations.Document;
 
@Document(indexName = "how2java",type = "category")
public class Category {
 
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     
}