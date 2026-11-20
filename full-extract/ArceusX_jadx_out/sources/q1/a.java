package q1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zl.t;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003\u0019\u0017\u0015B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010!R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001eR\u0016\u00109\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010&R\u0016\u0010?\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010&R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u0018R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\u001e¨\u0006I"}, d2 = {"Lq1/a;", "", "Landroid/content/Context;", "context", "", "spanSlop", "minSpan", "Lq1/a$b;", "listener", "<init>", "(Landroid/content/Context;IILq1/a$b;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "f", "(Landroid/view/MotionEvent;)Z", "e", "()Z", "", rl.d.f30696a, "()F", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "I", "c", "Lq1/a$b;", "focusX", "focusY", "g", "Z", "isQuickZoomEnabled", "setQuickZoomEnabled", "(Z)V", "h", "isStylusZoomEnabled", "setStylusZoomEnabled", "i", "F", "currentSpan", "j", "previousSpan", "k", "currentSpanX", "l", "currentSpanY", "m", "previousSpanX", "n", "previousSpanY", "", "o", "J", "eventTime", "p", "isInProgress", "q", "initialSpan", "r", "prevTime", "s", "anchoredZoomStartX", t.f38095d, "anchoredZoomStartY", "u", "anchoredZoomMode", "Landroid/view/GestureDetector;", "v", "Landroid/view/GestureDetector;", "gestureDetector", "w", "eventBeforeOrAboveStartingGestureEvent", "x", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    public final int spanSlop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int minSpan;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b listener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int focusX;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int focusY;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isQuickZoomEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isStylusZoomEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float currentSpan;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float previousSpan;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public float currentSpanX;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float currentSpanY;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float previousSpanX;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float previousSpanY;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public long eventTime;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean isInProgress;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public float initialSpan;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public long prevTime;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public float anchoredZoomStartX;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float anchoredZoomStartY;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public int anchoredZoomMode;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public GestureDetector gestureDetector;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean eventBeforeOrAboveStartingGestureEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lq1/a$b;", "", "Lq1/a$c;", "zoomEvent", "", ve.a.f33391e, "(Lq1/a$c;)Z", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        boolean a(@NotNull c zoomEvent);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001:\u0003\t\u0011\rB'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lq1/a$c;", "", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", ve.a.f33391e, "J", "getEventTime", "()J", j6.b.f21518e, "I", "getFocusX", "()I", "c", "getFocusY", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final long eventTime;

        /* renamed from: b, reason: from kotlin metadata */
        public final int focusX;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int focusY;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq1/a$c$a;", "Lq1/a$c;", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: q1.a$c$a, reason: collision with other inner class name */
        public static final class C0513a extends c {
            public C0513a(long j10, int i10, int i11) {
                super(j10, i10, i11, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq1/a$c$b;", "Lq1/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", rl.d.f30696a, "F", "getIncrementalScaleFactor", "()F", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final float incrementalScaleFactor;

            public b(long j10, int i10, int i11, float f10) {
                super(j10, i10, i11, null);
                this.incrementalScaleFactor = f10;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq1/a$c$c;", "Lq1/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", rl.d.f30696a, "F", ve.a.f33391e, "()F", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: q1.a$c$c, reason: collision with other inner class name */
        public static final class C0514c extends c {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            public final float incrementalScaleFactor;

            public C0514c(long j10, int i10, int i11, float f10) {
                super(j10, i10, i11, null);
                this.incrementalScaleFactor = f10;
            }

            /* renamed from: a, reason: from getter */
            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public /* synthetic */ c(long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, i10, i11);
        }

        public c(long j10, int i10, int i11) {
            this.eventTime = j10;
            this.focusX = i10;
            this.focusY = i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"q1/a$d", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            a.this.anchoredZoomStartX = e10.getX();
            a.this.anchoredZoomStartY = e10.getY();
            a.this.anchoredZoomMode = 1;
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public a(@NotNull Context context, @NotNull b listener) {
        this(context, 0, 0, listener, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public final float d() {
        if (!e()) {
            float f10 = this.previousSpan;
            if (f10 > 0.0f) {
                return this.currentSpan / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.eventBeforeOrAboveStartingGestureEvent;
        boolean z11 = (z10 && this.currentSpan < this.previousSpan) || (!z10 && this.currentSpan > this.previousSpan);
        float abs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= this.spanSlop) {
            return 1.0f;
        }
        return z11 ? abs + 1.0f : 1.0f - abs;
    }

    public final boolean e() {
        return this.anchoredZoomMode != 0;
    }

    public final boolean f(@NotNull MotionEvent event) {
        boolean z10;
        float f10;
        float f11;
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z11 = (event.getButtonState() & 32) != 0;
        boolean z12 = this.anchoredZoomMode == 2 && !z11;
        boolean z13 = actionMasked == 1 || actionMasked == 3 || z12;
        float f12 = 0.0f;
        if (actionMasked == 0 || z13) {
            if (this.isInProgress) {
                z10 = true;
                this.listener.a(new c.b(this.eventTime, this.focusX, this.focusY, d()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else {
                z10 = true;
                if (e() && z13) {
                    this.isInProgress = false;
                    this.initialSpan = 0.0f;
                    this.anchoredZoomMode = 0;
                }
            }
            if (z13) {
                return z10;
            }
        } else {
            z10 = true;
        }
        if (!this.isInProgress && this.isStylusZoomEnabled && !e() && !z13 && z11) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z14 = (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z12) ? z10 : false;
        boolean z15 = actionMasked == 6 ? z10 : false;
        int actionIndex = z15 ? event.getActionIndex() : -1;
        int i10 = z15 ? pointerCount - 1 : pointerCount;
        if (e()) {
            f11 = this.anchoredZoomStartX;
            f10 = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f10 ? z10 : false;
        } else {
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    f13 += event.getX(i11);
                    f14 += event.getY(i11);
                }
            }
            float f15 = i10;
            float f16 = f13 / f15;
            f10 = f14 / f15;
            f11 = f16;
        }
        float f17 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f12 += Math.abs(event.getX(i12) - f11);
                f17 += Math.abs(event.getY(i12) - f10);
            }
        }
        float f18 = i10;
        float f19 = f12 / f18;
        float f20 = f17 / f18;
        float f21 = 2;
        float f22 = f19 * f21;
        float f23 = f20 * f21;
        float hypot = e() ? f23 : (float) Math.hypot(f22, f23);
        boolean z16 = this.isInProgress;
        this.focusX = bu.b.d(f11);
        this.focusY = bu.b.d(f10);
        if (!e() && this.isInProgress && (hypot < this.minSpan || z14)) {
            this.listener.a(new c.b(this.eventTime, this.focusX, this.focusY, d()));
            this.isInProgress = false;
            this.initialSpan = hypot;
        }
        if (z14) {
            this.currentSpanX = f22;
            this.previousSpanX = f22;
            this.currentSpanY = f23;
            this.previousSpanY = f23;
            this.currentSpan = hypot;
            this.previousSpan = hypot;
            this.initialSpan = hypot;
        }
        int i13 = e() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && hypot >= i13 && (z16 || Math.abs(hypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f22;
            this.previousSpanX = f22;
            this.currentSpanY = f23;
            this.previousSpanY = f23;
            this.currentSpan = hypot;
            this.previousSpan = hypot;
            long j10 = this.eventTime;
            this.prevTime = j10;
            this.isInProgress = this.listener.a(new c.C0513a(j10, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f22;
            this.currentSpanY = f23;
            this.currentSpan = hypot;
            if (this.isInProgress ? this.listener.a(new c.C0514c(this.eventTime, this.focusX, this.focusY, d())) : z10) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return z10;
    }

    @SuppressLint({"ExecutorRegistration"})
    public a(@NotNull Context context, int i10, int i11, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.spanSlop = i10;
        this.minSpan = i11;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new d());
    }

    public /* synthetic */ a(Context context, int i10, int i11, b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i10, (i12 & 4) != 0 ? 0 : i11, bVar);
    }
}
