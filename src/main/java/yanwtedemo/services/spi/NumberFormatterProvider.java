package yanwtedemo.services.spi;

import com.github.winteryoung.yanwte.Combinator;
import com.github.winteryoung.yanwte.ExtensionPointProvider;
import com.github.winteryoung.yanwte.spring.YanwteExtensionPoint;
import org.jetbrains.annotations.NotNull;
import yanwtedemo.services.impl.even.EvenNumberProcessor;
import yanwtedemo.services.impl.odd.OddNumberProcessor;

/**
 * @author Winter Young
 * @since 2016/11/7
 */
public class NumberFormatterProvider extends ExtensionPointProvider {
    @NotNull
    @Override
    protected Combinator tree() {
        return chain(
                extOfClass(OddNumberProcessor.class),
                extOfClass(EvenNumberProcessor.class)
        );
    }
}
