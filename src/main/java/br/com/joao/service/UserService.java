package br.com.joao.service;

import br.com.joao.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}

