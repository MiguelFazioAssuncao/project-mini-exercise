package com.miguelfazio.project_mini_exercise.service;

import java.util.List;

public interface GenericService<E, DTO> {
    E get(Long id);
    List<E> getAll();
    E create(DTO entity);
    E alter(Long id, DTO data);
    void delete(Long id);
    boolean exists(DTO entity);
}
