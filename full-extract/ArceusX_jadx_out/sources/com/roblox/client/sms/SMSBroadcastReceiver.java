package com.roblox.client.sms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import ek.q;
import ev.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oh.j;
import rg.w0;

/* loaded from: classes2.dex */
public class SMSBroadcastReceiver extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f9444a = Pattern.compile("(\\d{6})");

    @Override // rg.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            q.h("SMSBroadcastReceiver", "Status: " + status);
            int x32 = status.x3();
            if (x32 != 0) {
                if (x32 != 15) {
                    return;
                }
                q.h("SMSBroadcastReceiver", "Timeout");
                return;
            }
            String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            q.h("SMSBroadcastReceiver", "Message: " + str);
            if (TextUtils.isEmpty(str)) {
                q.h("SMSBroadcastReceiver", "Wrong format. Message: " + str);
                return;
            }
            Matcher matcher = this.f9444a.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(0);
                if (TextUtils.isEmpty(group) || group.length() != 6) {
                    return;
                }
                q.h("SMSBroadcastReceiver", "code: " + group);
                c.d().j(new j(group));
            }
        }
    }
}
