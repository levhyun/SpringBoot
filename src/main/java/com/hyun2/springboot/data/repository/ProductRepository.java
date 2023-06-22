package com.hyun2.springboot.data.repository;

import com.hyun2.springboot.data.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // ** 쿼리 메서드 **
//    // find .. By
//    Optional<Product> findByNumber(Long number);
//    List<Product> findAllByName(String name);
//    Product queryByNumber(Long number);
//
//    // exists .. By
//    boolean existsByNumber(Long number);
//
//    // count .. By
//    long countByName(String name);
//
//    // delete .. By, remove .. By
//    void deleteByNumber(Long number);
//    long removeByName(String name);
//
//    // .. First<number> .., .. Top<number> ..
//    List<Product> findFirst5ByName(String name);
//    List<Product> findTop10ByName(String name);
//
//    // == findByNumber
//    Product findByNumberIs(Long number);
//    Product findByNumberEquals(Long number);
//
//    // (Is)Not
//    Product findByNumberISNot(Long number);
//    Product findByNumberNot(Long number);
//
//    // (Is)Null, (Is)NotNull
//    List<Product> findByUpdatedAtNull();
//    List<Product> findByUpdatedAtIsNull();
//    List<Product> findByUpdatedAtNotNull();
//    List<Product> findByUpdatedAtIsNotNull();
//
//    // (Is)True, (Is)False
//    Product findByActiveTrue();
//    Product findByActiveIsTrue();
//    Product findByActiveFalse();
//    Product findByActiveIsFalse();
//
//    // And, Or
//    Product findByNumberAndName(Long number, String name);
//    Product findByNumberOrName(Long number, String name);
//
//    // (Is)GreaterThan, (Is)LessThan, (Is)Between
//    List<Product> findByPriceIsGreaterThan(Long price);
//    List<Product> findByPriceGreaterThan(Long price);
//    List<Product> findByPriceGreaterThanEqual(Long price);
//    List<Product> findByPriceIsLessThan(Long price);
//    List<Product> findByPriceLessThan(Long price);
//    List<Product> findByPriceLessThanEqual(Long price);
//    List<Product> findByPriceIsBetween(Long lowPrice, Long highPrice);
//    List<Product> findByPriceBetween(Long lowPrice, Long highPrice);
//
//    // (Is)StartingWith(==StartsWith), (Is)EndingWith(==EndsWith), (Is)Containing(==Contains), (Is)Like
//    List<Product> findByNameLike(String name);
//    List<Product> findByNameIsLike(String name);
//    List<Product> findByNameContains(String name);
//    List<Product> findByNameContaining(String name);
//    List<Product> findByNameIsContaining(String name);
//    List<Product> findByNameStartsWith(String name);
//    List<Product> findByNameStartingWith(String name);
//    List<Product> findByNameIsStartingWith(String name);
//    List<Product> findByNameEndsWith(String name);
//    List<Product> findByNameEndingWith(String name);
//    List<Product> findByNameIsEndingWith(String name);
//
//    // *Sorting
//    // Asc : 오름차순, Desc : 내림차순
//    List<Product> findByNameOrOrderByNumberAsc(String name);
//    List<Product> findByNameOrOrderByNumberDesc(String name);
//    // And [X]
//    List<Product> findByNameOrderByPriceAscStockDesc(String name);
//    // Variable
//    List<Product> findByName(String name, Sort sort);
//
//    // paging
//    Page<Product> findByName(String name, Pageable pageable);
//
//    // Query
//    @Query("select p from Product as p where p.name = ?1")
//    List<Product> findByName(String name);
//    @Query("select p from Product as p where p.name = :name")
//    List<Product> findByNameParam(@Param("name") String name);
//    @Query("select p.name, p.price, p.stock from Product p where p.name = :name")
//    List<Object[]> findByNameParam2(@Param("name") String name);
}
