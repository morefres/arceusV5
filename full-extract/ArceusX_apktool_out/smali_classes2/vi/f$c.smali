.class public Lvi/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/f;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvi/f;


# direct methods
.method public constructor <init>(Lvi/f;)V
    .locals 0

    iput-object p1, p0, Lvi/f$c;->a:Lvi/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "... onFocusChange: hasFocus = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SearchMenuOption"

    invoke-static {v0, p1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-nez p2, :cond_1

    iget-object p1, p0, Lvi/f$c;->a:Lvi/f;

    invoke-static {p1}, Lvi/f;->a(Lvi/f;)Landroidx/fragment/app/c;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvi/f$c;->a:Lvi/f;

    invoke-static {p1}, Lvi/f;->a(Lvi/f;)Landroidx/fragment/app/c;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    invoke-static {p1}, Lrg/e2;->h(Landroid/app/Activity;)V

    :cond_0
    iget-object p1, p0, Lvi/f$c;->a:Lvi/f;

    invoke-static {p1}, Lvi/f;->e(Lvi/f;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->collapseActionView()Z

    :cond_1
    return-void
.end method
