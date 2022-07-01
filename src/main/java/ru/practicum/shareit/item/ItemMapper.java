package ru.practicum.shareit.item;

public class ItemMapper {
    public static ItemDto toItemDto(Item item) {
        return ItemDto.builder()
                .name(item.getName())
                .description(item.getDescription())
                .available(item.isAvailable())
                .request(item.getRequest() != null ? item.getRequest().getId() : null)
                .owner(item.getOwner() != null ? item.getOwner().getId() : null)
                .build();
    }

    public static Item toItem(ItemDto itemDto){
        return Item.builder()
                .id(itemDto.getId())
                .available(itemDto.isAvailable())
                .description(itemDto.getDescription())
                .name(itemDto.getName())
                .build();
    }
}
