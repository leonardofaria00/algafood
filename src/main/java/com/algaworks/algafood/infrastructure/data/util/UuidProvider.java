package com.algaworks.algafood.infrastructure.data.util;

import java.util.UUID;

public class UuidProvider {

    public static String getUuid() {
        return UUID.randomUUID().toString();
    }
}
