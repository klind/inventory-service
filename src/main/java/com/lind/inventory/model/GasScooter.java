package com.lind.inventory.model;

import com.lind.inventory.model.enums.ElectricRange;
import com.lind.inventory.model.enums.EngineSize;
import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@SuperBuilder
public class GasScooter extends Vehicle {

    @Getter
    @Setter
    @NonNull
    private EngineSize engineSize;

}