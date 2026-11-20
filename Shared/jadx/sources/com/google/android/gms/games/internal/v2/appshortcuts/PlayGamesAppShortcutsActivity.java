package com.google.android.gms.games.internal.v2.appshortcuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity;
import fb.w0;

/* loaded from: classes.dex */
public final class PlayGamesAppShortcutsActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public Intent f6234a;

    public final /* synthetic */ void a() {
        startActivityForResult(this.f6234a, 1005000001);
        finish();
        System.exit(0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, @NonNull Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 1005000000) {
            return;
        }
        if (i11 != -1) {
            finish();
        } else {
            new w0(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ka.u
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    PlayGamesAppShortcutsActivity.this.a();
                }
            }, 50L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048 A[SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.games.internal.v2.appshortcuts.PlayGamesAppShortcutsActivity.onCreate(android.os.Bundle):void");
    }
}
