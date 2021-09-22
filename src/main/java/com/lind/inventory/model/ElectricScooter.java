package com.lind.inventory.model;

import com.lind.inventory.model.enums.ElectricRange;
import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@SuperBuilder
public class ElectricScooter extends Vehicle {

    @Getter
    @Setter
    @NonNull
    private ElectricRange range;

}