package ehod.tech.ehodTestQuizz.testing;

public class EhodConvertisseur {
	// constantes pour la conversion des tempÃ©ratures
		private static final double BASE_FAHRENHEIT = 32.0;
		private static final double CELSIUS_FAHRENHEIT_CONVERSION_FACTOR = 9.0 / 5.0;

		// constantes pour la conversion des volumes
		private static final double LITRE_TO_GALLON_MULTIPLIER = 0.264172;

		// Exposant pour le calcul d'une aire de disque
		private static final double POWER_OF_RADIUS = 2.0;

		/**
		 * Convertir centigrade en fahrenheit.
		 *
		 * @param celsiusTemperature Ã  convertir
		 * @return fahrenheit temperature.
		 */
		public Double celsiusToFahrenheit(Double celsiusTemperature) {
			return celsiusTemperature * CELSIUS_FAHRENHEIT_CONVERSION_FACTOR + BASE_FAHRENHEIT;
		}

		/**
		 * Convertir fahrenheit en centigrade
		 *
		 * @param fahrenheitTemperature Ã  convertir
		 * @return Centigrade temperature
		 */
		public Double fahrenheitToCelsius(Double fahrenheitTemperature) {
			return (fahrenheitTemperature - BASE_FAHRENHEIT) * CELSIUS_FAHRENHEIT_CONVERSION_FACTOR;
		}

		/**
		 * Convertir a volume en litres en gallons.
		 *
		 * @param litreVolume Ã  convertir
		 * @return volume en gallons
		 */
		public Double litresToGallons(Double litreVolume) {
			return litreVolume * LITRE_TO_GALLON_MULTIPLIER;
		}

		/**
		 * Convertir a volume en gallons en litres.
		 *
		 * @param litreVolume Ã  convertir
		 * @return volume en gallons
		 */
		public Double gallonsToLitres(Double gallonsVolume) {
			return gallonsVolume / LITRE_TO_GALLON_MULTIPLIER;
		}

		/**
		 * Convertir un rayon en aire de disque
		 *
		 * @param radius du disque
		 * @return aire du disque
		 */
		public final double radiusToAreaOfCircle(Double radius) {
			return Math.PI * Math.pow(radius, POWER_OF_RADIUS);

		}
}
