package model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductionNetwork {

    private List<ProductionUnit> units;

    private List<ProductionConnection> connections;

}
