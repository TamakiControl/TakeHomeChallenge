package model;

import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * Product transfer information for a period of time
 */
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
