package mf;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final List<c<?>> f24461a;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f24461a = list;
    }
}
