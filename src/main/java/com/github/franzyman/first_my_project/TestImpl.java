package com.github.franzyman.first_my_project;

// Реализация абстрактного класса Test
public class TestImpl extends Test {
    // Приватный конструктор, чтобы нельзя было создать экземпляр через new
    private TestImpl() {}
    // Приватные сеттеры, чтобы нельзя было изменить объект
    private void setName(String name) {
        super.name = name;
    }
    private void setType(String type) {
        super.type = type;
    }
    // Статический метод для создания экземпляра билдера, через который создаётся экземпляр класса TestImpl
    public static Builder builder() {
        return new Builder();
    }
    // Вложенный статический класс билдера, через него будет создаваться новый экземпляр TestImpl с нужными параметрами
    public static class Builder {
        // Это объект, который изменяется входными параметрами в билдере и будет в итоге возвращён
        private final TestImpl impl = new TestImpl();
        Builder() {}
        // Возврат готового объекта
        public TestImpl build() {
            return this.impl;
        }
        // Вызов сеттеров и передача аргументов в родительский объект
        public Builder setName(String name) {
            this.impl.setName(name);
            return this;  // Возврат экземпляра билдера
        }
        public Builder setType(String type) {
            this.impl.setType(type);
            return this;
        }
    }
}