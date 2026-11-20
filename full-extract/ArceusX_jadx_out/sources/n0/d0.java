package n0;

/* loaded from: classes.dex */
public enum d0 {
    UNKNOWN,
    NONE,
    READY,
    FIRED;

    public int b() {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 1;
        }
        return 3;
    }
}
