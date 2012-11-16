package com.sajilobean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.model.Friend;

/**
 * Session Bean implementation class SajiloBean
 */
@Stateless
@LocalBean
@Named

public class SajiloBean {
	
	@PersistenceContext
	EntityManager em;
	@Inject Friend fd;
	

    /**
     * Default constructor. 
     */
    public SajiloBean() {
        // TODO Auto-generated constructor stub
    }
    public void create(){
    	Friend friend=new Friend(fd.getName(),fd.getPassword());
    	em.persist(friend);
    }
    public List<?> getList(){
    	return  em.createQuery("select f from Friend f").getResultList();
    }
    public String getName(int id){
    	Friend f=(Friend)getList().get(id);
    	return f.getName();
    }

}
