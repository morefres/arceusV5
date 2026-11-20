package ln;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class a0 implements sn.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f23551a;
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList<sn.a> f23552c = new LinkedList<>();

    public a0(char c10) {
        this.f23551a = c10;
    }

    @Override // sn.a
    public char a() {
        return this.f23551a;
    }

    @Override // sn.a
    public int b() {
        return this.b;
    }

    @Override // sn.a
    public char c() {
        return this.f23551a;
    }

    @Override // sn.a
    public int d(sn.b bVar, sn.b bVar2) {
        return f(bVar.length()).d(bVar, bVar2);
    }

    public void e(sn.a aVar) {
        int b = aVar.b();
        ListIterator<sn.a> listIterator = this.f23552c.listIterator();
        while (listIterator.hasNext()) {
            sn.a next = listIterator.next();
            int b10 = next.b();
            if (b > b10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (b == b10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f23551a + "' and minimum length " + b + "; conflicting processors: " + next + ", " + aVar);
            }
        }
        this.f23552c.add(aVar);
        this.b = b;
    }

    public final sn.a f(int i10) {
        Iterator<sn.a> it = this.f23552c.iterator();
        while (it.hasNext()) {
            sn.a next = it.next();
            if (next.b() <= i10) {
                return next;
            }
        }
        return this.f23552c.getFirst();
    }
}
