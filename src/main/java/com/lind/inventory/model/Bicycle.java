package com.lind.inventory.model;

import com.lind.inventory.model.enums.BicycleSize;
import lombok.*;
import lombok.experimental.SuperBuilder;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@SuperBuilder
public class Bicycle extends Vehicle {

    @Getter
    @Setter
    @NonNull
    private BicycleSize size;

}