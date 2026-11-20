package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public final class RGBA {

    /* renamed from: a, reason: collision with root package name */
    final double f9747a;
    final double b;

    /* renamed from: g, reason: collision with root package name */
    final double f9748g;

    /* renamed from: r, reason: collision with root package name */
    final double f9749r;

    public RGBA(double d10, double d11, double d12, double d13) {
        this.f9749r = d10;
        this.f9748g = d11;
        this.b = d12;
        this.f9747a = d13;
    }

    public double getA() {
        return this.f9747a;
    }

    public double getB() {
        return this.b;
    }

    public double getG() {
        return this.f9748g;
    }

    public double getR() {
        return this.f9749r;
    }

    public String toString() {
        return "RGBA{r=" + this.f9749r + ",g=" + this.f9748g + ",b=" + this.b + ",a=" + this.f9747a + "}";
    }
}
