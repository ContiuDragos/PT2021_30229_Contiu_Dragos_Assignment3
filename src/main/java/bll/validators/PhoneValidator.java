package bll.validators;

import model.Client;

public class PhoneValidator implements Validator<Client>{
    @Override
    public void validate(Client client) {
        if(client.getPhone().length()!=10 && client.getPhone().length()!=12)
            throw new IllegalArgumentException("The phone number is incorrect!");
    }
}
