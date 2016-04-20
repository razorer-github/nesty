package org.nesty.core.server.rest.interceptor;

import org.nesty.core.server.rest.RequestContext;

/**
 * Filter of http request and response
 *
 * Author : Michael
 * Date : March 09, 2016
 */
public abstract class Interceptor<T> {

    /**
     * http context of request information. user can update
     * the value of context.
     *
     * @param context http context
     * @return true if we continue the request or false will deny the request by http code 403
     */
    public abstract boolean filter(final RequestContext context);

    /**
     * http context of request information. user can update
     * the value of context or change the response. don't accept null
     * returned. it will be ignored
     *
     * @param context  http context
     * @param response represent response
     * @return response new response instance or current Object instance
     */
    public abstract T handler(final RequestContext context, T response);
}
