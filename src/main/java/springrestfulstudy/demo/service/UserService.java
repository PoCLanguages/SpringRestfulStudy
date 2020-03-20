package springrestfulstudy.demo.service;

import springrestfulstudy.demo.ws.ui.model.request.UserDetailsRequestModel;
import springrestfulstudy.demo.ws.ui.model.response.UserRest;

public interface UserService {

    UserRest createUser(UserDetailsRequestModel userDetails);


}
