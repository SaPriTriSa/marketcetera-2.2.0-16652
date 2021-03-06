package org.marketcetera.util.auth;

import org.apache.commons.lang.StringUtils;
import org.marketcetera.util.log.I18NBoundMessage;
import org.marketcetera.util.misc.ClassVersion;
import org.springframework.context.support.GenericApplicationContext;

/**
 * A setter for a string holder that obtains the data via Spring
 * configuration properties.
 *
 * @author tlerios@marketcetera.com
 * @since 0.5.0
 * @version $Id: SpringSetterString.java 16154 2012-07-14 16:34:05Z colin $
 */

/* $License$ */

@ClassVersion("$Id: SpringSetterString.java 16154 2012-07-14 16:34:05Z colin $")
public class SpringSetterString
    extends SpringSetter<Holder<String>>
{

    // CONSTRUCTORS.

    /**
     * Constructor mirroring superclass constructor.
     *
     * @see SpringSetter#SpringSetter(Holder,I18NBoundMessage,String)
     */

    public SpringSetterString
        (Holder<String> holder,
         I18NBoundMessage usage,
         String propertyName)
    {
        super(holder,usage,propertyName);
    }


    // SpringSetter.

    @Override
    public void setValue
        (GenericApplicationContext context)
    {
        String value=(String)getPropertyValue(context);
        Holder<String> holder=getHolder();
        if (!StringUtils.EMPTY.equals(value)) {
            holder.setValue(value);
        }
    }
}
