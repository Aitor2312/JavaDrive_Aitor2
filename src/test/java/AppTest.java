package com.aitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testSaludo() {
        App app = new App();
        assertEquals("Hola", app.saludo());
    }
}