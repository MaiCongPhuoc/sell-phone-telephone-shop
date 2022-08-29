package com.cg.model.dto;

import com.cg.model.Product;
import com.cg.model.ProductMedia;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;


@Data
public class ProductTempDTO implements Serializable {

    @NotBlank(message = "Name is required")
    private String name;

    private MultipartFile file;

    public Product toProduct() {
        return new Product()
                .setProductName(name);
    }
}
