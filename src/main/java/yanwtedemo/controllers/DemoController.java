package yanwtedemo.controllers;

import com.github.winteryoung.yanwte.spring.AutowireProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yanwtedemo.services.spi.NumberProcessor;

/**
 * @author Winter Young
 * @since 2016/10/23
 */
@RestController
public class DemoController {
    @AutowireProvider
    private NumberProcessor numberProcessorProvider;

    @RequestMapping("/demo")
    public String demo(Integer num) {
        return "" + numberProcessorProvider.processInt(num);
    }
}
