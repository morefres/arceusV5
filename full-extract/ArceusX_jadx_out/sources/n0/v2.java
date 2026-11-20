package n0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class v2<C> {

    /* renamed from: a, reason: collision with root package name */
    public Set<C> f25597a = new HashSet();

    public void a(List<C> list) {
        this.f25597a.addAll(list);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract v2<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f25597a));
    }
}
