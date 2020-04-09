package com.xingyun.springcloudnetflixzuulapigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qing-feng.zhao
 */
@Slf4j
public class SimpleFilter extends ZuulFilter {

    /**
     *
     * Zuul has four standard filter types:
     * 1. pre filters run before the request is routed.
     *
     * 2. route filters can handle the actual routing of the request.
     *
     * 3. post filters run after the request has been routed.
     *
     * 4. error filters run if an error occurs in the course of handling the request.
     *
     * @return Returns a String that stands for the type of the filter
     *
     *  — in this case, pre. (It would be route for a routing filter.)
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     *
     * Gives the order in which this filter is to be run, relative to other filters.
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * Contains the logic that determines when to run this filter (this particular filter is always run).
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * Contains the functionality of the filter.
     * @return
     */
    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("{} request to {}",request.getMethod(),request.getRequestURL().toString());

        // output as below:
        //GET request to http://127.0.0.1:8280/book-service/

        return null;
    }



}
