package model;

import lombok.*;

import java.util.List;

/**
 * Relates final product to the list of ingredients that went into it
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class MaterialTrace {
    /**
     * Material of interested that is being traced
     */
    private ProductionMaterial finalProduct;

    /**
     * all input materials that make up the finalProduct
     */
    private List<ProductionMaterial> ingredients;
}
