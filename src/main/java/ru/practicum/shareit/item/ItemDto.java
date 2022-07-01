package ru.practicum.shareit.item;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDto {
    private Long id;
    private String name;
    private String description;
    private boolean available;
    private Long owner;
    private Long request;
}
