package j9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f21588a;
    public DialogInterface.OnCancelListener b;

    /* renamed from: c, reason: collision with root package name */
    public Dialog f21589c;

    @NonNull
    public static b a(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) n9.m.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f21588a = dialog2;
        if (onCancelListener != null) {
            bVar.b = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21588a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f21589c == null) {
            this.f21589c = new AlertDialog.Builder((Context) n9.m.l(getActivity())).create();
        }
        return this.f21589c;
    }

    @Override // android.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
