package org.marketcetera.client;

import org.marketcetera.util.misc.ClassVersion;

/* $License$ */

/**
 * Factory used to create a {@link Client} object.
 *
 * @author <a href="mailto:colin@marketcetera.com">Colin DuPlantis</a>
 * @version $Id: ClientFactory.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.1.4
 */
@ClassVersion("$Id: ClientFactory.java 16154 2012-07-14 16:34:05Z colin $")
public interface ClientFactory
{
    /**
     * Gets a <code>Client</code>.
     * 
     * @param inClientParameters a <code>ClientParmeters</code> value to use to initialize the client
     * @return a <code>Client</code> value
     * @throws ConnectionException if there were errors connecting to the server.
     * @throws ClientInitException if the client is already initialized.
     */
    public Client getClient(ClientParameters inClientParameters)
            throws ClientInitException, ConnectionException;
}
