package nb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: classes.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26807a;
    public Boolean b;

    /* renamed from: c, reason: collision with root package name */
    public long f26808c;

    /* renamed from: d, reason: collision with root package name */
    public zzdd f26809d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26810e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f26811f;

    /* renamed from: g, reason: collision with root package name */
    public String f26812g;

    public x8(Context context, zzdd zzddVar, Long l10) {
        this.f26810e = true;
        n9.m.l(context);
        Context applicationContext = context.getApplicationContext();
        n9.m.l(applicationContext);
        this.f26807a = applicationContext;
        this.f26811f = l10;
        if (zzddVar != null) {
            this.f26809d = zzddVar;
            this.f26810e = zzddVar.f7022h;
            this.f26808c = zzddVar.f7021g;
            this.f26812g = zzddVar.f7024j;
            Bundle bundle = zzddVar.f7023i;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
