.class public Lrg/d0;
.super Lrg/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/d0$d;
    }
.end annotation


# instance fields
.field public H0:Lrg/d0$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lrg/x0;-><init>()V

    return-void
.end method

.method public static bridge synthetic A2(Lrg/d0;)Lrg/d0$d;
    .locals 0

    iget-object p0, p0, Lrg/d0;->H0:Lrg/d0$d;

    return-object p0
.end method


# virtual methods
.method public B2(Lrg/d0$d;)V
    .locals 0

    iput-object p1, p0, Lrg/d0;->H0:Lrg/d0$d;

    return-void
.end method

.method public c1()V
    .locals 1

    invoke-super {p0}, Lrg/x0;->c1()V

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lev/c;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public d1()V
    .locals 1

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lev/c;->p(Ljava/lang/Object;)V

    invoke-super {p0}, Lrg/x0;->d1()V

    return-void
.end method

.method public k2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v0, Lrg/q0;->g:I

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lrg/q0;->f:I

    new-instance v1, Lrg/d0$c;

    invoke-direct {v1, p0}, Lrg/d0$c;-><init>(Lrg/d0;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lrg/q0;->r:I

    new-instance v1, Lrg/d0$b;

    invoke-direct {v1, p0}, Lrg/d0$b;-><init>(Lrg/d0;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lrg/d0$a;

    invoke-direct {v0, p0}, Lrg/d0$a;-><init>(Lrg/d0;)V

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onNavigatToFeatureEvent(Loh/g;)V
    .locals 0
    .annotation runtime Lev/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Le4/k;->i2()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
