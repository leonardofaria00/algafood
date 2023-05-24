package com.algaworks.algafood.infrastructure.data.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataProvider {

    public static LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }

    public static LocalDate getLocalDate() {
        return LocalDate.now();
    }
}
