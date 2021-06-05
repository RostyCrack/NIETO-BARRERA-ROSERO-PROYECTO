package sample;

public class PersonaException extends Exception {

    public static String BAD_AGE_LOWER = "La edad debe ser mayor a 0";
    public static String BAD_AGE_UPPER = "La edad debe ser menor a 120";
    public static String BAD_AGE = "El texto no es una edad valida";

    public PersonaException(String message)
    {
        super(message);
    }}
