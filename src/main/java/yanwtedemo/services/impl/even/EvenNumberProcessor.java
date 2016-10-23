package yanwtedemo.services.impl.even;

import org.springframework.stereotype.Component;
import yanwtedemo.services.spi.NumberProcessor;

/**
 * @author Winter Young
 * @since 2016/10/23
 */
@Component
public class EvenNumberProcessor implements NumberProcessor {
    @Override
    public Integer processInt(Integer i) {
        if (i != null && i % 2 == 0) {
            return i - 1;
        }

        // we cannot deal with it, let others do the work
        return null;
    }
}
