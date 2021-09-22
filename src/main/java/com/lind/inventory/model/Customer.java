package com.lind.inventory.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Getter
    private
    String id;

    @Getter
    @Setter
    @NonNull
    private String brand;
    @Getter
    @Setter
    @NonNull
    private String color;
    @Getter
    @Setter
    @NonNull
    private Boolean outOfService;
    @Getter
    @Setter
    @NonNull
    private Boolean rented;
}


