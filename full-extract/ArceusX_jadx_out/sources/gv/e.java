package gv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import gv.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.voiceengine.AppAudioManagerBase;

/* loaded from: classes2.dex */
public class e extends AppAudioManagerBase {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18870a;
    public final AudioManager b;

    /* renamed from: c, reason: collision with root package name */
    public AppAudioManagerBase.AudioManagerEvents f18871c;

    /* renamed from: d, reason: collision with root package name */
    public c f18872d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18874f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18875g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18876h;

    /* renamed from: j, reason: collision with root package name */
    public final b f18878j;

    /* renamed from: k, reason: collision with root package name */
    public b f18879k;

    /* renamed from: l, reason: collision with root package name */
    public final h f18880l;

    /* renamed from: n, reason: collision with root package name */
    public final BroadcastReceiver f18882n;

    /* renamed from: o, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f18883o;

    /* renamed from: p, reason: collision with root package name */
    public AudioFocusRequest f18884p;

    /* renamed from: e, reason: collision with root package name */
    public int f18873e = -2;

    /* renamed from: i, reason: collision with root package name */
    public int f18877i = 0;

    /* renamed from: m, reason: collision with root package name */
    public Set<b> f18881m = new HashSet();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18885a;

        static {
            int[] iArr = new int[b.values().length];
            f18885a = iArr;
            try {
                iArr[b.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18885a[b.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18885a[b.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18885a[b.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    public enum c {
        UNINITIALIZED,
        RUNNING
    }

    public class d extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("state", 0);
            int intExtra2 = intent.getIntExtra("microphone", 0);
            String stringExtra = intent.getStringExtra("name");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WiredHeadsetReceiver.onReceive");
            sb2.append(hv.a.k());
            sb2.append(": a=");
            sb2.append(intent.getAction());
            sb2.append(", s=");
            sb2.append(intExtra == 0 ? "unplugged" : "plugged");
            sb2.append(", m=");
            sb2.append(intExtra2 == 1 ? "mic" : "no mic");
            sb2.append(", n=");
            sb2.append(stringExtra);
            sb2.append(", sb=");
            sb2.append(isInitialStickyBroadcast());
            Log.d("AppRtcAudioManager", sb2.toString());
            e.this.f18876h = intExtra == 1;
            e.this.s();
        }

        public d() {
        }
    }

    public e(Context context) {
        Log.d("AppRtcAudioManager", "ctor");
        hv.a.f();
        this.f18870a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.f18880l = h.n(context, new h.f() { // from class: gv.c
            @Override // gv.h.f
            public final void a() {
                e.this.s();
            }
        });
        this.f18882n = new d();
        this.f18872d = c.UNINITIALIZED;
        b bVar = b.SPEAKER_PHONE;
        this.f18878j = bVar;
        Log.d("AppRtcAudioManager", "defaultAudioDevice: " + bVar);
        hv.a.u("AppRtcAudioManager");
        setInstance(this);
    }

    public static e g(Context context) {
        return new e(context);
    }

    public final void f() {
        AudioManager audioManager = this.b;
        if (audioManager == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(this.f18884p);
    }

    public final boolean h() {
        return this.f18870a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public final boolean i() {
        AudioManager audioManager = this.b;
        if (audioManager == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d("AppRtcAudioManager", "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d("AppRtcAudioManager", "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    public final void k(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f18870a.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final void l() {
        if (this.b == null) {
            return;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.f18883o).build();
        this.f18884p = build;
        Log.d("AppRtcAudioManager", "requestAudioFocusNew: result = " + hv.a.h(this.b.requestAudioFocus(build)));
    }

    public final void m(b bVar) {
        Log.d("AppRtcAudioManager", "setAudioDeviceInternal(device=" + bVar + ")");
        hv.a.a(this.f18881m.contains(bVar));
        int i10 = a.f18885a[bVar.ordinal()];
        if (i10 == 1) {
            o(true);
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            o(false);
        } else {
            Log.e("AppRtcAudioManager", "Invalid audio device selection");
        }
        this.f18879k = bVar;
    }

    public final void n(boolean z10) {
        AudioManager audioManager = this.b;
        if (audioManager == null || audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.b.setMicrophoneMute(z10);
    }

    public final void o(boolean z10) {
        AudioManager audioManager = this.b;
        if (audioManager == null || audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        this.b.setSpeakerphoneOn(z10);
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void onDispose() {
        if (this.f18872d != c.UNINITIALIZED) {
            stopCommunication();
        }
    }

    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "start");
        hv.a.f();
        if (this.b == null) {
            Log.w("AppRtcAudioManager", "start: audioManager == null");
            return;
        }
        c cVar = this.f18872d;
        c cVar2 = c.RUNNING;
        if (cVar == cVar2) {
            Log.w("AppRtcAudioManager", "AudioManager is already active");
            return;
        }
        Log.d("AppRtcAudioManager", "AudioManager starts...");
        this.f18871c = audioManagerEvents;
        this.f18872d = cVar2;
        this.f18873e = this.b.getMode();
        this.f18874f = this.b.isSpeakerphoneOn();
        this.f18875g = this.b.isMicrophoneMute();
        this.f18876h = i();
        this.f18883o = new AudioManager.OnAudioFocusChangeListener() { // from class: gv.d
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Log.d("AppRtcAudioManager", "onAudioFocusChange: " + hv.a.g(i10));
            }
        };
        l();
        hv.a.w("AppRtcAudioManager", this.b, 3);
        n(false);
        this.f18879k = b.NONE;
        this.f18881m.clear();
        this.f18880l.E();
        s();
        k(this.f18882n, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("AppRtcAudioManager", "AudioManager started");
    }

    public void q() {
        Log.d("AppRtcAudioManager", "stop");
        hv.a.f();
        if (this.f18872d != c.RUNNING) {
            Log.w("AppRtcAudioManager", "Trying to stop AudioManager in incorrect state: " + this.f18872d);
            return;
        }
        this.f18872d = c.UNINITIALIZED;
        r(this.f18882n);
        this.f18880l.I();
        if (this.b != null) {
            o(this.f18874f);
            n(this.f18875g);
            int i10 = this.f18873e;
            if (i10 != -2) {
                hv.a.w("AppRtcAudioManager", this.b, i10);
            }
            f();
        }
        this.f18883o = null;
        Log.d("AppRtcAudioManager", "Abandoned audio focus for VOICE_CALL streams");
        this.f18871c = null;
        Log.d("AppRtcAudioManager", "AudioManager stopped");
    }

    public final void r(BroadcastReceiver broadcastReceiver) {
        this.f18870a.unregisterReceiver(broadcastReceiver);
    }

    public final void s() {
        hv.a.f();
        Log.d("AppRtcAudioManager", "---> updateAudioDeviceState: wired headset=" + this.f18876h + ", BT isHeadsetAvailable=" + this.f18880l.s());
        Log.d("AppRtcAudioManager", "Device status: available=" + this.f18881m + ", selected=" + this.f18879k);
        AudioManager audioManager = this.b;
        if (audioManager != null && audioManager.getMode() != 3) {
            Log.w("AppRtcAudioManager", "Mode != MODE_IN_COMMUNICATION");
            hv.a.w("AppRtcAudioManager", this.b, 3);
        }
        if (this.f18872d == c.UNINITIALIZED) {
            Log.d("AppRtcAudioManager", "updateAudioDeviceState: amState == AudioManagerState.UNINITIALIZED");
            return;
        }
        HashSet hashSet = new HashSet();
        if (this.f18880l.t()) {
            hashSet.add(b.BLUETOOTH);
        }
        if (this.f18876h) {
            hashSet.add(b.WIRED_HEADSET);
        } else {
            hashSet.add(b.SPEAKER_PHONE);
            if (h()) {
                hashSet.add(b.EARPIECE);
            }
        }
        boolean equals = this.f18881m.equals(hashSet);
        this.f18881m = hashSet;
        b bVar = this.f18880l.t() ? b.BLUETOOTH : this.f18876h ? b.WIRED_HEADSET : this.f18878j;
        if (bVar != this.f18879k || !equals) {
            m(bVar);
            Log.d("AppRtcAudioManager", "New device status: available=" + this.f18881m + ", selected=" + bVar);
            if (this.f18871c != null) {
                HashSet hashSet2 = new HashSet();
                Iterator<b> it = this.f18881m.iterator();
                while (it.hasNext()) {
                    hashSet2.add(it.next().toString());
                }
                this.f18871c.onAudioDeviceChanged(this.f18879k.toString(), hashSet2);
            }
        }
        Log.d("AppRtcAudioManager", "<--- updateAudioDeviceState done");
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void setActivityForPermissionRequest(j.b bVar) {
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void startCommunication(final AppAudioManagerBase.AudioManagerEvents audioManagerEvents) {
        Log.d("AppRtcAudioManager", "startCommunication");
        this.f18877i++;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: gv.a
            @Override // java.lang.Runnable
            public final void run() {
                e.this.j(audioManagerEvents);
            }
        });
    }

    @Override // org.webrtc.voiceengine.AppAudioManagerBase
    public void stopCommunication() {
        Log.d("AppRtcAudioManager", "stopCommunication");
        int i10 = this.f18877i - 1;
        this.f18877i = i10;
        if (i10 == 0) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: gv.b
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.q();
                }
            });
        }
    }
}
