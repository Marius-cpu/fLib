package fLib.annotations;
/**
 * Shows that the specified method/class does not function as expected or does not function at all
 * @author MnT
 */
public @interface NotFunctioning {
	
	String[] reason();
}
