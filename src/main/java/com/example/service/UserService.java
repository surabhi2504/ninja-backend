package com.example.service;

import com.example.model.FileUpload;
import com.example.model.Location;
import com.example.model.Users;

public interface UserService {

	Users getRoleByLogin(String username, String password);

	Location saveLocation(FileUpload fileName);

}
