package app;

public enum Option {
    EXIT(0, "Wyjście z programu"),
    ADD_BOOK(1, "Dodanie książki"),
    ADD_MAGAZINE(2,"Dodanie magazynu/gazety"),
    PRINT_BOOKS(3, "Wyświetlenie dostępnych książek"),
    PRINT_MAGAZINES(4, "WYświetlenie dostępnych magazynów/gazet");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String desc) {
        this.value = value;
        this.description = desc;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    public static Option createFromInt(int option) {
        return Option.values()[option];
    }
}
