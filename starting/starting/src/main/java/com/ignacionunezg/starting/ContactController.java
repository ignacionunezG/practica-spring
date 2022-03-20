package com.ignacionunezg.starting;
import java.util.ArrayList;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ContactController {
    private ArrayList<Contact> contactos = new ArrayList<Contact>();

    @GetMapping("/contacts")
    public ResponseEntity<ArrayList<Contact>> getContacts(){
        return new ResponseEntity<ArrayList<Contact>>(contactos, HttpStatus.OK);
    }

    @PostMapping("/contacts")
    public ResponseEntity<Contact>postContact( @RequestBody Contact contact){
        contactos.add(contact);

        return new ResponseEntity<Contact>(contact, HttpStatus.OK);

    }
            
}

