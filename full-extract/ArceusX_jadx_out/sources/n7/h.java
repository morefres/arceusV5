package n7;

/* loaded from: classes3.dex */
public enum h {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public androidx.core.graphics.a b() {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return androidx.core.graphics.a.MODULATE;
        }
        if (ordinal == 2) {
            return androidx.core.graphics.a.SCREEN;
        }
        if (ordinal == 3) {
            return androidx.core.graphics.a.OVERLAY;
        }
        if (ordinal == 4) {
            return androidx.core.graphics.a.DARKEN;
        }
        if (ordinal == 5) {
            return androidx.core.graphics.a.LIGHTEN;
        }
        if (ordinal != 16) {
            return null;
        }
        return androidx.core.graphics.a.PLUS;
    }
}
