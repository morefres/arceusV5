package gv;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18895a;
    public final f b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f18896c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f18897d;

    /* renamed from: e, reason: collision with root package name */
    public int f18898e;

    /* renamed from: f, reason: collision with root package name */
    public e f18899f;

    /* renamed from: g, reason: collision with root package name */
    public final BluetoothProfile.ServiceListener f18900g;

    /* renamed from: h, reason: collision with root package name */
    public BluetoothAdapter f18901h;

    /* renamed from: i, reason: collision with root package name */
    public BluetoothHeadset f18902i;

    /* renamed from: j, reason: collision with root package name */
    public BluetoothDevice f18903j;

    /* renamed from: k, reason: collision with root package name */
    public final BroadcastReceiver f18904k;

    /* renamed from: l, reason: collision with root package name */
    public AudioDeviceCallback f18905l;

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f18906m = new Runnable() { // from class: gv.g
        @Override // java.lang.Runnable
        public final void run() {
            h.this.j();
        }
    };

    public class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesAdded");
            if (hv.a.m(audioDeviceInfoArr, true)) {
                h.this.y();
            }
            if (hv.a.m(audioDeviceInfoArr, false) && h.this.f18899f == e.SCO_CONNECTED) {
                Log.d("AppRtcBluetoothMgr", "SCO_CONNECTED state but device in A2DP. Reconnecting...");
                h.this.f18899f = e.HEADSET_AVAILABLE;
                h.this.y();
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            Log.d("AppRtcBluetoothMgr", "onAudioDevicesRemoved");
            if (hv.a.m(audioDeviceInfoArr, true)) {
                h.this.z();
            }
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18908a;

        static {
            int[] iArr = new int[e.values().length];
            f18908a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18908a[e.SCO_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18908a[e.SCO_DISCONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18908a[e.HEADSET_UNAVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18908a[e.HEADSET_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18908a[e.SCO_CONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class c extends BroadcastReceiver {
        public void a(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onAudioStateChanged: a=ACTION_AUDIO_STATE_CHANGED, s=" + hv.a.d(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + h.this.f18899f);
            switch (intExtra) {
                case 10:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now disconnected");
                    if (!isInitialStickyBroadcast()) {
                        h.this.x();
                        break;
                    } else {
                        Log.d("AppRtcBluetoothMgr", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                        break;
                    }
                case 11:
                    Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connecting...");
                    break;
                case 12:
                    h.this.w();
                    break;
            }
        }

        public void b(@NonNull Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onConnectionStateChanged: a=ACTION_CONNECTION_STATE_CHANGED, s=" + hv.a.e(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + h.this.f18899f);
            if (intExtra == 0) {
                h.this.z();
            } else {
                if (intExtra != 2) {
                    return;
                }
                h.this.y();
            }
        }

        public void c(Intent intent) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            Log.d("AppRtcBluetoothMgr", "BluetoothHeadsetBroadcastReceiver.onScoAudioStateUpdate: action=" + intent.getAction() + ", EXTRA_SCO_AUDIO_STATE=" + hv.a.c(intExtra) + ", EXTRA_SCO_AUDIO_PREVIOUS_STATE=" + hv.a.c(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", 0)) + ", sb=" + isInitialStickyBroadcast() + ", bluetoothState= " + h.this.f18899f);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    return;
                }
                h.this.w();
            } else {
                if (isInitialStickyBroadcast()) {
                    return;
                }
                h.this.x();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (h.this.f18899f == e.UNINITIALIZED) {
                return;
            }
            String action = intent.getAction();
            Log.d("AppRtcBluetoothMgr", ">>> BluetoothHeadsetBroadcastReceiver.onReceive: action=" + action);
            if (intent.getExtras() != null) {
                Log.d("AppRtcBluetoothMgr", ">>> BluetoothHeadsetBroadcastReceiver.onReceive: extras=" + intent.getExtras().toString());
            }
            action.getClass();
            switch (action) {
                case "android.media.ACTION_SCO_AUDIO_STATE_UPDATED":
                    c(intent);
                    break;
                case "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED":
                    a(intent);
                    break;
                case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED":
                    b(intent);
                    break;
            }
            Log.d("AppRtcBluetoothMgr", "<<< BluetoothHeadsetBroadcastReceiver.onReceive done: BT state=" + h.this.f18899f);
        }

        public c() {
        }
    }

    public class d implements BluetoothProfile.ServiceListener {
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            if (i10 != 1 || h.this.f18899f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceConnected: BT state=" + h.this.f18899f);
            h.this.A((BluetoothHeadset) bluetoothProfile);
            Log.d("AppRtcBluetoothMgr", "onServiceConnected done: BT state=" + h.this.f18899f);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            if (i10 != 1 || h.this.f18899f == e.UNINITIALIZED) {
                return;
            }
            Log.d("AppRtcBluetoothMgr", "BluetoothServiceListener.onServiceDisconnected: BT state=" + h.this.f18899f);
            h.this.B();
            Log.d("AppRtcBluetoothMgr", "onServiceDisconnected done: BT state=" + h.this.f18899f);
        }

        public d() {
        }
    }

    public enum e {
        UNINITIALIZED,
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    public interface f {
        void a();
    }

    public h(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "ctor");
        hv.a.f();
        this.f18895a = context;
        this.b = fVar;
        this.f18896c = o(context);
        this.f18899f = e.UNINITIALIZED;
        this.f18900g = new d();
        this.f18904k = new c();
        this.f18897d = new Handler(Looper.getMainLooper());
    }

    public static h n(Context context, f fVar) {
        Log.d("AppRtcBluetoothMgr", "create" + hv.a.k());
        return new h(context, fVar);
    }

    public final void A(BluetoothHeadset bluetoothHeadset) {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileConnected");
        this.f18902i = bluetoothHeadset;
        N();
    }

    public final void B() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetProfileDisconnected");
        K();
        this.f18902i = null;
        this.f18903j = null;
        N();
    }

    public final void C() {
        Log.d("AppRtcBluetoothMgr", "registerAudioDeviceCallback");
        if (this.f18905l != null || this.f18896c == null) {
            return;
        }
        a aVar = new a();
        this.f18905l = aVar;
        this.f18896c.registerAudioDeviceCallback(aVar, this.f18897d);
    }

    public Intent D(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.f18895a.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void E() {
        hv.a.f();
        Log.d("AppRtcBluetoothMgr", "start");
        Log.d("AppRtcBluetoothMgr", "Starting AppRtcBluetoothManager...");
        AudioManager audioManager = this.f18896c;
        if (audioManager == null) {
            Log.w("AppRtcBluetoothMgr", "audioManager == null");
            return;
        }
        if (this.f18899f != e.UNINITIALIZED) {
            Log.w("AppRtcBluetoothMgr", "Invalid BT state");
            return;
        }
        this.f18902i = null;
        this.f18903j = null;
        this.f18898e = 0;
        if (!audioManager.isBluetoothScoAvailableOffCall()) {
            Log.e("AppRtcBluetoothMgr", "Bluetooth SCO audio is not available off call");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f18901h = defaultAdapter;
        if (defaultAdapter == null) {
            Log.w("AppRtcBluetoothMgr", "Device does not support Bluetooth");
            return;
        }
        if (!p(this.f18895a, this.f18900g)) {
            Log.e("AppRtcBluetoothMgr", "BluetoothAdapter.getBluetoothHeadsetProfileProxy failed");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        Intent D = D(this.f18904k, intentFilter);
        if (D != null) {
            Log.d("AppRtcBluetoothMgr", "start: bluetoothHeadsetReceiver registered. receiverIntent.action=" + D.getAction() + " receiverIntent.extras=" + D.getExtras());
        }
        Log.d("AppRtcBluetoothMgr", "Bluetooth proxy for headset profile has started.");
        if (!k()) {
            C();
        }
        m(e.HEADSET_UNAVAILABLE);
        Log.d("AppRtcBluetoothMgr", "start done: BT state=" + this.f18899f);
    }

    public final void F() {
        AudioManager audioManager = this.f18896c;
        if (audioManager == null) {
            return;
        }
        audioManager.startBluetoothSco();
        this.f18896c.setBluetoothScoOn(true);
    }

    public final boolean G() {
        hv.a.f();
        if (this.f18896c == null) {
            Log.w("AppRtcBluetoothMgr", "startScoAudio: audioManager == null");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "startSco: BT state=" + this.f18899f + ", attempts: " + this.f18898e + ", SCO is on: " + u());
        if (this.f18898e >= 2) {
            Log.e("AppRtcBluetoothMgr", "BT SCO connection fails - no more attempts");
            return false;
        }
        Log.d("AppRtcBluetoothMgr", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
        F();
        this.f18898e++;
        H();
        Log.d("AppRtcBluetoothMgr", "startScoAudio done: BT state=" + this.f18899f + ", SCO is on: " + u());
        return true;
    }

    public final void H() {
        hv.a.f();
        Log.d("AppRtcBluetoothMgr", "startTimer");
        this.f18897d.removeCallbacks(this.f18906m);
        this.f18897d.postDelayed(this.f18906m, 4000L);
    }

    public void I() {
        hv.a.f();
        Log.d("AppRtcBluetoothMgr", "stop: BT state=" + this.f18899f);
        if (this.f18901h == null) {
            return;
        }
        e eVar = this.f18899f;
        e eVar2 = e.UNINITIALIZED;
        if (eVar == eVar2) {
            return;
        }
        L();
        K();
        M(this.f18904k);
        l();
        BluetoothHeadset bluetoothHeadset = this.f18902i;
        if (bluetoothHeadset != null) {
            this.f18901h.closeProfileProxy(1, bluetoothHeadset);
            this.f18902i = null;
        }
        this.f18901h = null;
        this.f18903j = null;
        m(eVar2);
        Log.d("AppRtcBluetoothMgr", "stop done: BT state=" + this.f18899f);
    }

    public final void J() {
        AudioManager audioManager = this.f18896c;
        if (audioManager == null) {
            return;
        }
        audioManager.stopBluetoothSco();
        this.f18896c.setBluetoothScoOn(false);
    }

    public final void K() {
        hv.a.f();
        if (this.f18896c == null) {
            Log.w("AppRtcBluetoothMgr", "stopScoAudio: audioManager == null");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "stopScoAudio: BT state=" + this.f18899f + ", SCO is on: " + u());
        e eVar = this.f18899f;
        if (eVar == e.SCO_CONNECTING || eVar == e.SCO_CONNECTED) {
            l();
            J();
            m(e.SCO_DISCONNECTING);
            Log.d("AppRtcBluetoothMgr", "stopScoAudio done: BT state=" + this.f18899f + ", SCO is on: " + u());
        }
    }

    public final void L() {
        AudioManager audioManager;
        Log.d("AppRtcBluetoothMgr", "unregisterAudioDeviceCallback");
        AudioDeviceCallback audioDeviceCallback = this.f18905l;
        if (audioDeviceCallback == null || (audioManager = this.f18896c) == null) {
            return;
        }
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
    }

    public void M(BroadcastReceiver broadcastReceiver) {
        this.f18895a.unregisterReceiver(broadcastReceiver);
    }

    public final synchronized void N() {
        try {
            Log.d("AppRtcBluetoothMgr", "update: bluetoothState=" + this.f18899f);
            e eVar = this.f18899f;
            int i10 = b.f18908a[eVar.ordinal()];
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                eVar = P() ? e.HEADSET_AVAILABLE : e.HEADSET_UNAVAILABLE;
            } else if (i10 == 6 && r()) {
                eVar = e.SCO_CONNECTED;
            }
            if (eVar == e.HEADSET_AVAILABLE && this.f18898e < 2) {
                Log.d("AppRtcBluetoothMgr", "Starting SCO Audio...");
                if (G()) {
                    eVar = e.SCO_CONNECTING;
                }
            }
            if (eVar != this.f18899f) {
                m(eVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void O() {
        hv.a.f();
        Log.d("AppRtcBluetoothMgr", "updateAudioDeviceState");
        v();
        f fVar = this.b;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final boolean P() {
        boolean z10 = false;
        if (this.f18899f == e.UNINITIALIZED) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: not initialized!");
            return false;
        }
        if (this.f18902i == null) {
            Log.d("AppRtcBluetoothMgr", "updateDevice: bluetoothHeadset is null. bluetoothState=" + this.f18899f);
            return false;
        }
        if (k()) {
            BluetoothDevice j10 = hv.a.j("AppRtcBluetoothMgr", this.f18895a, this.f18902i);
            this.f18903j = j10;
            if (j10 == null) {
                Log.d("AppRtcBluetoothMgr", "updateDevice: No connected bluetooth headset");
            } else {
                hv.a.t("AppRtcBluetoothMgr", this.f18895a, this.f18902i, j10);
                z10 = true;
            }
        } else {
            AudioManager audioManager = this.f18896c;
            if (audioManager != null) {
                hv.a.r("AppRtcBluetoothMgr", audioManager);
                z10 = hv.a.l(this.f18896c, false);
                Log.d("AppRtcBluetoothMgr", "updateDevice: permission not granted, bluetoothState=" + this.f18899f);
            }
        }
        Log.d("AppRtcBluetoothMgr", "updateDevice done: hasBluetoothHeadset=" + z10);
        return z10;
    }

    public final void j() {
        boolean r8;
        hv.a.f();
        if (this.f18899f == e.UNINITIALIZED || this.f18902i == null) {
            Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: not initialized! BT state=" + this.f18899f);
            return;
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout: BT state=" + this.f18899f + ", attempts: " + this.f18898e + ", SCO is on: " + u());
        if (this.f18899f != e.SCO_CONNECTING) {
            return;
        }
        if (k()) {
            BluetoothDevice i10 = hv.a.i("AppRtcBluetoothMgr", this.f18895a, this.f18902i);
            this.f18903j = i10;
            r8 = i10 != null;
        } else {
            r8 = r();
        }
        if (r8) {
            w();
        } else {
            Log.w("AppRtcBluetoothMgr", "BT failed to connect after timeout");
            K();
        }
        Log.d("AppRtcBluetoothMgr", "bluetoothTimeout done: BT state=" + this.f18899f);
    }

    public boolean k() {
        return Build.VERSION.SDK_INT < 31;
    }

    public final void l() {
        hv.a.f();
        Log.d("AppRtcBluetoothMgr", "cancelTimer");
        this.f18897d.removeCallbacks(this.f18906m);
    }

    public final void m(e eVar) {
        if (eVar != this.f18899f) {
            Log.d("AppRtcBluetoothMgr", "Changing state from " + this.f18899f + " to " + eVar);
            this.f18899f = eVar;
            if (eVar != e.UNINITIALIZED) {
                O();
            }
        }
    }

    public AudioManager o(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public boolean p(Context context, BluetoothProfile.ServiceListener serviceListener) {
        BluetoothAdapter bluetoothAdapter = this.f18901h;
        if (bluetoothAdapter == null) {
            return false;
        }
        return bluetoothAdapter.getProfileProxy(context, serviceListener, 1);
    }

    public final e q() {
        hv.a.f();
        return this.f18899f;
    }

    public final boolean r() {
        if (k()) {
            return hv.a.o("AppRtcBluetoothMgr", this.f18895a, this.f18902i, this.f18903j);
        }
        AudioManager audioManager = this.f18896c;
        if (audioManager != null) {
            return hv.a.l(audioManager, true);
        }
        return false;
    }

    public boolean s() {
        return q() == e.SCO_CONNECTED || q() == e.SCO_CONNECTING || q() == e.HEADSET_AVAILABLE;
    }

    public boolean t() {
        return q() == e.SCO_CONNECTED;
    }

    public final boolean u() {
        AudioManager audioManager = this.f18896c;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothScoOn();
    }

    public final void v() {
        Log.d("AppRtcBluetoothMgr", "bluetoothState=" + this.f18899f);
        AudioManager audioManager = this.f18896c;
        if (audioManager != null) {
            hv.a.r("AppRtcBluetoothMgr", audioManager);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            BluetoothAdapter bluetoothAdapter = this.f18901h;
            if (bluetoothAdapter != null && defaultAdapter != bluetoothAdapter) {
                Log.d("AppRtcBluetoothMgr", "Cached adapter different that default BluetoothAdapter!");
            }
        } else {
            Log.d("AppRtcBluetoothMgr", "Default BluetoothAdapter unavailable!");
        }
        if (Build.VERSION.SDK_INT >= 31 && !hv.a.n(this.f18895a, "android.permission.BLUETOOTH_CONNECT")) {
            Log.d("AppRtcBluetoothMgr", "logBluetoothStatus: BLUETOOTH_CONNECT not granted!");
            return;
        }
        BluetoothHeadset bluetoothHeadset = this.f18902i;
        if (bluetoothHeadset != null) {
            hv.a.s("AppRtcBluetoothMgr", this.f18895a, bluetoothHeadset);
        } else {
            Log.d("AppRtcBluetoothMgr", "No headset connected.");
        }
    }

    public final void w() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected");
        if (this.f18899f == e.SCO_CONNECTED) {
            Log.d("AppRtcBluetoothMgr", "onHeadsetAudioConnected: Audio already connected. state=" + this.f18899f);
            return;
        }
        l();
        if (this.f18899f != e.SCO_CONNECTING) {
            Log.w("AppRtcBluetoothMgr", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
            return;
        }
        Log.d("AppRtcBluetoothMgr", "+++ Bluetooth audio SCO is now connected");
        this.f18898e = 0;
        N();
    }

    public final void x() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetAudioDisconnected");
        m(e.HEADSET_AVAILABLE);
        this.f18898e = 0;
        N();
    }

    public final void y() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetConnected");
        this.f18898e = 0;
        N();
    }

    public final void z() {
        Log.d("AppRtcBluetoothMgr", "onHeadsetDisconnected");
        K();
        N();
    }
}
