package org.solaymanoumouou.customerservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.cloud.config.enabled=false",
        "eureka.client.enabled=false",
        "global.params.p1=555",
        "global.params.p2=777"
})
class CustomerServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
