package ehod.tech.ehodTestQuizz.testing;

import static java.lang.Math.PI;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withinPercentage;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;


@Tag("ConversionTests")
public class EhodConversionTest {
	private final EhodConvertisseur calculatorUnderTest = new EhodConvertisseur();

	@Tag("TemperatureTests")
	@Nested
	@DisplayName("Réussir à  convertir des températures")
	class EhodTemperatureTests {
		@Test
		@DisplayName("Soit une T° à  0°C, lorsque l'on convertit en °F, alors on obtient 32°F.")
		public void celsiusToFahrenheit_returnsAFahrenheitTemperature() {
			final Double actualFahrenheit = calculatorUnderTest.celsiusToFahrenheit(0.0);
			assertThat(actualFahrenheit).isCloseTo(32.0, withinPercentage(0.01));
		}

		@Test
		@Tag("VersSystemeSI")
		@DisplayName("Soit une T° à  32°F, lorsque l'on convertit en °C, alors on obtient 0°C.")
		public void fahrenheitToCelsius_returnsACelciusTemperature() {
			final Double actualCelsius = calculatorUnderTest.fahrenheitToCelsius(32.0);
			assertThat(actualCelsius).isCloseTo(0.0, withinPercentage(0.01));
		}
	}

	@Test
	@DisplayName("Soit un volume de 3.78541 litres, en gallons, on obtient 1 gallon.")
	public void litresToGallons_returnsOneGallon() {
		final Double actualLitres = calculatorUnderTest.litresToGallons(3.78541);
		assertThat(actualLitres).isCloseTo(1.0, withinPercentage(0.01));
	}

	@Test
	@Tag("VersSystemeSI")
	@DisplayName("Soit un volume de 10 gallons, en litres, on obtient 37.8541 litres.")
	@Disabled
	public void gallonsToLitres_returnsEquivalentLitres() {
		final Double actualLitres = calculatorUnderTest.gallonsToLitres(10.);
		assertEquals(37.8541, actualLitres);
	}

	@Test
	@DisplayName("L'aire d'un disque de rayon 1 doit valoir PI.")
	public void radiusToAreaOfCircle_returnsPi() {
		final Double actualArea = calculatorUnderTest.radiusToAreaOfCircle(1.0);
		assertThat(actualArea).isCloseTo(PI, withinPercentage(0.01));
	}
}
