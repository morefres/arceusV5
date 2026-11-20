package ph;

import com.roblox.client.feature.FeatureState;
import ek.q;
import ti.h;
import uh.f;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f28642a = "rbx.appshell";
    public d b;

    /* renamed from: c, reason: collision with root package name */
    public int f28643c;

    public a(d dVar, int i10) {
        this.b = dVar;
        this.f28643c = i10;
    }

    public mk.c a(String str) {
        return new mk.d(str);
    }

    public mk.b b(long j10) {
        return new mk.b("AppShellNotifications", Long.toString(j10), "StartConversationWithId", "Chat");
    }

    public mk.b c(long j10) {
        return new mk.b("AppShellNotifications", Long.toString(j10), "StartConversationWithUserId", "Chat");
    }

    public uh.a d() {
        androidx.fragment.app.c r8 = this.b.r(e());
        if (r8 instanceof uh.a) {
            return (uh.a) r8;
        }
        return null;
    }

    public final String e() {
        return a.class.getName();
    }

    public boolean f() {
        f.j().r();
        return true;
    }

    public void g(FeatureState featureState) {
        uh.a d10 = d();
        if (d10 == null) {
            q.h("rbx.appshell", "onShow: Create a GL fragment for LuaApp...");
            d10 = new uh.a();
        }
        q.b("rbx.appshell", "onShow: ... state = " + featureState.getName() + ", IsLoggedIn = " + h.e().f());
        if (h.e().f()) {
            i(featureState);
        }
        this.b.E(this.f28643c, d10, e());
    }

    public void h(mk.c cVar) {
        f.j().A(cVar);
    }

    public void i(FeatureState featureState) {
        if (!featureState.getName().equals("CHAT_TAG")) {
            if (featureState.getName().equals("AVATAR_EDITOR_TAG")) {
                q.h("rbx.appshell", "sendAppEvents() start avatar");
                h(a("AvatarEditor"));
                return;
            } else if (featureState.getName().equals("HOME_TAG")) {
                q.h("rbx.appshell", "sendAppEvents() start home");
                h(a("Home"));
                return;
            } else {
                if (featureState.getName().equals("GAMES_TAG")) {
                    q.h("rbx.appshell", "sendAppEvents() start games");
                    h(a("Games"));
                    return;
                }
                return;
            }
        }
        q.h("rbx.appshell", "sendAppEvents() start chat");
        h(a("Chat"));
        long f10 = featureState.f("USER_ID_EXTRA", -1L);
        long f11 = featureState.f("CHAT_CONVERSATION_ID", -1L);
        if (f10 != -1) {
            q.h("rbx.appshell", "sendAppEvents() userId:" + f10);
            j(c(f10));
            return;
        }
        if (f11 != -1) {
            q.h("rbx.appshell", "sendAppEvents() conversationId:" + f11);
            j(b(f11));
        }
    }

    public void j(mk.b bVar) {
        f.j().C(bVar);
    }
}
