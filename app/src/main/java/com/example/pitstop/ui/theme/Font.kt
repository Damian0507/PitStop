import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import java.util.Collections.emptyList

// Creăm un provider pentru Google Fonts
val googleFontProvider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = emptyList() // Nu e nevoie de certificate pentru Google Fonts
)

// Configurăm familia de fonturi Poppins
val poppinsFont = FontFamily(
    Font(
        googleFont = GoogleFont("Poppins"),
        fontProvider = googleFontProvider,
        weight = FontWeight.Normal
    ),
    Font(
        googleFont = GoogleFont("Poppins"),
        fontProvider = googleFontProvider,
        weight = FontWeight.Bold
    )
)
