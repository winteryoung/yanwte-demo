package yanwtedemo.services.spi;

import com.github.winteryoung.yanwte.spring.YanwteExtensionPoint;

/**
 * @author Winter Young
 * @since 2016/10/23
 */
@YanwteExtensionPoint
public interface NumberProcessor {
    // params are required to be boxed type. the return type can be void or boxed type
    Integer processInt(Integer i);
}
