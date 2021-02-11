package com.ylkget.elasticsearch.exception;

/**
 * <p>
 * ElasticsearchException
 * </p>
 *
 * @author joe 2021-02-11 11:06
 */
public class ElasticsearchException extends RuntimeException {

    public ElasticsearchException(String message) {
        super(message);
    }
}
