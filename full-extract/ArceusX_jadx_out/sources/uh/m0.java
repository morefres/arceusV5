package uh;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f32918a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f32919c;

    /* renamed from: d, reason: collision with root package name */
    public String f32920d;

    /* renamed from: e, reason: collision with root package name */
    public String f32921e;

    /* renamed from: f, reason: collision with root package name */
    public String f32922f;

    /* renamed from: g, reason: collision with root package name */
    public long f32923g;

    /* renamed from: h, reason: collision with root package name */
    public String f32924h;

    /* renamed from: i, reason: collision with root package name */
    public String f32925i;

    /* renamed from: j, reason: collision with root package name */
    public String f32926j;

    /* renamed from: k, reason: collision with root package name */
    public String f32927k;

    /* renamed from: l, reason: collision with root package name */
    public String f32928l;

    /* renamed from: m, reason: collision with root package name */
    public String f32929m;

    /* renamed from: n, reason: collision with root package name */
    public String f32930n;

    /* renamed from: o, reason: collision with root package name */
    public String f32931o;

    /* renamed from: p, reason: collision with root package name */
    public String f32932p;

    /* renamed from: q, reason: collision with root package name */
    public long f32933q;

    /* renamed from: r, reason: collision with root package name */
    public String f32934r;

    public m0(Bundle bundle) {
        this.f32918a = 0;
        this.b = 0L;
        this.f32919c = 0L;
        this.f32920d = "";
        this.f32921e = "";
        this.f32922f = "";
        this.f32923g = 0L;
        this.f32924h = "";
        this.f32925i = "";
        this.f32926j = "";
        this.f32927k = "";
        this.f32928l = "";
        this.f32929m = "";
        this.f32930n = "";
        this.f32931o = "";
        this.f32932p = "";
        this.f32933q = 0L;
        this.f32934r = "";
        this.f32919c = bundle.getLong("roblox_placeId", 0L);
        this.f32920d = bundle.getString("roblox_accessCode");
        this.f32921e = bundle.getString("roblox_linkCode");
        this.f32922f = bundle.getString("roblox_gameId");
        this.b = bundle.getLong("roblox_userId", 0L);
        this.f32923g = bundle.getLong("roblox_conversationId", 0L);
        this.f32924h = bundle.getString("roblox_reservedServerAccessCode");
        this.f32925i = bundle.getString("roblox_callId");
        this.f32918a = bundle.getInt("roblox_joinRequestType", -1);
        this.f32926j = bundle.getString("roblox_referralPage");
        this.f32927k = bundle.getString("roblox_launchData");
        this.f32930n = bundle.getString("roblox_joinAttemptId");
        this.f32931o = bundle.getString("roblox_joinAttemptOrigin");
        this.f32932p = bundle.getString("roblox_isoContext");
        if (rh.h.a().Z2()) {
            this.f32933q = bundle.getLong("roblox_referredByPlayerId", 0L);
        }
        this.f32928l = bundle.getString("roblox_gameJoinContext");
        this.f32929m = bundle.getString("roblox_event_id");
        this.f32934r = bundle.getString("game_id_to_exclude");
    }
}
