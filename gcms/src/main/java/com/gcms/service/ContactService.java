package com.gcms.service;

import java.util.List;

import com.gcms.form.Contact;
 
public interface ContactService {
     
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}