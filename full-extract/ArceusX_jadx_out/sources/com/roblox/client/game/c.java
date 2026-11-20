package com.roblox.client.game;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.d;
import com.roblox.client.game.ExperienceSession;
import e4.q;
import java.util.concurrent.Executors;
import rg.a1;
import uh.k0;
import uh.u0;

/* loaded from: classes2.dex */
public class c {
    public ExperienceSession b;

    /* renamed from: a, reason: collision with root package name */
    public b f9156a = b.GAME_STATE_NONE;

    /* renamed from: c, reason: collision with root package name */
    public long f9157c = 0;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f9158a;
        public final /* synthetic */ k0 b;

        public a(Activity activity, k0 k0Var) {
            this.f9158a = activity;
            this.b = k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager l12 = ((q) this.f9158a).l1();
            androidx.fragment.app.c n02 = ((q) this.f9158a).l1().n0(ph.a.class.getName());
            if (n02 == null || l12.U0()) {
                ek.q.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
            } else {
                h r8 = l12.r();
                r8.m(n02);
                r8.g();
            }
            if (c.this.b != null || l12.U0()) {
                ek.q.e("GameManager", "Gaming protocol is trying to send launch request when game is running.");
                return;
            }
            ExperienceSession e10 = c.this.e(this.f9158a, this.b);
            c.this.b = e10;
            e10.l0((ExperienceSession.d) this.f9158a);
            e10.p0();
        }
    }

    public enum b {
        GAME_STATE_NONE,
        GAME_STATE_STARTED,
        GAME_STATE_ENDED
    }

    public final ExperienceSession e(Context context, k0 k0Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("roblox_placeId", k0Var.p());
        bundle.putLong("roblox_userId", k0Var.u());
        bundle.putLong("roblox_conversationId", k0Var.f());
        bundle.putString("roblox_accessCode", k0Var.d());
        bundle.putString("roblox_linkCode", k0Var.o());
        bundle.putString("roblox_gameId", k0Var.h());
        bundle.putString("roblox_reservedServerAccessCode", k0Var.t());
        bundle.putString("roblox_callId", k0Var.e());
        bundle.putInt("roblox_joinRequestType", k0Var.s());
        bundle.putString("roblox_referralPage", k0Var.q());
        bundle.putString("roblox_launchData", k0Var.n());
        bundle.putString("roblox_joinAttemptId", k0Var.l());
        bundle.putString("roblox_joinAttemptOrigin", k0Var.m());
        bundle.putString("roblox_isoContext", k0Var.k());
        if (rh.h.a().Z2()) {
            bundle.putLong("roblox_referredByPlayerId", k0Var.r());
        }
        bundle.putString("roblox_gameJoinContext", k0Var.j());
        bundle.putString("roblox_event_id", k0Var.g());
        if (rh.h.a().A3()) {
            bundle.putString("game_id_to_exclude", k0Var.i());
        }
        return new ExperienceSession(bundle);
    }

    public boolean f() {
        if (!d.e().f()) {
            return true;
        }
        ek.q.h("GameManager", "canStartGame = false: Upgrade required");
        return false;
    }

    public void g(boolean z10) {
        ek.q.b("GameManager", "endGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.F(true);
        } else {
            ek.q.e("GameManager", "Error: Try to end but no game session exists.");
        }
    }

    public boolean h() {
        return this.f9156a == b.GAME_STATE_ENDED;
    }

    public boolean i() {
        return this.f9156a == b.GAME_STATE_STARTED;
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void j(Activity activity, k0 k0Var) {
        if (k0Var == null) {
            ek.q.k("GameManager", "launchGameWithParams: game-params is null. Just close this activity!");
            return;
        }
        ek.q.h("GameManager", "launchGameWithParams: Start game activity for placeId = " + k0Var.p());
        a1.U(activity).edit().remove("ROBLOXCrash").apply();
        activity.runOnUiThread(new a(activity, k0Var));
        this.f9157c = System.currentTimeMillis();
        m();
    }

    public void l(Context context) {
        ek.q.b("GameManager", "onGameEnded:");
        this.f9156a = b.GAME_STATE_ENDED;
        this.b = null;
        o();
    }

    public void m() {
        ek.q.b("GameManager", "onGameStarted:");
        this.f9157c = System.currentTimeMillis();
        this.f9156a = b.GAME_STATE_STARTED;
    }

    public void n() {
        ek.q.b("GameManager", "pauseGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.c0();
        } else {
            ek.q.e("GameManager", "Error: Try to pause but no game session exists.");
        }
    }

    public void o() {
        long currentTimeMillis = System.currentTimeMillis() - this.f9157c;
        ek.q.h("GameManager", "Game duration: " + currentTimeMillis + "ms.");
        wg.a.e().m(currentTimeMillis);
    }

    public void p() {
        ek.q.b("GameManager", "resumeGameSession");
        ExperienceSession experienceSession = this.b;
        if (experienceSession != null) {
            experienceSession.h0();
        } else {
            ek.q.e("GameManager", "Error: Try to resume but no game session exists.");
        }
    }

    public void q(final Activity activity, final k0 k0Var, int i10) {
        if (!f()) {
            ek.q.h("GameManager", "Game launch halted - Can't start game.");
            return;
        }
        ek.q.b("GameManager", "startGameForResult: requestCode = " + i10);
        ((ActivityNativeMain) activity).r3(u0.EXPERIENCE);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: uh.l0
                @Override // java.lang.Runnable
                public final void run() {
                    com.roblox.client.game.c.this.j(activity, k0Var);
                }
            });
        } else {
            j(activity, k0Var);
        }
    }
}
