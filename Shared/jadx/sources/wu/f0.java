package wu;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u001b"}, d2 = {"Lwu/f0;", "Lkotlin/collections/d;", "Lwu/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lwu/h;[I)V", "", "index", "e", "(I)Lwu/h;", j6.b.f21518e, "[Lwu/h;", "f", "()[Lwu/h;", "c", "[I", "g", "()[I", "()I", "size", rl.d.f30696a, ve.a.f33391e, "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f0 extends kotlin.collections.d<h> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h[] byteStrings;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] trie;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ[\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\n*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lwu/f0$a;", "", "<init>", "()V", "", "Lwu/h;", "byteStrings", "Lwu/f0;", rl.d.f30696a, "([Lwu/h;)Lwu/f0;", "", "nodeOffset", "Lwu/e;", "node", "", "byteStringOffset", "", "fromIndex", "toIndex", "indexes", "", ve.a.f33391e, "(JLwu/e;ILjava/util/List;IILjava/util/List;)V", "c", "(Lwu/e;)J", "intCount", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: wu.f0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(Companion companion, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.a(j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        public final void a(long nodeOffset, e node, int byteStringOffset, List<? extends h> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i10;
            int i11;
            int i12;
            long j10;
            int i13 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = fromIndex; i14 < toIndex; i14++) {
                if (byteStrings.get(i14).I() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = byteStrings.get(fromIndex);
            h hVar2 = byteStrings.get(toIndex - 1);
            if (i13 == hVar.I()) {
                int intValue = indexes.get(fromIndex).intValue();
                int i15 = fromIndex + 1;
                h hVar3 = byteStrings.get(i15);
                i10 = i15;
                i11 = intValue;
                hVar = hVar3;
            } else {
                i10 = fromIndex;
                i11 = -1;
            }
            if (hVar.j(i13) == hVar2.j(i13)) {
                int min = Math.min(hVar.I(), hVar2.I());
                int i16 = 0;
                for (int i17 = i13; i17 < min && hVar.j(i17) == hVar2.j(i17); i17++) {
                    i16++;
                }
                long c10 = nodeOffset + c(node) + 2 + i16 + 1;
                node.writeInt(-i16);
                node.writeInt(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    node.writeInt(hVar.j(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == toIndex) {
                    if (i18 != byteStrings.get(i10).I()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i10).intValue());
                    return;
                } else {
                    e eVar = new e();
                    node.writeInt(((int) (c(eVar) + c10)) * (-1));
                    a(c10, eVar, i18, byteStrings, i10, toIndex, indexes);
                    node.d3(eVar);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < toIndex; i20++) {
                if (byteStrings.get(i20 - 1).j(i13) != byteStrings.get(i20).j(i13)) {
                    i19++;
                }
            }
            long c11 = nodeOffset + c(node) + 2 + (i19 * 2);
            node.writeInt(i19);
            node.writeInt(i11);
            for (int i21 = i10; i21 < toIndex; i21++) {
                byte j11 = byteStrings.get(i21).j(i13);
                if (i21 == i10 || j11 != byteStrings.get(i21 - 1).j(i13)) {
                    node.writeInt(j11 & 255);
                }
            }
            e eVar2 = new e();
            while (i10 < toIndex) {
                byte j12 = byteStrings.get(i10).j(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= toIndex) {
                        i12 = toIndex;
                        break;
                    } else {
                        if (j12 != byteStrings.get(i23).j(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == byteStrings.get(i10).I()) {
                    node.writeInt(indexes.get(i10).intValue());
                    j10 = c11;
                } else {
                    node.writeInt(((int) (c(eVar2) + c11)) * (-1));
                    j10 = c11;
                    a(j10, eVar2, i13 + 1, byteStrings, i10, i12, indexes);
                }
                c11 = j10;
                i10 = i12;
            }
            node.d3(eVar2);
        }

        public final long c(e eVar) {
            return eVar.getSize() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final wu.f0 d(@org.jetbrains.annotations.NotNull wu.h... r17) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wu.f0.Companion.d(wu.h[]):wu.f0");
        }

        public Companion() {
        }
    }

    public /* synthetic */ f0(h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    @NotNull
    public static final f0 l(@NotNull h... hVarArr) {
        return INSTANCE.d(hVarArr);
    }

    @Override // kotlin.collections.b
    /* renamed from: b */
    public int getSize() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return d((h) obj);
        }
        return false;
    }

    public /* bridge */ boolean d(h hVar) {
        return super.contains(hVar);
    }

    @Override // kotlin.collections.d, java.util.List
    @NotNull
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public h get(int index) {
        return this.byteStrings[index];
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final h[] getByteStrings() {
        return this.byteStrings;
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int i(h hVar) {
        return super.indexOf(hVar);
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return i((h) obj);
        }
        return -1;
    }

    public /* bridge */ int k(h hVar) {
        return super.lastIndexOf(hVar);
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return k((h) obj);
        }
        return -1;
    }

    public f0(h[] hVarArr, int[] iArr) {
        this.byteStrings = hVarArr;
        this.trie = iArr;
    }
}
