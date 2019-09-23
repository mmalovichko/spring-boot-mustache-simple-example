package com.example.sweater.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.sweater.domain.*;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
}
