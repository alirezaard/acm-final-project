package org.acmClassRoom.dao;

import org.acmClassRoom.model.Work;

import java.util.List;

public interface WorkDao {
    void addWork(Work work);

    void deleteWork(Work work);

    void deleteWork(Long id);

    Work updateWork(Work work);

    Work findWork(Long id);

    List<Work> findAll();
}
