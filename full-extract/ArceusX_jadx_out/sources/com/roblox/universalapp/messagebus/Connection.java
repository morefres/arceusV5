package com.roblox.universalapp.messagebus;

/* loaded from: classes2.dex */
public class Connection {

    /* renamed from: a, reason: collision with root package name */
    public long f9856a;

    public Connection(long j10) {
        this.f9856a = j10;
    }

    private native void deleteSharedPtr(long j10);

    private native boolean isConnected(long j10);

    public void a() {
        deleteSharedPtr(this.f9856a);
    }

    public void finalize() {
        deleteSharedPtr(this.f9856a);
    }
}
