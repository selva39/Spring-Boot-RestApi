package com.example.Springbootdatajpa.controller;

import com.example.Springbootdatajpa.model.Family;
import com.example.Springbootdatajpa.respository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FamilyController {
@Autowired
    FamilyRepository repository;
@PostMapping("/insert")
    public String insert(@RequestBody Family family)
    {
        repository.save(family);
        return "inserted successfully";
    }
    @GetMapping("/families")
    public List<Family> getAllDetails()
    {
      List<Family> list= repository.findAll();
      return list;
    }
    @GetMapping("/family/{id}")
    public Family getFamilyById(@PathVariable("id") int id)
    {

      return  repository.findById(id).get();
    }
    @PutMapping("/update")
    public int update(@RequestBody Family family){
      family.setId(family.getId());
     family.setName(family.getName());
     family.setAge(family.getAge());
     family.setDob(family.getDob());
     repository.save(family);
     return family.getId();
    }
    @PostMapping("/insertAll")
    public List<Family>insertAll(@RequestBody List<Family>list){
//    for (int i=0;i<list.size();i++)
//    {
        list= repository.saveAll(list);
   // }

    return  list;
    }
    @DeleteMapping("/delete")
    public  int delete(@RequestBody Family family)
    {
       repository.delete(family);
       return family.getId();

    }
    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable int id)
    {
        repository.deleteById(id);
        return id;
    }

}
