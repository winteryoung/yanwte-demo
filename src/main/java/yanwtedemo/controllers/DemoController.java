package yanwtedemo.controllers;

import com.github.winteryoung.yanwte.spring.AutowireProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yanwtedemo.services.spi.NumberProcessor;
import yanwtedemo.services.spi.NumberFormatter;

/**
 * @author Winter Young
 * @since 2016/10/23
 */
@RestController
public class DemoController {
    // the bean name must be the pattern [beanNameForInterface] + "Provider"
    // otherwise there will be too many beans matching this type
    @AutowireProvider
    private NumberProcessor numberProcessorProvider;

    @AutowireProvider
    private NumberFormatter numberFormatterProvider;

    @RequestMapping("/demo")
    public String demo(Integer num) {
        Integer i = numberProcessorProvider.processInt(num);
        return numberFormatterProvider.format(i);
    }
}
