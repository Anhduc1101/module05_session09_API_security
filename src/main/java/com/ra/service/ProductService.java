package com.ra.service;
import com.ra.dto.request.ProductRequestDTO;
import com.ra.dto.response.ProductResponseDTO;
import java.util.List;

public interface ProductService {
    List<ProductResponseDTO> getAll();
    ProductResponseDTO save(ProductRequestDTO product);
}
