package f1;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010,\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0016\u0010-\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0016\u0010.\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010+¨\u0006/"}, d2 = {"Lf1/w;", "", "Landroid/content/Context;", "context", "Lf1/r0;", "recorder", "Lf1/u;", "outputOptions", "<init>", "(Landroid/content/Context;Lf1/r0;Lf1/u;)V", ve.a.f33391e, "()Landroid/content/Context;", "e", "()Lf1/r0;", rl.d.f30696a, "()Lf1/u;", "Ljava/util/concurrent/Executor;", "c", "()Ljava/util/concurrent/Executor;", "Lx2/a;", "Lf1/b2;", j6.b.f21518e, "()Lx2/a;", "", "f", "()Z", "g", "h", "initialMuted", "k", "(Z)Lf1/w;", "listenerExecutor", "listener", "Lf1/e1;", "i", "(Ljava/util/concurrent/Executor;Lx2/a;)Lf1/e1;", "Lf1/r0;", "Lf1/u;", "Landroid/content/Context;", "applicationContext", "Lx2/a;", "eventListener", "Ljava/util/concurrent/Executor;", "Z", "isAudioEnabled", "isAudioInitialMuted", "isPersistent", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 recorder;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u outputOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public x2.a<b2> eventListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Executor listenerExecutor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isAudioEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isAudioInitialMuted;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isPersistent;

    public w(@NotNull Context context, @NotNull r0 recorder, @NotNull u outputOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        Intrinsics.checkNotNullParameter(outputOptions, "outputOptions");
        this.recorder = recorder;
        this.outputOptions = outputOptions;
        Context a10 = p0.f.a(context);
        Intrinsics.checkNotNullExpressionValue(a10, "getApplicationContext(...)");
        this.applicationContext = a10;
    }

    public static /* synthetic */ w l(w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return wVar.k(z10);
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @Nullable
    public final x2.a<b2> b() {
        return this.eventListener;
    }

    @Nullable
    /* renamed from: c, reason: from getter */
    public final Executor getListenerExecutor() {
        return this.listenerExecutor;
    }

    @NotNull
    /* renamed from: d, reason: from getter */
    public final u getOutputOptions() {
        return this.outputOptions;
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final r0 getRecorder() {
        return this.recorder;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsAudioEnabled() {
        return this.isAudioEnabled;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsAudioInitialMuted() {
        return this.isAudioInitialMuted;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsPersistent() {
        return this.isPersistent;
    }

    @NotNull
    public final e1 i(@NotNull Executor listenerExecutor, @NotNull x2.a<b2> listener) {
        Intrinsics.checkNotNullParameter(listenerExecutor, "listenerExecutor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        x2.g.h(listenerExecutor, "Listener Executor can't be null.");
        x2.g.h(listener, "Event listener can't be null");
        this.listenerExecutor = listenerExecutor;
        this.eventListener = listener;
        e1 u02 = this.recorder.u0(this);
        Intrinsics.checkNotNullExpressionValue(u02, "start(...)");
        return u02;
    }

    @NotNull
    public final w j() {
        return l(this, false, 1, null);
    }

    @NotNull
    public final w k(boolean initialMuted) {
        if (l2.g.b(this.applicationContext, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        x2.g.j(this.recorder.P(), "The Recorder this recording is associated to doesn't support audio.");
        this.isAudioEnabled = true;
        this.isAudioInitialMuted = initialMuted;
        return this;
    }
}
