package cn.andy.client;

import cn.andy.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class UserFallback implements UserClient001 {
    @Override
    public List<User> getList() {
        return new ArrayList<User>() {{
            add(new User().setId(UUID.randomUUID().toString()).setLastName("C").setDate(LocalDate.MAX));
        }};
    }

    @Override
    public User getUser(String id) {
        return new User().setId(id).setLastName("@SFSAF@#$").setDate(LocalDate.now());
    }
}
