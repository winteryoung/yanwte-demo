package yanwtedemo.services.spi;

import com.github.winteryoung.yanwte.spring.YanwteExtensionPoint;

/**
 * @author Winter Young
 * @since 2016/11/7
 */
@YanwteExtensionPoint
public interface NumberFormatter {
    String format(Integer num);
}
