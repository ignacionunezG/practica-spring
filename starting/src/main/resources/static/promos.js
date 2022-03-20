let contactos = [];
var nombre = "";
var apellido = "";
var segundoApellido="";
var fecha = "";
var dni="";
var tlf=0;
var email= "";
var direccion = "";
var pais="";
var ciudad = "";
var cp=0;
var titular="";
var numTarj = 0;
var expiration = "";
var cvv=0;
var promocion = "";

document.addEventListener('DOMContentLoaded',function(){


    document.querySelector('form').onsubmit = () =>{
        nombre = document.querySelector('#firstName').value;
        apellido = document.querySelector('#lastName').value;
        segundoApellido = document.querySelector('#lastName2').value;
        fecha = document.querySelector('#birth').value;
        dni = document.querySelector('#id').value;
        tlf = document.querySelector('#telf').value;
        email = document.querySelector('#email').value;
        direccion = document.querySelector('#address').value;
        pais = document.querySelector('#country').value;
        ciudad = document.querySelector('#city').value;
        cp = document.querySelector('#zip').value;
        titular = document.querySelector('#cc-name').value;
        numTarj = document.querySelector('#cc-number').value;
        expiration = document.querySelector('#cc-expiration').value;
        cvv = document.querySelector('#cc-cvv').value;
        //promocion=document.querySelector('#').value;


        addContact(crearContacto());
        return false;
    }
});


const crearContacto = () => {
    // Save task in memory
    contacto ={
        nombre: nombre,
        apellido: apellido,
        segundoApellido: segundoApellido,
        fecha: fecha,
        dni: dni,
        tlf: tlf,
        email: email,
        direccion: direccion,
        pais: pais,
        ciudad: ciudad,
        cp: cp,
        titular: titular,
        numTarj: numTarj,
        expiration: expiration,
        cvv: cvv,

    };
    return contacto;

};

const añadirContacto = (contacto) => {
    // Save task in memory
    contactos.push(contacto);
};

const getContacts = async () => {
    // Call server
    let request = await fetch("/contacts");
    if (request.status === 200) {
        let data = await request.json();
        añadirListaContactos(data);
    }
};


const añadirListaContactos = (contactos) => {
    // For each task in the list, tasksToAdd
    // Add the task
    contactos.forEach((contacto) => añadirContacto(contacto));
};

const postContact = async (contact) => {
    // Call server
    let request = await fetch("/contacts", {
        method: "POST",
        body: JSON.stringify({
            nombre: nombre,
            apellido: apellido,
            segundoApellido: segundoApellido,
            fecha: fecha,
            dni: dni,
            tlf: tlf,
            email: email,
            direccion: direccion,
            pais: pais,
            ciudad: ciudad,
            cp: cp,
            titular: titular,
            numTarj: numTarj,
            expiration: expiration,
            cvv: cvv
        }),
        credentials: "same-origin",
        headers: {
            "Content-Type": "application/json", // Indico que mis datos van a estar en JSON
        },
        dataType: "json",
    });

    if (request.status === 200) {
        let data = await request.json();
        añadirContacto(data);
    }
};

$("#submit").on("click", () => {    
    postContact();
    console.log(contactos);
});
