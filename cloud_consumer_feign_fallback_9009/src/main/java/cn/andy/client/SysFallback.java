package cn.andy.client;

import cn.andy.model.Sys;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SysFallback implements SysClient001 {
    @Override
    public Sys getSys() {
        return new Sys().setId("123").setNumber("123").setPassword("123");
    }

    @Override
    public List<Sys> getSysList() {
        return new ArrayList<Sys>(){{add(new Sys().setId("ABC").setPassword("ABC").setNumber("ABC"));}};
    }
}
