package model.dao;

import model.entities.Department;

import java.util.List;

public interface Seller {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller obj);
    Seller  findById(Integer id);
    List<Seller> findAll();
}
