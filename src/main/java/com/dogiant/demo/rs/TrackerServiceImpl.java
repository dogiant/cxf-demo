package com.dogiant.demo.rs;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.dogiant.demo.rs.domain.Person;

@Service("trackerService")
public class TrackerServiceImpl implements TrackerService {

    public Person get(String id) {
    	Person p = new Person();
    	p.setId(1L);
    	p.setName("andy du");
    	p.setAge(17);
    	p.setBirthday(new Date());
        return p;
    }
}