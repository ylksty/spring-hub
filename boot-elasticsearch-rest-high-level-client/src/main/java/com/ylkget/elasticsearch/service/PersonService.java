package com.ylkget.elasticsearch.service;

import com.ylkget.elasticsearch.model.Person;

import java.util.List;

/**
 * <p>
 * PersonService
 * </p>
 *
 * @author joe 2021-02-11 10:46
 */
public interface PersonService {
    void deleteIndex(String index);

    void createIndex(String index);

    void insert(String index, List<Person> list);

    List<Person> searchList(String indexName);

    void update(String index, List<Person> list);

    void delete(String index, Person person);
}
