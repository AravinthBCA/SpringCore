package Properties;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class CountriesAndLanguages {
	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countryAndLangs=" + countryAndLangs + "]";
	}
	
}
