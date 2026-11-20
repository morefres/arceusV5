package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface q {

    /* renamed from: yo, reason: collision with root package name */
    public static final q f6791yo = new v();

    /* renamed from: zo, reason: collision with root package name */
    public static final q f6792zo = new o();
    public static final q Ao = new h("continue");
    public static final q Bo = new h("break");
    public static final q Co = new h("return");
    public static final q Do = new g(Boolean.TRUE);
    public static final q Eo = new g(Boolean.FALSE);
    public static final q Fo = new u("");

    q a();

    q e(String str, u4 u4Var, List list);

    String zzc();

    Double zzd();

    Boolean zze();

    Iterator zzf();
}
