package ru.practicum.shareit.booking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class BookingDto {
    private Long id;
    private LocalDate start;
    private LocalDate end;
    private Item item;
    private Long booker;
    private BookingStatus status;

    @AllArgsConstructor
    static class Item{
        private Long id;
        private String name;
    }
}
