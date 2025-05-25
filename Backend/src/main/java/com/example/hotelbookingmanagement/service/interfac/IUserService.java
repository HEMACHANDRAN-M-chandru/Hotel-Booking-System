package com.example.hotelbookingmanagement.service.interfac;

import com.example.hotelbookingmanagement.dto.LoginRequest;
import com.example.hotelbookingmanagement.dto.Response;
import com.example.hotelbookingmanagement.model.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}

