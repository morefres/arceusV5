package f7;

/* loaded from: classes3.dex */
public enum x0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean b(int i10, boolean z10, int i11) {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
