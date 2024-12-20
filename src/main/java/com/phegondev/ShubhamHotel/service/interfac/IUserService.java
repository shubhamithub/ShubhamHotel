package com.phegondev.ShubhamHotel.service.interfac;

import com.phegondev.ShubhamHotel.dto.LoginRequest;
import com.phegondev.ShubhamHotel.dto.Response;
import com.phegondev.ShubhamHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
