package bll;

import bll.validators.AgeValidator;
import bll.validators.EmailValidator;
import bll.validators.PhoneValidator;
import bll.validators.Validator;
import dao.ClientDAO;
import model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ClientBLL {

    private List<Validator<Client>> validators;
    private ClientDAO clientDAO;

    public ClientBLL()
    {
        validators = new ArrayList<Validator<Client>>();
        validators.add(new AgeValidator());
        validators.add(new EmailValidator());
        validators.add(new PhoneValidator());

        clientDAO = new ClientDAO();
    }

    public Client findClientById(int id)
    {
        Client cl = clientDAO.findById(id);
        if(cl == null)
            throw new NoSuchElementException("The client with id="+id+" was not found!");
        return cl;
    }
}
