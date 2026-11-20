.class public Ldh/f$d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldh/f;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldh/f;


# direct methods
.method public constructor <init>(Ldh/f;)V
    .locals 0

    iput-object p1, p0, Ldh/f$d;->a:Ldh/f;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Ldh/f$d;->a:Ldh/f;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ldh/f;->d(Ldh/f;Z)V

    iget-object p1, p0, Ldh/f$d;->a:Ldh/f;

    invoke-static {p1}, Ldh/f;->e(Ldh/f;)V

    return-void
.end method
