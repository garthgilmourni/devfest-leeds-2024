package location

import java.util.Locale

class DesktopCountryCodeService() : CountryCodeService {
    override fun getCountryCode(): String? {
        return Locale.getDefault().country
    }
}

actual fun getCountryCodeService(): CountryCodeService = DesktopCountryCodeService()