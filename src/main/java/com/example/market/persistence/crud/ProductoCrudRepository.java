package com.example.market.persistence.crud;

import com.example.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    /*de manera nativa
    @Query(value="SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    public List<Producto> findByIdCategoria(int idCategoria);
    */

    List<Producto> findByIdCategoriaOrderByNombre(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
