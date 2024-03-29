/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.backend.dao;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Elvis
 * @param <T>
 */
public interface Dao<T> {
    void create(T t) throws IOException;
    int update(T t) throws IOException;
    boolean delete(T t) throws IOException; 
    List<T> getAll() throws IOException;
}
