package model;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ProductionRun {

    private Date startDate;

    private Date endDate;

    private List<ProductionMovement> productionMovementList;
}
