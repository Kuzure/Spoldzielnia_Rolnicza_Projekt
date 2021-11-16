package com.rolnicza.spoldzielnia.service;

import com.rolnicza.spoldzielnia.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserService {
    private final UserService userService;
}
