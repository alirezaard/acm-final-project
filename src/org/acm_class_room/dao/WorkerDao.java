package org.acm_class_room.dao;

import org.acm_class_room.model.Workers;

import java.util.List;

public interface WorkerDao {
    void addWorker(Workers workers);

    void deleteWorker(Workers workers);

    void deleteWorker(Long id);

    Workers updateWorker(Workers workers);

    Workers findWorker(Long id);

    List<Workers> findAll();
}
