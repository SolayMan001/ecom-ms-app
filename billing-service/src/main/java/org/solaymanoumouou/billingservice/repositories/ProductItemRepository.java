package org.solaymanoumouou.billingservice.repositories;

import org.solaymanoumouou.billingservice.entities.ProductItem;
import org.solaymanoumouou.billingservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
    List<ProductItem> findByBillId(Long billId);
}
