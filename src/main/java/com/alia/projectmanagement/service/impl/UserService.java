package com.alia.projectmanagement.service.impl;

import com.alia.projectmanagement.dto.UserDto;
import com.alia.projectmanagement.service.IUserService;

import com.alia.projectmanagement.util.TPage;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
//import com.alia.projectmanagement.util.TPage;

@Service
public class UserService implements IUserService {
    @Override
    public UserDto save(UserDto user) {
        return null;
    }

    @Override
    public UserDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<UserDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public UserDto getByUsername(String username) {
        return null;
    }
}
