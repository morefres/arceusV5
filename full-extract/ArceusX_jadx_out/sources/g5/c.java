package g5;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u001e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"J)\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001cH&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH&¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\u0007H&¢\u0006\u0004\b'\u0010\tR\u0014\u0010(\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u0016\u0010+\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R(\u00102\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020/\u0018\u00010.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00063À\u0006\u0001"}, d2 = {"Lg5/c;", "Ljava/io/Closeable;", "", "sql", "Lg5/g;", "R1", "(Ljava/lang/String;)Lg5/g;", "", "G", "()V", "r0", "W1", "E0", "n0", "", "D", "()Z", "Lg5/f;", "query", "Landroid/database/Cursor;", "S1", "(Lg5/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "q2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "R", "(Ljava/lang/String;)V", "bindArgs", "p0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "m0", "Q", "isOpen", "getPath", "()Ljava/lang/String;", "path", "c3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", "sqlite"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c extends Closeable {
    boolean D();

    void E0();

    void G();

    @Nullable
    List<Pair<String, String>> N();

    void Q();

    void R(@NotNull String sql);

    @NotNull
    g R1(@NotNull String sql);

    @NotNull
    Cursor S1(@NotNull f query);

    default void W1() {
        G();
    }

    boolean c3();

    @Nullable
    String getPath();

    boolean isOpen();

    boolean m0();

    void n0();

    void p0(@NotNull String sql, @NotNull Object[] bindArgs);

    int q2(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs);

    void r0();
}
