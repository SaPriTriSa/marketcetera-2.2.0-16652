package org.marketcetera.event.impl;

import javax.annotation.concurrent.ThreadSafe;

import org.marketcetera.event.EquityEvent;
import org.marketcetera.event.MarketstatEvent;
import org.marketcetera.event.beans.MarketstatBean;
import org.marketcetera.trade.Equity;
import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Provides an Equity implementation of {@link MarketstatEvent}.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: EquityMarketstatEventImpl.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ThreadSafe
@ClassVersion("$Id: EquityMarketstatEventImpl.java 16154 2012-07-14 16:34:05Z colin $")
class EquityMarketstatEventImpl
        extends AbstractMarketstatEventImpl
        implements EquityEvent
{
    /* (non-Javadoc)
     * @see org.marketcetera.event.HasEquity#getInstrument()
     */
    @Override
    public Equity getInstrument()
    {
        return (Equity)super.getInstrument();
    }
    /**
     * Create a new EquityMarketstatEventImpl instance.
     *
     * @param inMarketstatBean a <code>MarketstatBean</code> value
     * @throws IllegalArgumentException if <code>MessageId</code> &lt; 0
     * @throws IllegalArgumentException if <code>Timestamp</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>Instrument</code> is <code>null</code>
     */
    EquityMarketstatEventImpl(MarketstatBean inMarketstat)
    {
        super(inMarketstat);
    }
    private static final long serialVersionUID = 1L;
}
