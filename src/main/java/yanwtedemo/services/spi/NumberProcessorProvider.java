package yanwtedemo.services.spi;

import com.github.winteryoung.yanwte.Combinator;
import com.github.winteryoung.yanwte.ExtensionPointProvider;
import org.jetbrains.annotations.NotNull;
import yanwtedemo.services.impl.even.EvenNumberProcessor;
import yanwtedemo.services.impl.odd.OddNumberProcessor;

/**
 * Provider of {@link NumberProcessor}.
 *
 * @author Winter Young
 * @since 2016/10/23
 */
public class NumberProcessorProvider extends ExtensionPointProvider {
    @NotNull
    @Override
    protected Combinator tree() {
        // the order here really doesn't matter for this case,
        // because odd and even don't conflict. however,
        // if you need order, chain is suitable for you.
        // for other combinators, refer to the wiki.
        return chain(
                extOfClass(OddNumberProcessor.class),
                extOfClass(EvenNumberProcessor.class)
        );
    }
}
