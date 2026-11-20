package com.roblox.protocols.systemdialogplatforminterface.generated;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public final class SystemDialogContext {
    final boolean dismissed;

    /* renamed from: id, reason: collision with root package name */
    final long f9781id;

    public SystemDialogContext(long j10, boolean z10) {
        this.f9781id = j10;
        this.dismissed = z10;
    }

    public boolean getDismissed() {
        return this.dismissed;
    }

    public long getId() {
        return this.f9781id;
    }

    public String toString() {
        return "SystemDialogContext{id=" + this.f9781id + ",dismissed=" + this.dismissed + "}";
    }
}
