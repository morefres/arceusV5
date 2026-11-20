package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import rg.m0;
import rg.n0;

/* loaded from: classes2.dex */
public class LoadingBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<ImageView> f9036a;
    public boolean b;

    public class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f9037a;
        public b b;

        public void a(ImageView imageView) {
            this.f9037a = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f9037a.startAnimation(LoadingBar.this.d(this.b));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public a() {
        }
    }

    public class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f9039a;
        public a b;

        public void a(ImageView imageView) {
            this.f9039a = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f9039a.startAnimation(LoadingBar.this.c(this.b));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public b() {
        }
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9036a = new ArrayList<>(3);
        e();
    }

    public final AlphaAnimation c(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    public final AlphaAnimation d(Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setAnimationListener(animationListener);
        return alphaAnimation;
    }

    public final void e() {
        View.inflate(getContext(), n0.f30422q, this);
        this.f9036a.add((ImageView) findViewById(m0.f30391t));
        this.f9036a.add((ImageView) findViewById(m0.f30393u));
        this.f9036a.add((ImageView) findViewById(m0.f30395v));
    }

    public final void f() {
        int size = this.f9036a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageView imageView = this.f9036a.get(i10);
            b bVar = new b();
            a aVar = new a();
            aVar.a(imageView);
            aVar.b = bVar;
            bVar.b = aVar;
            bVar.a(imageView);
            AlphaAnimation d10 = d(bVar);
            d10.setStartOffset(i10 * 400);
            imageView.startAnimation(d10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.b) {
            return;
        }
        this.b = true;
        f();
    }
}
