package uh;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public long f32897a = 0;
    public long b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f32898c = 0;

    /* renamed from: d, reason: collision with root package name */
    public String f32899d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f32900e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f32901f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f32902g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f32903h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f32904i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f32905j = -1;

    /* renamed from: k, reason: collision with root package name */
    public String f32906k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f32907l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f32908m = "";

    /* renamed from: n, reason: collision with root package name */
    public String f32909n = "";

    /* renamed from: o, reason: collision with root package name */
    public String f32910o = "";

    /* renamed from: p, reason: collision with root package name */
    public String f32911p = "";

    /* renamed from: q, reason: collision with root package name */
    public long f32912q = 0;

    /* renamed from: r, reason: collision with root package name */
    public String f32913r = "";

    public static Bundle N(Bundle bundle, k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("mPlaceId", k0Var.p());
        bundle.putLong("mUserId", k0Var.u());
        bundle.putLong("mConversationId", k0Var.f());
        bundle.putString("mAccessCode", k0Var.d());
        bundle.putString("mLinkCode", k0Var.o());
        bundle.putString("mGameId", k0Var.h());
        bundle.putInt("mRequestType", k0Var.s());
        bundle.putString("mReferralPage", k0Var.q());
        bundle.putString("mLaunchData", k0Var.n());
        bundle.putString("mJoinAttemptId", k0Var.l());
        bundle.putString("mJoinAttemptOrigin", k0Var.m());
        bundle.putString("mIsoContext", k0Var.k());
        if (rh.h.a().Z2()) {
            bundle.putLong("mReferredByPlayerId", k0Var.r());
        }
        if (rh.h.a().G0()) {
            bundle.putString("mReservedServerAccessCode", k0Var.t());
            bundle.putString("mCallId", k0Var.e());
        }
        bundle.putString("mGameJoinContext", k0Var.j());
        bundle.putString("roblox_event_id", k0Var.g());
        if (rh.h.a().A3()) {
            bundle.putString("game_id_to_exclude", k0Var.i());
        }
        return bundle;
    }

    public static Bundle O(k0 k0Var) {
        return N(null, k0Var);
    }

    public static k0 a(Long l10, Long l11, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l12, String str13) {
        int i10;
        k0 k0Var = new k0();
        long longValue = l10 != null ? l10.longValue() : -1L;
        long longValue2 = l11 != null ? l11.longValue() : -1L;
        long longValue3 = l12 != null ? l12.longValue() : -1L;
        if (longValue2 != -1) {
            k0Var.M(longValue2);
            if (longValue != -1) {
                k0Var.H(longValue);
            }
            i10 = 1;
        } else if (longValue != -1) {
            k0Var.H(longValue);
            if (str2 != null) {
                k0Var.G(str2);
            } else if (str != null) {
                k0Var.v(str);
            } else {
                if (str3 != null) {
                    k0Var.z(str3);
                    i10 = 3;
                } else if (!rh.h.a().G0() || str4 == null) {
                    i10 = 0;
                } else {
                    k0Var.L(str4);
                    i10 = 8;
                }
                if (rh.h.a().G0() && str5 != null) {
                    k0Var.w(str5);
                }
            }
            i10 = 2;
            if (rh.h.a().G0()) {
                k0Var.w(str5);
            }
        } else {
            i10 = -1;
        }
        if (num != null) {
            k0Var.K(num.intValue());
        } else {
            k0Var.K(i10);
        }
        if (str6 != null) {
            k0Var.I(str6);
        }
        if (str7 != null) {
            k0Var.F(str7);
        }
        if (rh.h.a().Z2() && longValue3 != -1) {
            k0Var.J(longValue3);
        }
        if (str8 != null) {
            k0Var.B(str8);
        }
        if (str9 != null) {
            k0Var.y(str9);
        }
        if (str10 != null) {
            k0Var.D(str10);
        }
        if (str11 != null) {
            k0Var.E(str11);
        }
        if (str12 != null) {
            k0Var.C(str12);
        }
        if (rh.h.a().A3() && str13 != null) {
            k0Var.A(str13);
        }
        return k0Var;
    }

    public static k0 b(Long l10, Long l11, String str, String str2, String str3) {
        k0 k0Var = new k0();
        long longValue = l10 != null ? l10.longValue() : -1L;
        long longValue2 = l11 != null ? l11.longValue() : -1L;
        if (longValue != -1 && longValue2 != -1) {
            k0Var.x(longValue2);
            k0Var.H(longValue);
            k0Var.K(6);
        }
        if (str != null) {
            k0Var.I(str);
        }
        if (str2 != null) {
            k0Var.D(str2);
        }
        if (str3 != null) {
            k0Var.E(str3);
        }
        return k0Var;
    }

    public static k0 c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        k0 k0Var = new k0();
        k0Var.H(bundle.getLong("mPlaceId", 0L));
        k0Var.M(bundle.getLong("mUserId", 0L));
        k0Var.x(bundle.getLong("mConversationId", 0L));
        k0Var.v(bundle.getString("mAccessCode", ""));
        k0Var.G(bundle.getString("mLinkCode", ""));
        k0Var.z(bundle.getString("mGameId", ""));
        k0Var.K(bundle.getInt("mRequestType", -1));
        k0Var.I(bundle.getString("mReferralPage", ""));
        k0Var.F(bundle.getString("mLaunchData"));
        k0Var.D(bundle.getString("mJoinAttemptId", ""));
        k0Var.E(bundle.getString("mJoinAttemptOrigin", ""));
        k0Var.C(bundle.getString("mIsoContext", ""));
        k0Var.B(bundle.getString("mGameJoinContext"));
        k0Var.y(bundle.getString("roblox_event_id"));
        if (rh.h.a().Z2()) {
            k0Var.J(bundle.getLong("mReferredByPlayerId", 0L));
        }
        if (rh.h.a().G0()) {
            k0Var.L(bundle.getString("mReservedServerAccessCode", ""));
            k0Var.w(bundle.getString("mCallId", ""));
        }
        if (rh.h.a().A3()) {
            k0Var.A(bundle.getString("game_id_to_exclude", ""));
        }
        return k0Var;
    }

    public void A(String str) {
        this.f32913r = str;
    }

    public void B(String str) {
        this.f32907l = str;
    }

    public void C(@NonNull String str) {
        this.f32911p = str;
    }

    public void D(String str) {
        this.f32909n = str;
    }

    public void E(String str) {
        this.f32910o = str;
    }

    public void F(String str) {
        this.f32906k = str;
    }

    public void G(String str) {
        this.f32900e = str;
    }

    public void H(long j10) {
        this.f32897a = j10;
    }

    public void I(String str) {
        this.f32904i = str;
    }

    public void J(long j10) {
        this.f32912q = j10;
    }

    public void K(int i10) {
        this.f32905j = i10;
    }

    public void L(String str) {
        this.f32902g = str;
    }

    public void M(long j10) {
        this.b = j10;
    }

    public String d() {
        return this.f32899d;
    }

    public String e() {
        return this.f32903h;
    }

    public long f() {
        return this.f32898c;
    }

    public String g() {
        return this.f32908m;
    }

    public String h() {
        return this.f32901f;
    }

    public String i() {
        return this.f32913r;
    }

    public String j() {
        return this.f32907l;
    }

    public String k() {
        return this.f32911p;
    }

    public String l() {
        return this.f32909n;
    }

    public String m() {
        return this.f32910o;
    }

    public String n() {
        return this.f32906k;
    }

    public String o() {
        return this.f32900e;
    }

    public long p() {
        return this.f32897a;
    }

    public String q() {
        return this.f32904i;
    }

    public long r() {
        return this.f32912q;
    }

    public int s() {
        return this.f32905j;
    }

    public String t() {
        return this.f32902g;
    }

    public String toString() {
        return getClass().getSimpleName() + "{ placeId:" + this.f32897a + ", userId:" + this.b + ", conversationId:" + this.f32898c + ", accessCode:" + this.f32899d + ", linkCode:" + this.f32900e + ", gameId:" + this.f32901f + ", reservedServerAccessCode:" + this.f32902g + ", callId:" + this.f32903h + ", reqType:" + this.f32905j + ", referralPage:" + this.f32904i + ", launchData:" + this.f32906k + ", gameJoinContext:" + this.f32907l + ", eventId:" + this.f32908m + ", joinAttemptId:" + this.f32909n + ", joinAttemptOrigin:" + this.f32910o + ", mIsoContext:" + this.f32911p + ", referredByPlayerId:" + this.f32912q + ", gameIdToExclude:" + this.f32913r + " }";
    }

    public long u() {
        return this.b;
    }

    public void v(String str) {
        this.f32899d = str;
    }

    public void w(String str) {
        this.f32903h = str;
    }

    public void x(long j10) {
        this.f32898c = j10;
    }

    public void y(String str) {
        this.f32908m = str;
    }

    public void z(String str) {
        this.f32901f = str;
    }
}
