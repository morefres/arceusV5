package backtraceio.library.common.serialization;

import jg.c;
import jg.f;
import jg.g;

/* loaded from: classes.dex */
public class BacktraceGsonBuilder implements CustomGsonBuilder {
    @Override // backtraceio.library.common.serialization.CustomGsonBuilder
    public f buildGson() {
        return new g().g(c.f21688f).d(StackTraceElement.class, new StackTraceElementTypeAdapter()).e(new ThrowableTypeAdapterFactory()).b();
    }
}
