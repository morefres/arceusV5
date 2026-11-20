package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.m0;
import v7.j1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f5150a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public String f5151c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5152a;
        public int b = 0;

        /* renamed from: c, reason: collision with root package name */
        public String f5153c = "";

        public /* synthetic */ a(j1 j1Var) {
        }

        @NonNull
        public d a() {
            d dVar = new d();
            dVar.f5150a = this.f5152a;
            dVar.b = this.b;
            dVar.f5151c = this.f5153c;
            return dVar;
        }

        @NonNull
        public a b(@NonNull String str) {
            this.f5153c = str;
            return this;
        }

        @NonNull
        public a c(int i10) {
            this.b = i10;
            return this;
        }

        @NonNull
        public a d(int i10) {
            this.f5152a = i10;
            return this;
        }
    }

    @NonNull
    public static a d() {
        return new a(null);
    }

    @NonNull
    public String a() {
        return this.f5151c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f5150a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + m0.j(this.f5150a) + ", Debug Message: " + this.f5151c;
    }
}
