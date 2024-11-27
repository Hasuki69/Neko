package org.nekomanga.presentation.theme.colorschemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Shades for hex colors https://noeldelgado.github.io/shadowlord/
// Color palette https://paletton.com/

internal object OutRunColorScheme : BaseColorScheme() {
    // This is not used so if it starts being used, ignore the below and start fresh
    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFF201147),
            onPrimary = Color(0xFFC06C84),
            primaryContainer = Color(0xFF362562),
            onPrimaryContainer = Color(0xFFC06C84),
            secondary = Color(0xFF202146),
            onSecondary = Color(0xFFC06C84),
            secondaryContainer = Color(0xFF313251),
            onSecondaryContainer = Color(0xFFC06C84),
            tertiary = Color(0xFF5E0E23),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF82273F),
            onTertiaryContainer = Color(0xFFFFFFFF),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFDC6559),
            onErrorContainer = Color(0xFFFFFFFF),
            background = Color(0xFFEFC8D3),
            onBackground = Color(0xFF201147),
            surface = Color(0xFFEFC8D3),
            onSurface = Color(0xFF201147),
            surfaceVariant = Color(0xFFEFC8D3),
            onSurfaceVariant = Color(0xFF201147),
            outline = Color(0xFF4B3A78),
            outlineVariant = Color(0xFF4B3A78),
            scrim = Color(0xFFFFFFFF),
            inverseSurface = Color(0xFF000000),
            inverseOnSurface = Color(0xFFFFFFFF),
            inversePrimary = Color(0xFFFFFFFF),
            surfaceDim = Color(0xFFFFFFFF),
            surfaceBright = Color(0xFFFFFFFF),
            surfaceContainerLowest = Color(0xFFF2D3DC),
            surfaceContainerLow = Color(0xFFF4D9E0),
            surfaceContainer = Color(0xFFF5DEE5),
            surfaceContainerHigh = Color(0xFFF7E4E9),
            surfaceContainerHighest = Color(0xFFF9E9ED),
        )

    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFFC06C84),
            onPrimary = Color(0xFF201147),
            primaryContainer = Color(0xFFE4A2B5),
            onPrimaryContainer = Color(0xFF201147),
            secondary = Color(0xFFDD546E),
            onSecondary = Color(0xFF201147),
            secondaryContainer = Color(0xFFF07D94),
            onSecondaryContainer = Color(0xFF201147),
            tertiary = Color(0xFF2DE2E6),
            onTertiary = Color(0xFF000000),
            tertiaryContainer = Color(0xFF05DDDD),
            onTertiaryContainer = Color(0xFF000000),
            error = Color(0xFFC14033),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFDC6559),
            onErrorContainer = Color(0xFFFFFFFF),
            background = Color(0xFF170C32),
            onBackground = Color(0xFFFFFFFF),
            surface = Color(0xFF170C32),
            onSurface = Color(0xFFFFFFFF),
            surfaceVariant = Color(0xFF170C32),
            onSurfaceVariant = Color(0xFFFFFFFF),
            outline = Color(0xFFE6C4CE),
            outlineVariant = Color(0xFFF2E2E6),
            scrim = Color(0xFF000000),
            inverseSurface = Color(0xFFFFFFFF),
            inverseOnSurface = Color(0xFF000000),
            inversePrimary = Color(0xFF000000),
            surfaceDim = Color(0xFF000000),
            surfaceBright = Color(0xFF000000),
            surfaceContainerLowest = Color(0xFF120A28),
            surfaceContainerLow = Color(0xFF150B2D),
            surfaceContainer = Color(0xFF170C32),
            surfaceContainerHigh = Color(0xFF2E2447),
            surfaceContainerHighest = Color(0xFF453D5B),
        )
}