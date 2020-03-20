package springrestfulstudy.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springrestfulstudy.demo.service.UserService;
import springrestfulstudy.demo.shared.Utils;
import springrestfulstudy.demo.ws.ui.model.request.UserDetailsRequestModel;
import springrestfulstudy.demo.ws.ui.model.response.UserRest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    Utils utils;


    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {

        UserRest returnValue = new UserRest(userDetails.getFirstName(),
                userDetails.getLastName(),
                userDetails.getEmail());

        String userId = utils.generateUserId();
        returnValue.setId(userId);

        if(users == null)
            users = new HashMap<String, UserRest>();

        users.put(userId, returnValue);

        return returnValue;
    }
}
