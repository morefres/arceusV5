package com.roblox.client.startup;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.roblox.client.startup.d;
import ek.q;
import rg.q0;

/* loaded from: classes2.dex */
public class d {

    public interface a {
        void a();
    }

    public static /* synthetic */ void b(a aVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        aVar.a();
    }

    public void c(Context context, final a aVar) {
        q.h("LeaveAppHelper", "show: Leave-App dialog");
        new AlertDialog.Builder(context).setMessage(q0.f30455e).setPositiveButton(q0.f30452d, new DialogInterface.OnClickListener() { // from class: yj.p0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.roblox.client.startup.d.b(d.a.this, dialogInterface, i10);
            }
        }).setNegativeButton(q0.f30494r, new DialogInterface.OnClickListener() { // from class: yj.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }).setCancelable(true).create().show();
    }
}
