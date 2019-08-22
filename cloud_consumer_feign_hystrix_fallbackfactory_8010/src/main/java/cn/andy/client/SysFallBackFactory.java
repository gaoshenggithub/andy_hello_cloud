package cn.andy.client;

import cn.andy.model.Sys;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SysFallBackFactory implements FallbackFactory<SysClient> {

    @Override
    public SysClient create(Throwable throwable) {
        return new SysClient() {
            @Override
            public Sys getSys() {
                return new Sys().setId("890").setNumber("890").setPassword("890");
            }

            @Override
            public List<Sys> getSysList() {
                return new ArrayList<Sys>() {{
                    add(new Sys().setId("JKL").setNumber("JKL").setPassword("JKL"));
                }};
            }
        };
    }
}
