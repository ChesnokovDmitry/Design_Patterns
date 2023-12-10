package org.observer;

/**
 * Интерфейс реализуется всеми наблюдателями
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}