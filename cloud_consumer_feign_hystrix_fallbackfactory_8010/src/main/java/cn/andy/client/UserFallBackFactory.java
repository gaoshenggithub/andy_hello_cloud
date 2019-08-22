package cn.andy.client;

import cn.andy.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserFallBackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable throwable) {
        return new UserClient() {
            @Override
            public List<User> getList() {
                return new ArrayList<User>() {{
                    add(new User().setId(""));
                }};
            }

            @Override
            public User getUser(String id) {
                return new User().setLastName("AER").setDate(null).setId(id);
            }
        };
    }
}
