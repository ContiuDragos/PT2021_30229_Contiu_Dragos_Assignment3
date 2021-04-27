package bll.validators;

import model.Client;

public class AgeValidator implements Validator<Client> {

    private static final int MIN_AGE = 18;

    @Override
    public void validate(Client client) {
        if(client.getAge() < MIN_AGE)
            throw new IllegalAccessError("The clients age is not respected!");
    }
}
