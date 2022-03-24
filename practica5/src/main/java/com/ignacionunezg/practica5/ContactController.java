package com.ignacionunezg.practica5;
import java.util.ArrayList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ContactController {
    private ArrayList<Contact> contactos = new ArrayList<Contact>();

    @GetMapping("/contacts")
public ArrayList<Contact> getContacts(){
    return contactos;
}

@PostMapping("/contacts")
public Contact postContact(@RequestBody Contact contact){
    contactos.add(contact);
    return contact;
}
            
}