/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.bookwebapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alexsmith
 */
public class AuthorService {
    private List<Author> authorList;
    
    
    
    public void populateAuthorListWithHardCodedData(){
        Calendar cal = Calendar.getInstance();
        Date now = cal.getTime();
        Author a1 = new Author(1,"F Scott Fitzgerald", now);
        Author a2 = new Author(2,"Fyodor Dostoevsky", now);
        Author a3 = new Author(3,"James Joyce", now);
        Author a4 = new Author(4,"William Faulkner", now);
        Author a5 = new Author(5,"Philip K Dick", now);
        
        authorList.add(a1);
        authorList.add(a2);
        authorList.add(a3);
        authorList.add(a4);
        authorList.add(a5);
         
        
    }
    
    public List<Author> getAuthorList(){
        return this.authorList;
    }
}
