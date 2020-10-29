package com.alia.projectmanagement.service;

import com.alia.projectmanagement.dto.UserDto;
import com.alia.projectmanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IUserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
