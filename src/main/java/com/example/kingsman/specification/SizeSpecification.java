package com.example.kingsman.specification;

import com.example.kingsman.entities.Size;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class SizeSpecification {
    public static Specification<Size> filterSize(String tenSize, Date ngayTao, Date ngayCapNhat, Integer trangThai) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (tenSize != null && !tenSize.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("tenSize"), tenSize));
            }
            if (ngayTao != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("ngayTao"), ngayTao));
            }
            if (ngayCapNhat != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("ngayCapNhat"), ngayCapNhat));
            }
            if (trangThai != null) {
                predicates.add(criteriaBuilder.equal(root.get("trangThai"), trangThai));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
