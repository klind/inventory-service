package com.lind.inventory.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class Vehicle {

    @Id
    private @Getter String id;

    private @Getter @Setter @NonNull String brand;
    private @Getter @Setter @NonNull String color;
    private @Getter @Setter @NonNull Boolean outOfService;
    private @Getter @Setter @NonNull Boolean rented;


}